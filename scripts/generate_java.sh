#!/usr/bin/env bash

SCRIPTS_DIR=$(dirname "$0")
source $SCRIPTS_DIR/common.sh

echo "generate java code..."

KVPROTO_ROOT="$SCRIPTS_DIR/.."
GRPC_INCLUDE=.:../include

cd $KVPROTO_ROOT
rm -rf proto-java && mkdir -p proto-java
rm -rf java/kvproto && mkdir -p java/kvproto

cp proto/* proto-java/

sed_inplace '/gogo.proto/d' proto-java/*
sed_inplace '/option\ *(gogoproto/d' proto-java/*
sed_inplace -e 's/\[.*gogoproto.*\]//g' proto-java/*

PROTOC_GEN_GRPC_JAVA=`realpath ./scripts/protoc-gen-grpc-java`
push proto-java
protoc -I${GRPC_INCLUDE} --java_out ../java/kvproto *.proto || exit $?
protoc -I${GRPC_INCLUDE} --grpc_out ../java/kvproto --plugin=protoc-gen-grpc=${PROTOC_GEN_GRPC_JAVA} *.proto || exit $?
pop

push include
protoc -I${GRPC_INCLUDE} --java_out ../java/kvproto *.proto google/api/http.proto google/api/annotations.proto || exit $?
pop

rm -rf proto-java
