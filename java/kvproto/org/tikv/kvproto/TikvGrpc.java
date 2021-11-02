package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Key/value store API for TiKV.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: tikvpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TikvGrpc {

  private TikvGrpc() {}

  public static final String SERVICE_NAME = "tikvpb.Tikv";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GetRequest,
      org.tikv.kvproto.Kvrpcpb.GetResponse> getKvGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvGet",
      requestType = org.tikv.kvproto.Kvrpcpb.GetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GetRequest,
      org.tikv.kvproto.Kvrpcpb.GetResponse> getKvGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GetRequest, org.tikv.kvproto.Kvrpcpb.GetResponse> getKvGetMethod;
    if ((getKvGetMethod = TikvGrpc.getKvGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvGetMethod = TikvGrpc.getKvGetMethod) == null) {
          TikvGrpc.getKvGetMethod = getKvGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.GetRequest, org.tikv.kvproto.Kvrpcpb.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvGet"))
              .build();
        }
      }
    }
    return getKvGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanRequest,
      org.tikv.kvproto.Kvrpcpb.ScanResponse> getKvScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvScan",
      requestType = org.tikv.kvproto.Kvrpcpb.ScanRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.ScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanRequest,
      org.tikv.kvproto.Kvrpcpb.ScanResponse> getKvScanMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanRequest, org.tikv.kvproto.Kvrpcpb.ScanResponse> getKvScanMethod;
    if ((getKvScanMethod = TikvGrpc.getKvScanMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvScanMethod = TikvGrpc.getKvScanMethod) == null) {
          TikvGrpc.getKvScanMethod = getKvScanMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.ScanRequest, org.tikv.kvproto.Kvrpcpb.ScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvScan"))
              .build();
        }
      }
    }
    return getKvScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PrewriteRequest,
      org.tikv.kvproto.Kvrpcpb.PrewriteResponse> getKvPrewriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvPrewrite",
      requestType = org.tikv.kvproto.Kvrpcpb.PrewriteRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.PrewriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PrewriteRequest,
      org.tikv.kvproto.Kvrpcpb.PrewriteResponse> getKvPrewriteMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PrewriteRequest, org.tikv.kvproto.Kvrpcpb.PrewriteResponse> getKvPrewriteMethod;
    if ((getKvPrewriteMethod = TikvGrpc.getKvPrewriteMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvPrewriteMethod = TikvGrpc.getKvPrewriteMethod) == null) {
          TikvGrpc.getKvPrewriteMethod = getKvPrewriteMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.PrewriteRequest, org.tikv.kvproto.Kvrpcpb.PrewriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvPrewrite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PrewriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PrewriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvPrewrite"))
              .build();
        }
      }
    }
    return getKvPrewriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest,
      org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> getKvPessimisticLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvPessimisticLock",
      requestType = org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest,
      org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> getKvPessimisticLockMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest, org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> getKvPessimisticLockMethod;
    if ((getKvPessimisticLockMethod = TikvGrpc.getKvPessimisticLockMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvPessimisticLockMethod = TikvGrpc.getKvPessimisticLockMethod) == null) {
          TikvGrpc.getKvPessimisticLockMethod = getKvPessimisticLockMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest, org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvPessimisticLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvPessimisticLock"))
              .build();
        }
      }
    }
    return getKvPessimisticLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest,
      org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> getKVPessimisticRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KVPessimisticRollback",
      requestType = org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest,
      org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> getKVPessimisticRollbackMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest, org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> getKVPessimisticRollbackMethod;
    if ((getKVPessimisticRollbackMethod = TikvGrpc.getKVPessimisticRollbackMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKVPessimisticRollbackMethod = TikvGrpc.getKVPessimisticRollbackMethod) == null) {
          TikvGrpc.getKVPessimisticRollbackMethod = getKVPessimisticRollbackMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest, org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KVPessimisticRollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KVPessimisticRollback"))
              .build();
        }
      }
    }
    return getKVPessimisticRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest,
      org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> getKvTxnHeartBeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvTxnHeartBeat",
      requestType = org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest,
      org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> getKvTxnHeartBeatMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest, org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> getKvTxnHeartBeatMethod;
    if ((getKvTxnHeartBeatMethod = TikvGrpc.getKvTxnHeartBeatMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvTxnHeartBeatMethod = TikvGrpc.getKvTxnHeartBeatMethod) == null) {
          TikvGrpc.getKvTxnHeartBeatMethod = getKvTxnHeartBeatMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest, org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvTxnHeartBeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvTxnHeartBeat"))
              .build();
        }
      }
    }
    return getKvTxnHeartBeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest,
      org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> getKvCheckTxnStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvCheckTxnStatus",
      requestType = org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest,
      org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> getKvCheckTxnStatusMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest, org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> getKvCheckTxnStatusMethod;
    if ((getKvCheckTxnStatusMethod = TikvGrpc.getKvCheckTxnStatusMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvCheckTxnStatusMethod = TikvGrpc.getKvCheckTxnStatusMethod) == null) {
          TikvGrpc.getKvCheckTxnStatusMethod = getKvCheckTxnStatusMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest, org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvCheckTxnStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvCheckTxnStatus"))
              .build();
        }
      }
    }
    return getKvCheckTxnStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest,
      org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> getKvCheckSecondaryLocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvCheckSecondaryLocks",
      requestType = org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest,
      org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> getKvCheckSecondaryLocksMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest, org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> getKvCheckSecondaryLocksMethod;
    if ((getKvCheckSecondaryLocksMethod = TikvGrpc.getKvCheckSecondaryLocksMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvCheckSecondaryLocksMethod = TikvGrpc.getKvCheckSecondaryLocksMethod) == null) {
          TikvGrpc.getKvCheckSecondaryLocksMethod = getKvCheckSecondaryLocksMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest, org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvCheckSecondaryLocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvCheckSecondaryLocks"))
              .build();
        }
      }
    }
    return getKvCheckSecondaryLocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CommitRequest,
      org.tikv.kvproto.Kvrpcpb.CommitResponse> getKvCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvCommit",
      requestType = org.tikv.kvproto.Kvrpcpb.CommitRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CommitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CommitRequest,
      org.tikv.kvproto.Kvrpcpb.CommitResponse> getKvCommitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CommitRequest, org.tikv.kvproto.Kvrpcpb.CommitResponse> getKvCommitMethod;
    if ((getKvCommitMethod = TikvGrpc.getKvCommitMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvCommitMethod = TikvGrpc.getKvCommitMethod) == null) {
          TikvGrpc.getKvCommitMethod = getKvCommitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CommitRequest, org.tikv.kvproto.Kvrpcpb.CommitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvCommit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CommitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvCommit"))
              .build();
        }
      }
    }
    return getKvCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ImportRequest,
      org.tikv.kvproto.Kvrpcpb.ImportResponse> getKvImportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvImport",
      requestType = org.tikv.kvproto.Kvrpcpb.ImportRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.ImportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ImportRequest,
      org.tikv.kvproto.Kvrpcpb.ImportResponse> getKvImportMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ImportRequest, org.tikv.kvproto.Kvrpcpb.ImportResponse> getKvImportMethod;
    if ((getKvImportMethod = TikvGrpc.getKvImportMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvImportMethod = TikvGrpc.getKvImportMethod) == null) {
          TikvGrpc.getKvImportMethod = getKvImportMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.ImportRequest, org.tikv.kvproto.Kvrpcpb.ImportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvImport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ImportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvImport"))
              .build();
        }
      }
    }
    return getKvImportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CleanupRequest,
      org.tikv.kvproto.Kvrpcpb.CleanupResponse> getKvCleanupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvCleanup",
      requestType = org.tikv.kvproto.Kvrpcpb.CleanupRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CleanupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CleanupRequest,
      org.tikv.kvproto.Kvrpcpb.CleanupResponse> getKvCleanupMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CleanupRequest, org.tikv.kvproto.Kvrpcpb.CleanupResponse> getKvCleanupMethod;
    if ((getKvCleanupMethod = TikvGrpc.getKvCleanupMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvCleanupMethod = TikvGrpc.getKvCleanupMethod) == null) {
          TikvGrpc.getKvCleanupMethod = getKvCleanupMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CleanupRequest, org.tikv.kvproto.Kvrpcpb.CleanupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvCleanup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CleanupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CleanupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvCleanup"))
              .build();
        }
      }
    }
    return getKvCleanupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.BatchGetResponse> getKvBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvBatchGet",
      requestType = org.tikv.kvproto.Kvrpcpb.BatchGetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.BatchGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.BatchGetResponse> getKvBatchGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchGetRequest, org.tikv.kvproto.Kvrpcpb.BatchGetResponse> getKvBatchGetMethod;
    if ((getKvBatchGetMethod = TikvGrpc.getKvBatchGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvBatchGetMethod = TikvGrpc.getKvBatchGetMethod) == null) {
          TikvGrpc.getKvBatchGetMethod = getKvBatchGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.BatchGetRequest, org.tikv.kvproto.Kvrpcpb.BatchGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvBatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.BatchGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.BatchGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvBatchGet"))
              .build();
        }
      }
    }
    return getKvBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest,
      org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> getKvBatchRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvBatchRollback",
      requestType = org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest,
      org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> getKvBatchRollbackMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest, org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> getKvBatchRollbackMethod;
    if ((getKvBatchRollbackMethod = TikvGrpc.getKvBatchRollbackMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvBatchRollbackMethod = TikvGrpc.getKvBatchRollbackMethod) == null) {
          TikvGrpc.getKvBatchRollbackMethod = getKvBatchRollbackMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest, org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvBatchRollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvBatchRollback"))
              .build();
        }
      }
    }
    return getKvBatchRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanLockRequest,
      org.tikv.kvproto.Kvrpcpb.ScanLockResponse> getKvScanLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvScanLock",
      requestType = org.tikv.kvproto.Kvrpcpb.ScanLockRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.ScanLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanLockRequest,
      org.tikv.kvproto.Kvrpcpb.ScanLockResponse> getKvScanLockMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ScanLockRequest, org.tikv.kvproto.Kvrpcpb.ScanLockResponse> getKvScanLockMethod;
    if ((getKvScanLockMethod = TikvGrpc.getKvScanLockMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvScanLockMethod = TikvGrpc.getKvScanLockMethod) == null) {
          TikvGrpc.getKvScanLockMethod = getKvScanLockMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.ScanLockRequest, org.tikv.kvproto.Kvrpcpb.ScanLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvScanLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ScanLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ScanLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvScanLock"))
              .build();
        }
      }
    }
    return getKvScanLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ResolveLockRequest,
      org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> getKvResolveLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvResolveLock",
      requestType = org.tikv.kvproto.Kvrpcpb.ResolveLockRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.ResolveLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ResolveLockRequest,
      org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> getKvResolveLockMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ResolveLockRequest, org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> getKvResolveLockMethod;
    if ((getKvResolveLockMethod = TikvGrpc.getKvResolveLockMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvResolveLockMethod = TikvGrpc.getKvResolveLockMethod) == null) {
          TikvGrpc.getKvResolveLockMethod = getKvResolveLockMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.ResolveLockRequest, org.tikv.kvproto.Kvrpcpb.ResolveLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvResolveLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ResolveLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ResolveLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvResolveLock"))
              .build();
        }
      }
    }
    return getKvResolveLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GCRequest,
      org.tikv.kvproto.Kvrpcpb.GCResponse> getKvGCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvGC",
      requestType = org.tikv.kvproto.Kvrpcpb.GCRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.GCResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GCRequest,
      org.tikv.kvproto.Kvrpcpb.GCResponse> getKvGCMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.GCRequest, org.tikv.kvproto.Kvrpcpb.GCResponse> getKvGCMethod;
    if ((getKvGCMethod = TikvGrpc.getKvGCMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvGCMethod = TikvGrpc.getKvGCMethod) == null) {
          TikvGrpc.getKvGCMethod = getKvGCMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.GCRequest, org.tikv.kvproto.Kvrpcpb.GCResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvGC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.GCRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.GCResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvGC"))
              .build();
        }
      }
    }
    return getKvGCMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> getKvDeleteRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KvDeleteRange",
      requestType = org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> getKvDeleteRangeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> getKvDeleteRangeMethod;
    if ((getKvDeleteRangeMethod = TikvGrpc.getKvDeleteRangeMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getKvDeleteRangeMethod = TikvGrpc.getKvDeleteRangeMethod) == null) {
          TikvGrpc.getKvDeleteRangeMethod = getKvDeleteRangeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KvDeleteRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("KvDeleteRange"))
              .build();
        }
      }
    }
    return getKvDeleteRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetRequest,
      org.tikv.kvproto.Kvrpcpb.RawGetResponse> getRawGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawGet",
      requestType = org.tikv.kvproto.Kvrpcpb.RawGetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetRequest,
      org.tikv.kvproto.Kvrpcpb.RawGetResponse> getRawGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetRequest, org.tikv.kvproto.Kvrpcpb.RawGetResponse> getRawGetMethod;
    if ((getRawGetMethod = TikvGrpc.getRawGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawGetMethod = TikvGrpc.getRawGetMethod) == null) {
          TikvGrpc.getRawGetMethod = getRawGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawGetRequest, org.tikv.kvproto.Kvrpcpb.RawGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawGet"))
              .build();
        }
      }
    }
    return getRawGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchGet",
      requestType = org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest, org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> getRawBatchGetMethod;
    if ((getRawBatchGetMethod = TikvGrpc.getRawBatchGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchGetMethod = TikvGrpc.getRawBatchGetMethod) == null) {
          TikvGrpc.getRawBatchGetMethod = getRawBatchGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest, org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchGet"))
              .build();
        }
      }
    }
    return getRawBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawPutRequest,
      org.tikv.kvproto.Kvrpcpb.RawPutResponse> getRawPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawPut",
      requestType = org.tikv.kvproto.Kvrpcpb.RawPutRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawPutRequest,
      org.tikv.kvproto.Kvrpcpb.RawPutResponse> getRawPutMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawPutRequest, org.tikv.kvproto.Kvrpcpb.RawPutResponse> getRawPutMethod;
    if ((getRawPutMethod = TikvGrpc.getRawPutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawPutMethod = TikvGrpc.getRawPutMethod) == null) {
          TikvGrpc.getRawPutMethod = getRawPutMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawPutRequest, org.tikv.kvproto.Kvrpcpb.RawPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawPut"))
              .build();
        }
      }
    }
    return getRawPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchPut",
      requestType = org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest, org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> getRawBatchPutMethod;
    if ((getRawBatchPutMethod = TikvGrpc.getRawBatchPutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchPutMethod = TikvGrpc.getRawBatchPutMethod) == null) {
          TikvGrpc.getRawBatchPutMethod = getRawBatchPutMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest, org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchPut"))
              .build();
        }
      }
    }
    return getRawBatchPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRequest,
      org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawDelete",
      requestType = org.tikv.kvproto.Kvrpcpb.RawDeleteRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRequest,
      org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRequest, org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> getRawDeleteMethod;
    if ((getRawDeleteMethod = TikvGrpc.getRawDeleteMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawDeleteMethod = TikvGrpc.getRawDeleteMethod) == null) {
          TikvGrpc.getRawDeleteMethod = getRawDeleteMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawDeleteRequest, org.tikv.kvproto.Kvrpcpb.RawDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawDelete"))
              .build();
        }
      }
    }
    return getRawDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchDelete",
      requestType = org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest, org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> getRawBatchDeleteMethod;
    if ((getRawBatchDeleteMethod = TikvGrpc.getRawBatchDeleteMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchDeleteMethod = TikvGrpc.getRawBatchDeleteMethod) == null) {
          TikvGrpc.getRawBatchDeleteMethod = getRawBatchDeleteMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest, org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchDelete"))
              .build();
        }
      }
    }
    return getRawBatchDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawScanRequest,
      org.tikv.kvproto.Kvrpcpb.RawScanResponse> getRawScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawScan",
      requestType = org.tikv.kvproto.Kvrpcpb.RawScanRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawScanRequest,
      org.tikv.kvproto.Kvrpcpb.RawScanResponse> getRawScanMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawScanRequest, org.tikv.kvproto.Kvrpcpb.RawScanResponse> getRawScanMethod;
    if ((getRawScanMethod = TikvGrpc.getRawScanMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawScanMethod = TikvGrpc.getRawScanMethod) == null) {
          TikvGrpc.getRawScanMethod = getRawScanMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawScanRequest, org.tikv.kvproto.Kvrpcpb.RawScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawScan"))
              .build();
        }
      }
    }
    return getRawScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> getRawDeleteRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawDeleteRange",
      requestType = org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> getRawDeleteRangeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> getRawDeleteRangeMethod;
    if ((getRawDeleteRangeMethod = TikvGrpc.getRawDeleteRangeMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawDeleteRangeMethod = TikvGrpc.getRawDeleteRangeMethod) == null) {
          TikvGrpc.getRawDeleteRangeMethod = getRawDeleteRangeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawDeleteRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawDeleteRange"))
              .build();
        }
      }
    }
    return getRawDeleteRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> getRawBatchScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawBatchScan",
      requestType = org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest,
      org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> getRawBatchScanMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest, org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> getRawBatchScanMethod;
    if ((getRawBatchScanMethod = TikvGrpc.getRawBatchScanMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawBatchScanMethod = TikvGrpc.getRawBatchScanMethod) == null) {
          TikvGrpc.getRawBatchScanMethod = getRawBatchScanMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest, org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawBatchScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawBatchScan"))
              .build();
        }
      }
    }
    return getRawBatchScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest,
      org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> getRawGetKeyTTLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawGetKeyTTL",
      requestType = org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest,
      org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> getRawGetKeyTTLMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest, org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> getRawGetKeyTTLMethod;
    if ((getRawGetKeyTTLMethod = TikvGrpc.getRawGetKeyTTLMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawGetKeyTTLMethod = TikvGrpc.getRawGetKeyTTLMethod) == null) {
          TikvGrpc.getRawGetKeyTTLMethod = getRawGetKeyTTLMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest, org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawGetKeyTTL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawGetKeyTTL"))
              .build();
        }
      }
    }
    return getRawGetKeyTTLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawCASRequest,
      org.tikv.kvproto.Kvrpcpb.RawCASResponse> getRawCompareAndSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawCompareAndSwap",
      requestType = org.tikv.kvproto.Kvrpcpb.RawCASRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RawCASResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawCASRequest,
      org.tikv.kvproto.Kvrpcpb.RawCASResponse> getRawCompareAndSwapMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RawCASRequest, org.tikv.kvproto.Kvrpcpb.RawCASResponse> getRawCompareAndSwapMethod;
    if ((getRawCompareAndSwapMethod = TikvGrpc.getRawCompareAndSwapMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRawCompareAndSwapMethod = TikvGrpc.getRawCompareAndSwapMethod) == null) {
          TikvGrpc.getRawCompareAndSwapMethod = getRawCompareAndSwapMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RawCASRequest, org.tikv.kvproto.Kvrpcpb.RawCASResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawCompareAndSwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawCASRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RawCASResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RawCompareAndSwap"))
              .build();
        }
      }
    }
    return getRawCompareAndSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerGetRequest,
      org.tikv.kvproto.Kvrpcpb.VerGetResponse> getVerGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerGet",
      requestType = org.tikv.kvproto.Kvrpcpb.VerGetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerGetRequest,
      org.tikv.kvproto.Kvrpcpb.VerGetResponse> getVerGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerGetRequest, org.tikv.kvproto.Kvrpcpb.VerGetResponse> getVerGetMethod;
    if ((getVerGetMethod = TikvGrpc.getVerGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerGetMethod = TikvGrpc.getVerGetMethod) == null) {
          TikvGrpc.getVerGetMethod = getVerGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerGetRequest, org.tikv.kvproto.Kvrpcpb.VerGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerGet"))
              .build();
        }
      }
    }
    return getVerGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> getVerBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerBatchGet",
      requestType = org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest,
      org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> getVerBatchGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest, org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> getVerBatchGetMethod;
    if ((getVerBatchGetMethod = TikvGrpc.getVerBatchGetMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerBatchGetMethod = TikvGrpc.getVerBatchGetMethod) == null) {
          TikvGrpc.getVerBatchGetMethod = getVerBatchGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest, org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerBatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerBatchGet"))
              .build();
        }
      }
    }
    return getVerBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerMutRequest,
      org.tikv.kvproto.Kvrpcpb.VerMutResponse> getVerMutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerMut",
      requestType = org.tikv.kvproto.Kvrpcpb.VerMutRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerMutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerMutRequest,
      org.tikv.kvproto.Kvrpcpb.VerMutResponse> getVerMutMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerMutRequest, org.tikv.kvproto.Kvrpcpb.VerMutResponse> getVerMutMethod;
    if ((getVerMutMethod = TikvGrpc.getVerMutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerMutMethod = TikvGrpc.getVerMutMethod) == null) {
          TikvGrpc.getVerMutMethod = getVerMutMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerMutRequest, org.tikv.kvproto.Kvrpcpb.VerMutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerMut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerMutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerMutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerMut"))
              .build();
        }
      }
    }
    return getVerMutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest,
      org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> getVerBatchMutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerBatchMut",
      requestType = org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest,
      org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> getVerBatchMutMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest, org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> getVerBatchMutMethod;
    if ((getVerBatchMutMethod = TikvGrpc.getVerBatchMutMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerBatchMutMethod = TikvGrpc.getVerBatchMutMethod) == null) {
          TikvGrpc.getVerBatchMutMethod = getVerBatchMutMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest, org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerBatchMut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerBatchMut"))
              .build();
        }
      }
    }
    return getVerBatchMutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerScanRequest,
      org.tikv.kvproto.Kvrpcpb.VerScanResponse> getVerScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerScan",
      requestType = org.tikv.kvproto.Kvrpcpb.VerScanRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerScanRequest,
      org.tikv.kvproto.Kvrpcpb.VerScanResponse> getVerScanMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerScanRequest, org.tikv.kvproto.Kvrpcpb.VerScanResponse> getVerScanMethod;
    if ((getVerScanMethod = TikvGrpc.getVerScanMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerScanMethod = TikvGrpc.getVerScanMethod) == null) {
          TikvGrpc.getVerScanMethod = getVerScanMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerScanRequest, org.tikv.kvproto.Kvrpcpb.VerScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerScan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerScan"))
              .build();
        }
      }
    }
    return getVerScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> getVerDeleteRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerDeleteRange",
      requestType = org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest,
      org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> getVerDeleteRangeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> getVerDeleteRangeMethod;
    if ((getVerDeleteRangeMethod = TikvGrpc.getVerDeleteRangeMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getVerDeleteRangeMethod = TikvGrpc.getVerDeleteRangeMethod) == null) {
          TikvGrpc.getVerDeleteRangeMethod = getVerDeleteRangeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest, org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerDeleteRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("VerDeleteRange"))
              .build();
        }
      }
    }
    return getVerDeleteRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest,
      org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> getUnsafeDestroyRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsafeDestroyRange",
      requestType = org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest,
      org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> getUnsafeDestroyRangeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest, org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> getUnsafeDestroyRangeMethod;
    if ((getUnsafeDestroyRangeMethod = TikvGrpc.getUnsafeDestroyRangeMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getUnsafeDestroyRangeMethod = TikvGrpc.getUnsafeDestroyRangeMethod) == null) {
          TikvGrpc.getUnsafeDestroyRangeMethod = getUnsafeDestroyRangeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest, org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsafeDestroyRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("UnsafeDestroyRange"))
              .build();
        }
      }
    }
    return getUnsafeDestroyRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> getRegisterLockObserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterLockObserver",
      requestType = org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> getRegisterLockObserverMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest, org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> getRegisterLockObserverMethod;
    if ((getRegisterLockObserverMethod = TikvGrpc.getRegisterLockObserverMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRegisterLockObserverMethod = TikvGrpc.getRegisterLockObserverMethod) == null) {
          TikvGrpc.getRegisterLockObserverMethod = getRegisterLockObserverMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest, org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterLockObserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RegisterLockObserver"))
              .build();
        }
      }
    }
    return getRegisterLockObserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> getCheckLockObserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLockObserver",
      requestType = org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> getCheckLockObserverMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest, org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> getCheckLockObserverMethod;
    if ((getCheckLockObserverMethod = TikvGrpc.getCheckLockObserverMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getCheckLockObserverMethod = TikvGrpc.getCheckLockObserverMethod) == null) {
          TikvGrpc.getCheckLockObserverMethod = getCheckLockObserverMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest, org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckLockObserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("CheckLockObserver"))
              .build();
        }
      }
    }
    return getCheckLockObserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> getRemoveLockObserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLockObserver",
      requestType = org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest,
      org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> getRemoveLockObserverMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest, org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> getRemoveLockObserverMethod;
    if ((getRemoveLockObserverMethod = TikvGrpc.getRemoveLockObserverMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRemoveLockObserverMethod = TikvGrpc.getRemoveLockObserverMethod) == null) {
          TikvGrpc.getRemoveLockObserverMethod = getRemoveLockObserverMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest, org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLockObserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("RemoveLockObserver"))
              .build();
        }
      }
    }
    return getRemoveLockObserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest,
      org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> getPhysicalScanLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PhysicalScanLock",
      requestType = org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest,
      org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> getPhysicalScanLockMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest, org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> getPhysicalScanLockMethod;
    if ((getPhysicalScanLockMethod = TikvGrpc.getPhysicalScanLockMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getPhysicalScanLockMethod = TikvGrpc.getPhysicalScanLockMethod) == null) {
          TikvGrpc.getPhysicalScanLockMethod = getPhysicalScanLockMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest, org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PhysicalScanLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("PhysicalScanLock"))
              .build();
        }
      }
    }
    return getPhysicalScanLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request,
      org.tikv.kvproto.Coprocessor.Response> getCoprocessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Coprocessor",
      requestType = org.tikv.kvproto.Coprocessor.Request.class,
      responseType = org.tikv.kvproto.Coprocessor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request,
      org.tikv.kvproto.Coprocessor.Response> getCoprocessorMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request, org.tikv.kvproto.Coprocessor.Response> getCoprocessorMethod;
    if ((getCoprocessorMethod = TikvGrpc.getCoprocessorMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getCoprocessorMethod = TikvGrpc.getCoprocessorMethod) == null) {
          TikvGrpc.getCoprocessorMethod = getCoprocessorMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Coprocessor.Request, org.tikv.kvproto.Coprocessor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Coprocessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("Coprocessor"))
              .build();
        }
      }
    }
    return getCoprocessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request,
      org.tikv.kvproto.Coprocessor.Response> getCoprocessorStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoprocessorStream",
      requestType = org.tikv.kvproto.Coprocessor.Request.class,
      responseType = org.tikv.kvproto.Coprocessor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request,
      org.tikv.kvproto.Coprocessor.Response> getCoprocessorStreamMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.Request, org.tikv.kvproto.Coprocessor.Response> getCoprocessorStreamMethod;
    if ((getCoprocessorStreamMethod = TikvGrpc.getCoprocessorStreamMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getCoprocessorStreamMethod = TikvGrpc.getCoprocessorStreamMethod) == null) {
          TikvGrpc.getCoprocessorStreamMethod = getCoprocessorStreamMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Coprocessor.Request, org.tikv.kvproto.Coprocessor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoprocessorStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("CoprocessorStream"))
              .build();
        }
      }
    }
    return getCoprocessorStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.BatchRequest,
      org.tikv.kvproto.Coprocessor.BatchResponse> getBatchCoprocessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCoprocessor",
      requestType = org.tikv.kvproto.Coprocessor.BatchRequest.class,
      responseType = org.tikv.kvproto.Coprocessor.BatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.BatchRequest,
      org.tikv.kvproto.Coprocessor.BatchResponse> getBatchCoprocessorMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Coprocessor.BatchRequest, org.tikv.kvproto.Coprocessor.BatchResponse> getBatchCoprocessorMethod;
    if ((getBatchCoprocessorMethod = TikvGrpc.getBatchCoprocessorMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getBatchCoprocessorMethod = TikvGrpc.getBatchCoprocessorMethod) == null) {
          TikvGrpc.getBatchCoprocessorMethod = getBatchCoprocessorMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Coprocessor.BatchRequest, org.tikv.kvproto.Coprocessor.BatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCoprocessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.BatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Coprocessor.BatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("BatchCoprocessor"))
              .build();
        }
      }
    }
    return getBatchCoprocessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.RaftMessage,
      org.tikv.kvproto.RaftServerpb.Done> getRaftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Raft",
      requestType = org.tikv.kvproto.RaftServerpb.RaftMessage.class,
      responseType = org.tikv.kvproto.RaftServerpb.Done.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.RaftMessage,
      org.tikv.kvproto.RaftServerpb.Done> getRaftMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.RaftMessage, org.tikv.kvproto.RaftServerpb.Done> getRaftMethod;
    if ((getRaftMethod = TikvGrpc.getRaftMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getRaftMethod = TikvGrpc.getRaftMethod) == null) {
          TikvGrpc.getRaftMethod = getRaftMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.RaftServerpb.RaftMessage, org.tikv.kvproto.RaftServerpb.Done>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Raft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.RaftServerpb.RaftMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.RaftServerpb.Done.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("Raft"))
              .build();
        }
      }
    }
    return getRaftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchRaftMessage,
      org.tikv.kvproto.RaftServerpb.Done> getBatchRaftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchRaft",
      requestType = org.tikv.kvproto.Tikvpb.BatchRaftMessage.class,
      responseType = org.tikv.kvproto.RaftServerpb.Done.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchRaftMessage,
      org.tikv.kvproto.RaftServerpb.Done> getBatchRaftMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchRaftMessage, org.tikv.kvproto.RaftServerpb.Done> getBatchRaftMethod;
    if ((getBatchRaftMethod = TikvGrpc.getBatchRaftMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getBatchRaftMethod = TikvGrpc.getBatchRaftMethod) == null) {
          TikvGrpc.getBatchRaftMethod = getBatchRaftMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Tikvpb.BatchRaftMessage, org.tikv.kvproto.RaftServerpb.Done>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchRaft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Tikvpb.BatchRaftMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.RaftServerpb.Done.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("BatchRaft"))
              .build();
        }
      }
    }
    return getBatchRaftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.SnapshotChunk,
      org.tikv.kvproto.RaftServerpb.Done> getSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Snapshot",
      requestType = org.tikv.kvproto.RaftServerpb.SnapshotChunk.class,
      responseType = org.tikv.kvproto.RaftServerpb.Done.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.SnapshotChunk,
      org.tikv.kvproto.RaftServerpb.Done> getSnapshotMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.RaftServerpb.SnapshotChunk, org.tikv.kvproto.RaftServerpb.Done> getSnapshotMethod;
    if ((getSnapshotMethod = TikvGrpc.getSnapshotMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getSnapshotMethod = TikvGrpc.getSnapshotMethod) == null) {
          TikvGrpc.getSnapshotMethod = getSnapshotMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.RaftServerpb.SnapshotChunk, org.tikv.kvproto.RaftServerpb.Done>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Snapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.RaftServerpb.SnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.RaftServerpb.Done.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("Snapshot"))
              .build();
        }
      }
    }
    return getSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.SplitRegionRequest,
      org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> getSplitRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SplitRegion",
      requestType = org.tikv.kvproto.Kvrpcpb.SplitRegionRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.SplitRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.SplitRegionRequest,
      org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> getSplitRegionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.SplitRegionRequest, org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> getSplitRegionMethod;
    if ((getSplitRegionMethod = TikvGrpc.getSplitRegionMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getSplitRegionMethod = TikvGrpc.getSplitRegionMethod) == null) {
          TikvGrpc.getSplitRegionMethod = getSplitRegionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.SplitRegionRequest, org.tikv.kvproto.Kvrpcpb.SplitRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SplitRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.SplitRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.SplitRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("SplitRegion"))
              .build();
        }
      }
    }
    return getSplitRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ReadIndexRequest,
      org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> getReadIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadIndex",
      requestType = org.tikv.kvproto.Kvrpcpb.ReadIndexRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.ReadIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ReadIndexRequest,
      org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> getReadIndexMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.ReadIndexRequest, org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> getReadIndexMethod;
    if ((getReadIndexMethod = TikvGrpc.getReadIndexMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getReadIndexMethod = TikvGrpc.getReadIndexMethod) == null) {
          TikvGrpc.getReadIndexMethod = getReadIndexMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.ReadIndexRequest, org.tikv.kvproto.Kvrpcpb.ReadIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ReadIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.ReadIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("ReadIndex"))
              .build();
        }
      }
    }
    return getReadIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest,
      org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> getMvccGetByKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MvccGetByKey",
      requestType = org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest,
      org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> getMvccGetByKeyMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest, org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> getMvccGetByKeyMethod;
    if ((getMvccGetByKeyMethod = TikvGrpc.getMvccGetByKeyMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getMvccGetByKeyMethod = TikvGrpc.getMvccGetByKeyMethod) == null) {
          TikvGrpc.getMvccGetByKeyMethod = getMvccGetByKeyMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest, org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MvccGetByKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("MvccGetByKey"))
              .build();
        }
      }
    }
    return getMvccGetByKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest,
      org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> getMvccGetByStartTsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MvccGetByStartTs",
      requestType = org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest,
      org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> getMvccGetByStartTsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest, org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> getMvccGetByStartTsMethod;
    if ((getMvccGetByStartTsMethod = TikvGrpc.getMvccGetByStartTsMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getMvccGetByStartTsMethod = TikvGrpc.getMvccGetByStartTsMethod) == null) {
          TikvGrpc.getMvccGetByStartTsMethod = getMvccGetByStartTsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest, org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MvccGetByStartTs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("MvccGetByStartTs"))
              .build();
        }
      }
    }
    return getMvccGetByStartTsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchCommandsRequest,
      org.tikv.kvproto.Tikvpb.BatchCommandsResponse> getBatchCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCommands",
      requestType = org.tikv.kvproto.Tikvpb.BatchCommandsRequest.class,
      responseType = org.tikv.kvproto.Tikvpb.BatchCommandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchCommandsRequest,
      org.tikv.kvproto.Tikvpb.BatchCommandsResponse> getBatchCommandsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Tikvpb.BatchCommandsRequest, org.tikv.kvproto.Tikvpb.BatchCommandsResponse> getBatchCommandsMethod;
    if ((getBatchCommandsMethod = TikvGrpc.getBatchCommandsMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getBatchCommandsMethod = TikvGrpc.getBatchCommandsMethod) == null) {
          TikvGrpc.getBatchCommandsMethod = getBatchCommandsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Tikvpb.BatchCommandsRequest, org.tikv.kvproto.Tikvpb.BatchCommandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Tikvpb.BatchCommandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Tikvpb.BatchCommandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("BatchCommands"))
              .build();
        }
      }
    }
    return getBatchCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.DispatchTaskRequest,
      org.tikv.kvproto.Mpp.DispatchTaskResponse> getDispatchMPPTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispatchMPPTask",
      requestType = org.tikv.kvproto.Mpp.DispatchTaskRequest.class,
      responseType = org.tikv.kvproto.Mpp.DispatchTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.DispatchTaskRequest,
      org.tikv.kvproto.Mpp.DispatchTaskResponse> getDispatchMPPTaskMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.DispatchTaskRequest, org.tikv.kvproto.Mpp.DispatchTaskResponse> getDispatchMPPTaskMethod;
    if ((getDispatchMPPTaskMethod = TikvGrpc.getDispatchMPPTaskMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getDispatchMPPTaskMethod = TikvGrpc.getDispatchMPPTaskMethod) == null) {
          TikvGrpc.getDispatchMPPTaskMethod = getDispatchMPPTaskMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Mpp.DispatchTaskRequest, org.tikv.kvproto.Mpp.DispatchTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DispatchMPPTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.DispatchTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.DispatchTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("DispatchMPPTask"))
              .build();
        }
      }
    }
    return getDispatchMPPTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.CancelTaskRequest,
      org.tikv.kvproto.Mpp.CancelTaskResponse> getCancelMPPTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMPPTask",
      requestType = org.tikv.kvproto.Mpp.CancelTaskRequest.class,
      responseType = org.tikv.kvproto.Mpp.CancelTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.CancelTaskRequest,
      org.tikv.kvproto.Mpp.CancelTaskResponse> getCancelMPPTaskMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.CancelTaskRequest, org.tikv.kvproto.Mpp.CancelTaskResponse> getCancelMPPTaskMethod;
    if ((getCancelMPPTaskMethod = TikvGrpc.getCancelMPPTaskMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getCancelMPPTaskMethod = TikvGrpc.getCancelMPPTaskMethod) == null) {
          TikvGrpc.getCancelMPPTaskMethod = getCancelMPPTaskMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Mpp.CancelTaskRequest, org.tikv.kvproto.Mpp.CancelTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMPPTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.CancelTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.CancelTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("CancelMPPTask"))
              .build();
        }
      }
    }
    return getCancelMPPTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest,
      org.tikv.kvproto.Mpp.MPPDataPacket> getEstablishMPPConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstablishMPPConnection",
      requestType = org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest.class,
      responseType = org.tikv.kvproto.Mpp.MPPDataPacket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest,
      org.tikv.kvproto.Mpp.MPPDataPacket> getEstablishMPPConnectionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest, org.tikv.kvproto.Mpp.MPPDataPacket> getEstablishMPPConnectionMethod;
    if ((getEstablishMPPConnectionMethod = TikvGrpc.getEstablishMPPConnectionMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getEstablishMPPConnectionMethod = TikvGrpc.getEstablishMPPConnectionMethod) == null) {
          TikvGrpc.getEstablishMPPConnectionMethod = getEstablishMPPConnectionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest, org.tikv.kvproto.Mpp.MPPDataPacket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstablishMPPConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Mpp.MPPDataPacket.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("EstablishMPPConnection"))
              .build();
        }
      }
    }
    return getEstablishMPPConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest,
      org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> getCheckLeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLeader",
      requestType = org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest.class,
      responseType = org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest,
      org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> getCheckLeaderMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest, org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> getCheckLeaderMethod;
    if ((getCheckLeaderMethod = TikvGrpc.getCheckLeaderMethod) == null) {
      synchronized (TikvGrpc.class) {
        if ((getCheckLeaderMethod = TikvGrpc.getCheckLeaderMethod) == null) {
          TikvGrpc.getCheckLeaderMethod = getCheckLeaderMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest, org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckLeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TikvMethodDescriptorSupplier("CheckLeader"))
              .build();
        }
      }
    }
    return getCheckLeaderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TikvStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvStub>() {
        @java.lang.Override
        public TikvStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvStub(channel, callOptions);
        }
      };
    return TikvStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TikvBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvBlockingStub>() {
        @java.lang.Override
        public TikvBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvBlockingStub(channel, callOptions);
        }
      };
    return TikvBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TikvFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TikvFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TikvFutureStub>() {
        @java.lang.Override
        public TikvFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TikvFutureStub(channel, callOptions);
        }
      };
    return TikvFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Key/value store API for TiKV.
   * </pre>
   */
  public static abstract class TikvImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Commands using a transactional interface.
     * </pre>
     */
    public void kvGet(org.tikv.kvproto.Kvrpcpb.GetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvGetMethod(), responseObserver);
    }

    /**
     */
    public void kvScan(org.tikv.kvproto.Kvrpcpb.ScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvScanMethod(), responseObserver);
    }

    /**
     */
    public void kvPrewrite(org.tikv.kvproto.Kvrpcpb.PrewriteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PrewriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvPrewriteMethod(), responseObserver);
    }

    /**
     */
    public void kvPessimisticLock(org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvPessimisticLockMethod(), responseObserver);
    }

    /**
     */
    public void kVPessimisticRollback(org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKVPessimisticRollbackMethod(), responseObserver);
    }

    /**
     */
    public void kvTxnHeartBeat(org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvTxnHeartBeatMethod(), responseObserver);
    }

    /**
     */
    public void kvCheckTxnStatus(org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvCheckTxnStatusMethod(), responseObserver);
    }

    /**
     */
    public void kvCheckSecondaryLocks(org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvCheckSecondaryLocksMethod(), responseObserver);
    }

    /**
     */
    public void kvCommit(org.tikv.kvproto.Kvrpcpb.CommitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CommitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvCommitMethod(), responseObserver);
    }

    /**
     */
    public void kvImport(org.tikv.kvproto.Kvrpcpb.ImportRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ImportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvImportMethod(), responseObserver);
    }

    /**
     */
    public void kvCleanup(org.tikv.kvproto.Kvrpcpb.CleanupRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CleanupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvCleanupMethod(), responseObserver);
    }

    /**
     */
    public void kvBatchGet(org.tikv.kvproto.Kvrpcpb.BatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvBatchGetMethod(), responseObserver);
    }

    /**
     */
    public void kvBatchRollback(org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvBatchRollbackMethod(), responseObserver);
    }

    /**
     */
    public void kvScanLock(org.tikv.kvproto.Kvrpcpb.ScanLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvScanLockMethod(), responseObserver);
    }

    /**
     */
    public void kvResolveLock(org.tikv.kvproto.Kvrpcpb.ResolveLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvResolveLockMethod(), responseObserver);
    }

    /**
     */
    public void kvGC(org.tikv.kvproto.Kvrpcpb.GCRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GCResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvGCMethod(), responseObserver);
    }

    /**
     */
    public void kvDeleteRange(org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKvDeleteRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Raw commands; no transaction support.
     * </pre>
     */
    public void rawGet(org.tikv.kvproto.Kvrpcpb.RawGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawGetMethod(), responseObserver);
    }

    /**
     */
    public void rawBatchGet(org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchGetMethod(), responseObserver);
    }

    /**
     */
    public void rawPut(org.tikv.kvproto.Kvrpcpb.RawPutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawPutMethod(), responseObserver);
    }

    /**
     */
    public void rawBatchPut(org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchPutMethod(), responseObserver);
    }

    /**
     */
    public void rawDelete(org.tikv.kvproto.Kvrpcpb.RawDeleteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawDeleteMethod(), responseObserver);
    }

    /**
     */
    public void rawBatchDelete(org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchDeleteMethod(), responseObserver);
    }

    /**
     */
    public void rawScan(org.tikv.kvproto.Kvrpcpb.RawScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawScanMethod(), responseObserver);
    }

    /**
     */
    public void rawDeleteRange(org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawDeleteRangeMethod(), responseObserver);
    }

    /**
     */
    public void rawBatchScan(org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawBatchScanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get TTL of the key. Returns 0 if TTL is not set for the key.
     * </pre>
     */
    public void rawGetKeyTTL(org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawGetKeyTTLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compare if the value in database equals to `RawCASRequest.previous_value` before putting the new value. If not, this request will have no effect and the value in the database will be returned.
     * </pre>
     */
    public void rawCompareAndSwap(org.tikv.kvproto.Kvrpcpb.RawCASRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawCASResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawCompareAndSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * VerKV commands.
     * </pre>
     */
    public void verGet(org.tikv.kvproto.Kvrpcpb.VerGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerGetMethod(), responseObserver);
    }

    /**
     */
    public void verBatchGet(org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerBatchGetMethod(), responseObserver);
    }

    /**
     */
    public void verMut(org.tikv.kvproto.Kvrpcpb.VerMutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerMutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerMutMethod(), responseObserver);
    }

    /**
     */
    public void verBatchMut(org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerBatchMutMethod(), responseObserver);
    }

    /**
     */
    public void verScan(org.tikv.kvproto.Kvrpcpb.VerScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerScanMethod(), responseObserver);
    }

    /**
     */
    public void verDeleteRange(org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerDeleteRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store commands (sent to a each TiKV node in a cluster, rather than a certain region).
     * </pre>
     */
    public void unsafeDestroyRange(org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsafeDestroyRangeMethod(), responseObserver);
    }

    /**
     */
    public void registerLockObserver(org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterLockObserverMethod(), responseObserver);
    }

    /**
     */
    public void checkLockObserver(org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckLockObserverMethod(), responseObserver);
    }

    /**
     */
    public void removeLockObserver(org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveLockObserverMethod(), responseObserver);
    }

    /**
     */
    public void physicalScanLock(org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPhysicalScanLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Commands for executing SQL in the TiKV coprocessor (i.e., 'pushed down' to TiKV rather than
     * executed in TiDB).
     * </pre>
     */
    public void coprocessor(org.tikv.kvproto.Coprocessor.Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoprocessorMethod(), responseObserver);
    }

    /**
     */
    public void coprocessorStream(org.tikv.kvproto.Coprocessor.Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoprocessorStreamMethod(), responseObserver);
    }

    /**
     */
    public void batchCoprocessor(org.tikv.kvproto.Coprocessor.BatchRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.BatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCoprocessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Raft commands (sent between TiKV nodes).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.RaftMessage> raft(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRaftMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchRaftMessage> batchRaft(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBatchRaftMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.SnapshotChunk> snapshot(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sent from PD or TiDB to a TiKV node.
     * </pre>
     */
    public void splitRegion(org.tikv.kvproto.Kvrpcpb.SplitRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sent from TiFlash or TiKV to a TiKV node.
     * </pre>
     */
    public void readIndex(org.tikv.kvproto.Kvrpcpb.ReadIndexRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Commands for debugging transactions.
     * </pre>
     */
    public void mvccGetByKey(org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMvccGetByKeyMethod(), responseObserver);
    }

    /**
     */
    public void mvccGetByStartTs(org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMvccGetByStartTsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batched commands.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchCommandsRequest> batchCommands(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchCommandsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBatchCommandsMethod(), responseObserver);
    }

    /**
     * <pre>
     * These are for mpp execution.
     * </pre>
     */
    public void dispatchMPPTask(org.tikv.kvproto.Mpp.DispatchTaskRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.DispatchTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDispatchMPPTaskMethod(), responseObserver);
    }

    /**
     */
    public void cancelMPPTask(org.tikv.kvproto.Mpp.CancelTaskRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.CancelTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMPPTaskMethod(), responseObserver);
    }

    /**
     */
    public void establishMPPConnection(org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.MPPDataPacket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstablishMPPConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47; CheckLeader sends all information (includes region term and epoch) to other stores.
     * / Once a store receives a request, it checks term and epoch for each region, and sends the regions whose 
     * / term and epoch match with local information in the store.
     * / After the client collected all responses from all stores, it checks if got a quorum of responses from
     * / other stores for every region, and decides to advance resolved ts from these regions.
     * </pre>
     */
    public void checkLeader(org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckLeaderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKvGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.GetRequest,
                org.tikv.kvproto.Kvrpcpb.GetResponse>(
                  this, METHODID_KV_GET)))
          .addMethod(
            getKvScanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.ScanRequest,
                org.tikv.kvproto.Kvrpcpb.ScanResponse>(
                  this, METHODID_KV_SCAN)))
          .addMethod(
            getKvPrewriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.PrewriteRequest,
                org.tikv.kvproto.Kvrpcpb.PrewriteResponse>(
                  this, METHODID_KV_PREWRITE)))
          .addMethod(
            getKvPessimisticLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest,
                org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse>(
                  this, METHODID_KV_PESSIMISTIC_LOCK)))
          .addMethod(
            getKVPessimisticRollbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest,
                org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse>(
                  this, METHODID_KVPESSIMISTIC_ROLLBACK)))
          .addMethod(
            getKvTxnHeartBeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest,
                org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse>(
                  this, METHODID_KV_TXN_HEART_BEAT)))
          .addMethod(
            getKvCheckTxnStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest,
                org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse>(
                  this, METHODID_KV_CHECK_TXN_STATUS)))
          .addMethod(
            getKvCheckSecondaryLocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest,
                org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse>(
                  this, METHODID_KV_CHECK_SECONDARY_LOCKS)))
          .addMethod(
            getKvCommitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CommitRequest,
                org.tikv.kvproto.Kvrpcpb.CommitResponse>(
                  this, METHODID_KV_COMMIT)))
          .addMethod(
            getKvImportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.ImportRequest,
                org.tikv.kvproto.Kvrpcpb.ImportResponse>(
                  this, METHODID_KV_IMPORT)))
          .addMethod(
            getKvCleanupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CleanupRequest,
                org.tikv.kvproto.Kvrpcpb.CleanupResponse>(
                  this, METHODID_KV_CLEANUP)))
          .addMethod(
            getKvBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.BatchGetRequest,
                org.tikv.kvproto.Kvrpcpb.BatchGetResponse>(
                  this, METHODID_KV_BATCH_GET)))
          .addMethod(
            getKvBatchRollbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest,
                org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse>(
                  this, METHODID_KV_BATCH_ROLLBACK)))
          .addMethod(
            getKvScanLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.ScanLockRequest,
                org.tikv.kvproto.Kvrpcpb.ScanLockResponse>(
                  this, METHODID_KV_SCAN_LOCK)))
          .addMethod(
            getKvResolveLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.ResolveLockRequest,
                org.tikv.kvproto.Kvrpcpb.ResolveLockResponse>(
                  this, METHODID_KV_RESOLVE_LOCK)))
          .addMethod(
            getKvGCMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.GCRequest,
                org.tikv.kvproto.Kvrpcpb.GCResponse>(
                  this, METHODID_KV_GC)))
          .addMethod(
            getKvDeleteRangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest,
                org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse>(
                  this, METHODID_KV_DELETE_RANGE)))
          .addMethod(
            getRawGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawGetRequest,
                org.tikv.kvproto.Kvrpcpb.RawGetResponse>(
                  this, METHODID_RAW_GET)))
          .addMethod(
            getRawBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest,
                org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse>(
                  this, METHODID_RAW_BATCH_GET)))
          .addMethod(
            getRawPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawPutRequest,
                org.tikv.kvproto.Kvrpcpb.RawPutResponse>(
                  this, METHODID_RAW_PUT)))
          .addMethod(
            getRawBatchPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest,
                org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse>(
                  this, METHODID_RAW_BATCH_PUT)))
          .addMethod(
            getRawDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawDeleteRequest,
                org.tikv.kvproto.Kvrpcpb.RawDeleteResponse>(
                  this, METHODID_RAW_DELETE)))
          .addMethod(
            getRawBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest,
                org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse>(
                  this, METHODID_RAW_BATCH_DELETE)))
          .addMethod(
            getRawScanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawScanRequest,
                org.tikv.kvproto.Kvrpcpb.RawScanResponse>(
                  this, METHODID_RAW_SCAN)))
          .addMethod(
            getRawDeleteRangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest,
                org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse>(
                  this, METHODID_RAW_DELETE_RANGE)))
          .addMethod(
            getRawBatchScanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest,
                org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse>(
                  this, METHODID_RAW_BATCH_SCAN)))
          .addMethod(
            getRawGetKeyTTLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest,
                org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse>(
                  this, METHODID_RAW_GET_KEY_TTL)))
          .addMethod(
            getRawCompareAndSwapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RawCASRequest,
                org.tikv.kvproto.Kvrpcpb.RawCASResponse>(
                  this, METHODID_RAW_COMPARE_AND_SWAP)))
          .addMethod(
            getVerGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerGetRequest,
                org.tikv.kvproto.Kvrpcpb.VerGetResponse>(
                  this, METHODID_VER_GET)))
          .addMethod(
            getVerBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest,
                org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse>(
                  this, METHODID_VER_BATCH_GET)))
          .addMethod(
            getVerMutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerMutRequest,
                org.tikv.kvproto.Kvrpcpb.VerMutResponse>(
                  this, METHODID_VER_MUT)))
          .addMethod(
            getVerBatchMutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest,
                org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse>(
                  this, METHODID_VER_BATCH_MUT)))
          .addMethod(
            getVerScanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerScanRequest,
                org.tikv.kvproto.Kvrpcpb.VerScanResponse>(
                  this, METHODID_VER_SCAN)))
          .addMethod(
            getVerDeleteRangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest,
                org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse>(
                  this, METHODID_VER_DELETE_RANGE)))
          .addMethod(
            getUnsafeDestroyRangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest,
                org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse>(
                  this, METHODID_UNSAFE_DESTROY_RANGE)))
          .addMethod(
            getRegisterLockObserverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest,
                org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse>(
                  this, METHODID_REGISTER_LOCK_OBSERVER)))
          .addMethod(
            getCheckLockObserverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest,
                org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse>(
                  this, METHODID_CHECK_LOCK_OBSERVER)))
          .addMethod(
            getRemoveLockObserverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest,
                org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse>(
                  this, METHODID_REMOVE_LOCK_OBSERVER)))
          .addMethod(
            getPhysicalScanLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest,
                org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse>(
                  this, METHODID_PHYSICAL_SCAN_LOCK)))
          .addMethod(
            getCoprocessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Coprocessor.Request,
                org.tikv.kvproto.Coprocessor.Response>(
                  this, METHODID_COPROCESSOR)))
          .addMethod(
            getCoprocessorStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Coprocessor.Request,
                org.tikv.kvproto.Coprocessor.Response>(
                  this, METHODID_COPROCESSOR_STREAM)))
          .addMethod(
            getBatchCoprocessorMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Coprocessor.BatchRequest,
                org.tikv.kvproto.Coprocessor.BatchResponse>(
                  this, METHODID_BATCH_COPROCESSOR)))
          .addMethod(
            getRaftMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.RaftServerpb.RaftMessage,
                org.tikv.kvproto.RaftServerpb.Done>(
                  this, METHODID_RAFT)))
          .addMethod(
            getBatchRaftMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Tikvpb.BatchRaftMessage,
                org.tikv.kvproto.RaftServerpb.Done>(
                  this, METHODID_BATCH_RAFT)))
          .addMethod(
            getSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.RaftServerpb.SnapshotChunk,
                org.tikv.kvproto.RaftServerpb.Done>(
                  this, METHODID_SNAPSHOT)))
          .addMethod(
            getSplitRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.SplitRegionRequest,
                org.tikv.kvproto.Kvrpcpb.SplitRegionResponse>(
                  this, METHODID_SPLIT_REGION)))
          .addMethod(
            getReadIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.ReadIndexRequest,
                org.tikv.kvproto.Kvrpcpb.ReadIndexResponse>(
                  this, METHODID_READ_INDEX)))
          .addMethod(
            getMvccGetByKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest,
                org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse>(
                  this, METHODID_MVCC_GET_BY_KEY)))
          .addMethod(
            getMvccGetByStartTsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest,
                org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse>(
                  this, METHODID_MVCC_GET_BY_START_TS)))
          .addMethod(
            getBatchCommandsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Tikvpb.BatchCommandsRequest,
                org.tikv.kvproto.Tikvpb.BatchCommandsResponse>(
                  this, METHODID_BATCH_COMMANDS)))
          .addMethod(
            getDispatchMPPTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Mpp.DispatchTaskRequest,
                org.tikv.kvproto.Mpp.DispatchTaskResponse>(
                  this, METHODID_DISPATCH_MPPTASK)))
          .addMethod(
            getCancelMPPTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Mpp.CancelTaskRequest,
                org.tikv.kvproto.Mpp.CancelTaskResponse>(
                  this, METHODID_CANCEL_MPPTASK)))
          .addMethod(
            getEstablishMPPConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest,
                org.tikv.kvproto.Mpp.MPPDataPacket>(
                  this, METHODID_ESTABLISH_MPPCONNECTION)))
          .addMethod(
            getCheckLeaderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest,
                org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse>(
                  this, METHODID_CHECK_LEADER)))
          .build();
    }
  }

  /**
   * <pre>
   * Key/value store API for TiKV.
   * </pre>
   */
  public static final class TikvStub extends io.grpc.stub.AbstractAsyncStub<TikvStub> {
    private TikvStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvStub(channel, callOptions);
    }

    /**
     * <pre>
     * Commands using a transactional interface.
     * </pre>
     */
    public void kvGet(org.tikv.kvproto.Kvrpcpb.GetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvScan(org.tikv.kvproto.Kvrpcpb.ScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvPrewrite(org.tikv.kvproto.Kvrpcpb.PrewriteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PrewriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvPrewriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvPessimisticLock(org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvPessimisticLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kVPessimisticRollback(org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKVPessimisticRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvTxnHeartBeat(org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvTxnHeartBeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvCheckTxnStatus(org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvCheckTxnStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvCheckSecondaryLocks(org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvCheckSecondaryLocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvCommit(org.tikv.kvproto.Kvrpcpb.CommitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CommitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvImport(org.tikv.kvproto.Kvrpcpb.ImportRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ImportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvImportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvCleanup(org.tikv.kvproto.Kvrpcpb.CleanupRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CleanupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvCleanupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvBatchGet(org.tikv.kvproto.Kvrpcpb.BatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvBatchRollback(org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvBatchRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvScanLock(org.tikv.kvproto.Kvrpcpb.ScanLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvScanLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvResolveLock(org.tikv.kvproto.Kvrpcpb.ResolveLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvResolveLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvGC(org.tikv.kvproto.Kvrpcpb.GCRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GCResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvGCMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kvDeleteRange(org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKvDeleteRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Raw commands; no transaction support.
     * </pre>
     */
    public void rawGet(org.tikv.kvproto.Kvrpcpb.RawGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchGet(org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawPut(org.tikv.kvproto.Kvrpcpb.RawPutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchPut(org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawDelete(org.tikv.kvproto.Kvrpcpb.RawDeleteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchDelete(org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawScan(org.tikv.kvproto.Kvrpcpb.RawScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawDeleteRange(org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawDeleteRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawBatchScan(org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawBatchScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get TTL of the key. Returns 0 if TTL is not set for the key.
     * </pre>
     */
    public void rawGetKeyTTL(org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawGetKeyTTLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compare if the value in database equals to `RawCASRequest.previous_value` before putting the new value. If not, this request will have no effect and the value in the database will be returned.
     * </pre>
     */
    public void rawCompareAndSwap(org.tikv.kvproto.Kvrpcpb.RawCASRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawCASResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawCompareAndSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VerKV commands.
     * </pre>
     */
    public void verGet(org.tikv.kvproto.Kvrpcpb.VerGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verBatchGet(org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verMut(org.tikv.kvproto.Kvrpcpb.VerMutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerMutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerMutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verBatchMut(org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerBatchMutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verScan(org.tikv.kvproto.Kvrpcpb.VerScanRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verDeleteRange(org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerDeleteRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store commands (sent to a each TiKV node in a cluster, rather than a certain region).
     * </pre>
     */
    public void unsafeDestroyRange(org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsafeDestroyRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerLockObserver(org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterLockObserverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkLockObserver(org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckLockObserverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLockObserver(org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveLockObserverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void physicalScanLock(org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPhysicalScanLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commands for executing SQL in the TiKV coprocessor (i.e., 'pushed down' to TiKV rather than
     * executed in TiDB).
     * </pre>
     */
    public void coprocessor(org.tikv.kvproto.Coprocessor.Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoprocessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void coprocessorStream(org.tikv.kvproto.Coprocessor.Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCoprocessorStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchCoprocessor(org.tikv.kvproto.Coprocessor.BatchRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.BatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBatchCoprocessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Raft commands (sent between TiKV nodes).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.RaftMessage> raft(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRaftMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchRaftMessage> batchRaft(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBatchRaftMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.SnapshotChunk> snapshot(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSnapshotMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Sent from PD or TiDB to a TiKV node.
     * </pre>
     */
    public void splitRegion(org.tikv.kvproto.Kvrpcpb.SplitRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSplitRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sent from TiFlash or TiKV to a TiKV node.
     * </pre>
     */
    public void readIndex(org.tikv.kvproto.Kvrpcpb.ReadIndexRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commands for debugging transactions.
     * </pre>
     */
    public void mvccGetByKey(org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMvccGetByKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mvccGetByStartTs(org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMvccGetByStartTsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batched commands.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchCommandsRequest> batchCommands(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchCommandsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBatchCommandsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * These are for mpp execution.
     * </pre>
     */
    public void dispatchMPPTask(org.tikv.kvproto.Mpp.DispatchTaskRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.DispatchTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDispatchMPPTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelMPPTask(org.tikv.kvproto.Mpp.CancelTaskRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.CancelTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMPPTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void establishMPPConnection(org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.MPPDataPacket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEstablishMPPConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47; CheckLeader sends all information (includes region term and epoch) to other stores.
     * / Once a store receives a request, it checks term and epoch for each region, and sends the regions whose 
     * / term and epoch match with local information in the store.
     * / After the client collected all responses from all stores, it checks if got a quorum of responses from
     * / other stores for every region, and decides to advance resolved ts from these regions.
     * </pre>
     */
    public void checkLeader(org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckLeaderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Key/value store API for TiKV.
   * </pre>
   */
  public static final class TikvBlockingStub extends io.grpc.stub.AbstractBlockingStub<TikvBlockingStub> {
    private TikvBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Commands using a transactional interface.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.GetResponse kvGet(org.tikv.kvproto.Kvrpcpb.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.ScanResponse kvScan(org.tikv.kvproto.Kvrpcpb.ScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvScanMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.PrewriteResponse kvPrewrite(org.tikv.kvproto.Kvrpcpb.PrewriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvPrewriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse kvPessimisticLock(org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvPessimisticLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse kVPessimisticRollback(org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKVPessimisticRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse kvTxnHeartBeat(org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvTxnHeartBeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse kvCheckTxnStatus(org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvCheckTxnStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse kvCheckSecondaryLocks(org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvCheckSecondaryLocksMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.CommitResponse kvCommit(org.tikv.kvproto.Kvrpcpb.CommitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.ImportResponse kvImport(org.tikv.kvproto.Kvrpcpb.ImportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvImportMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.CleanupResponse kvCleanup(org.tikv.kvproto.Kvrpcpb.CleanupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvCleanupMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.BatchGetResponse kvBatchGet(org.tikv.kvproto.Kvrpcpb.BatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse kvBatchRollback(org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvBatchRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.ScanLockResponse kvScanLock(org.tikv.kvproto.Kvrpcpb.ScanLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvScanLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.ResolveLockResponse kvResolveLock(org.tikv.kvproto.Kvrpcpb.ResolveLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvResolveLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.GCResponse kvGC(org.tikv.kvproto.Kvrpcpb.GCRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvGCMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse kvDeleteRange(org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKvDeleteRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Raw commands; no transaction support.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.RawGetResponse rawGet(org.tikv.kvproto.Kvrpcpb.RawGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse rawBatchGet(org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawPutResponse rawPut(org.tikv.kvproto.Kvrpcpb.RawPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse rawBatchPut(org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawDeleteResponse rawDelete(org.tikv.kvproto.Kvrpcpb.RawDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse rawBatchDelete(org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawScanResponse rawScan(org.tikv.kvproto.Kvrpcpb.RawScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawScanMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse rawDeleteRange(org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawDeleteRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse rawBatchScan(org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawBatchScanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get TTL of the key. Returns 0 if TTL is not set for the key.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse rawGetKeyTTL(org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawGetKeyTTLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compare if the value in database equals to `RawCASRequest.previous_value` before putting the new value. If not, this request will have no effect and the value in the database will be returned.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.RawCASResponse rawCompareAndSwap(org.tikv.kvproto.Kvrpcpb.RawCASRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawCompareAndSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VerKV commands.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.VerGetResponse verGet(org.tikv.kvproto.Kvrpcpb.VerGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse verBatchGet(org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerBatchGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.VerMutResponse verMut(org.tikv.kvproto.Kvrpcpb.VerMutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerMutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse verBatchMut(org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerBatchMutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.VerScanResponse verScan(org.tikv.kvproto.Kvrpcpb.VerScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerScanMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse verDeleteRange(org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerDeleteRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store commands (sent to a each TiKV node in a cluster, rather than a certain region).
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse unsafeDestroyRange(org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsafeDestroyRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse registerLockObserver(org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterLockObserverMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse checkLockObserver(org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckLockObserverMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse removeLockObserver(org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveLockObserverMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse physicalScanLock(org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPhysicalScanLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Commands for executing SQL in the TiKV coprocessor (i.e., 'pushed down' to TiKV rather than
     * executed in TiDB).
     * </pre>
     */
    public org.tikv.kvproto.Coprocessor.Response coprocessor(org.tikv.kvproto.Coprocessor.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoprocessorMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.tikv.kvproto.Coprocessor.Response> coprocessorStream(
        org.tikv.kvproto.Coprocessor.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCoprocessorStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.tikv.kvproto.Coprocessor.BatchResponse> batchCoprocessor(
        org.tikv.kvproto.Coprocessor.BatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBatchCoprocessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sent from PD or TiDB to a TiKV node.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.SplitRegionResponse splitRegion(org.tikv.kvproto.Kvrpcpb.SplitRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSplitRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sent from TiFlash or TiKV to a TiKV node.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.ReadIndexResponse readIndex(org.tikv.kvproto.Kvrpcpb.ReadIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Commands for debugging transactions.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse mvccGetByKey(org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMvccGetByKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse mvccGetByStartTs(org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMvccGetByStartTsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * These are for mpp execution.
     * </pre>
     */
    public org.tikv.kvproto.Mpp.DispatchTaskResponse dispatchMPPTask(org.tikv.kvproto.Mpp.DispatchTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDispatchMPPTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Mpp.CancelTaskResponse cancelMPPTask(org.tikv.kvproto.Mpp.CancelTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMPPTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.tikv.kvproto.Mpp.MPPDataPacket> establishMPPConnection(
        org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEstablishMPPConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47; CheckLeader sends all information (includes region term and epoch) to other stores.
     * / Once a store receives a request, it checks term and epoch for each region, and sends the regions whose 
     * / term and epoch match with local information in the store.
     * / After the client collected all responses from all stores, it checks if got a quorum of responses from
     * / other stores for every region, and decides to advance resolved ts from these regions.
     * </pre>
     */
    public org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse checkLeader(org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckLeaderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Key/value store API for TiKV.
   * </pre>
   */
  public static final class TikvFutureStub extends io.grpc.stub.AbstractFutureStub<TikvFutureStub> {
    private TikvFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TikvFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TikvFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Commands using a transactional interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.GetResponse> kvGet(
        org.tikv.kvproto.Kvrpcpb.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.ScanResponse> kvScan(
        org.tikv.kvproto.Kvrpcpb.ScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvScanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.PrewriteResponse> kvPrewrite(
        org.tikv.kvproto.Kvrpcpb.PrewriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvPrewriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse> kvPessimisticLock(
        org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvPessimisticLockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse> kVPessimisticRollback(
        org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKVPessimisticRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse> kvTxnHeartBeat(
        org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvTxnHeartBeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse> kvCheckTxnStatus(
        org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvCheckTxnStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse> kvCheckSecondaryLocks(
        org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvCheckSecondaryLocksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CommitResponse> kvCommit(
        org.tikv.kvproto.Kvrpcpb.CommitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.ImportResponse> kvImport(
        org.tikv.kvproto.Kvrpcpb.ImportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvImportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CleanupResponse> kvCleanup(
        org.tikv.kvproto.Kvrpcpb.CleanupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvCleanupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.BatchGetResponse> kvBatchGet(
        org.tikv.kvproto.Kvrpcpb.BatchGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvBatchGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse> kvBatchRollback(
        org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvBatchRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.ScanLockResponse> kvScanLock(
        org.tikv.kvproto.Kvrpcpb.ScanLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvScanLockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.ResolveLockResponse> kvResolveLock(
        org.tikv.kvproto.Kvrpcpb.ResolveLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvResolveLockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.GCResponse> kvGC(
        org.tikv.kvproto.Kvrpcpb.GCRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvGCMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse> kvDeleteRange(
        org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKvDeleteRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Raw commands; no transaction support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawGetResponse> rawGet(
        org.tikv.kvproto.Kvrpcpb.RawGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse> rawBatchGet(
        org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawPutResponse> rawPut(
        org.tikv.kvproto.Kvrpcpb.RawPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse> rawBatchPut(
        org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawDeleteResponse> rawDelete(
        org.tikv.kvproto.Kvrpcpb.RawDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse> rawBatchDelete(
        org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawScanResponse> rawScan(
        org.tikv.kvproto.Kvrpcpb.RawScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawScanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse> rawDeleteRange(
        org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawDeleteRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse> rawBatchScan(
        org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawBatchScanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get TTL of the key. Returns 0 if TTL is not set for the key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse> rawGetKeyTTL(
        org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawGetKeyTTLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compare if the value in database equals to `RawCASRequest.previous_value` before putting the new value. If not, this request will have no effect and the value in the database will be returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RawCASResponse> rawCompareAndSwap(
        org.tikv.kvproto.Kvrpcpb.RawCASRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawCompareAndSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VerKV commands.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerGetResponse> verGet(
        org.tikv.kvproto.Kvrpcpb.VerGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse> verBatchGet(
        org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerBatchGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerMutResponse> verMut(
        org.tikv.kvproto.Kvrpcpb.VerMutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerMutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse> verBatchMut(
        org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerBatchMutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerScanResponse> verScan(
        org.tikv.kvproto.Kvrpcpb.VerScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerScanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse> verDeleteRange(
        org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerDeleteRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store commands (sent to a each TiKV node in a cluster, rather than a certain region).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse> unsafeDestroyRange(
        org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsafeDestroyRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse> registerLockObserver(
        org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterLockObserverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse> checkLockObserver(
        org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckLockObserverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse> removeLockObserver(
        org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveLockObserverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse> physicalScanLock(
        org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPhysicalScanLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Commands for executing SQL in the TiKV coprocessor (i.e., 'pushed down' to TiKV rather than
     * executed in TiDB).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Coprocessor.Response> coprocessor(
        org.tikv.kvproto.Coprocessor.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoprocessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sent from PD or TiDB to a TiKV node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.SplitRegionResponse> splitRegion(
        org.tikv.kvproto.Kvrpcpb.SplitRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSplitRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sent from TiFlash or TiKV to a TiKV node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.ReadIndexResponse> readIndex(
        org.tikv.kvproto.Kvrpcpb.ReadIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Commands for debugging transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse> mvccGetByKey(
        org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMvccGetByKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse> mvccGetByStartTs(
        org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMvccGetByStartTsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * These are for mpp execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Mpp.DispatchTaskResponse> dispatchMPPTask(
        org.tikv.kvproto.Mpp.DispatchTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDispatchMPPTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Mpp.CancelTaskResponse> cancelMPPTask(
        org.tikv.kvproto.Mpp.CancelTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMPPTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47; CheckLeader sends all information (includes region term and epoch) to other stores.
     * / Once a store receives a request, it checks term and epoch for each region, and sends the regions whose 
     * / term and epoch match with local information in the store.
     * / After the client collected all responses from all stores, it checks if got a quorum of responses from
     * / other stores for every region, and decides to advance resolved ts from these regions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse> checkLeader(
        org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckLeaderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KV_GET = 0;
  private static final int METHODID_KV_SCAN = 1;
  private static final int METHODID_KV_PREWRITE = 2;
  private static final int METHODID_KV_PESSIMISTIC_LOCK = 3;
  private static final int METHODID_KVPESSIMISTIC_ROLLBACK = 4;
  private static final int METHODID_KV_TXN_HEART_BEAT = 5;
  private static final int METHODID_KV_CHECK_TXN_STATUS = 6;
  private static final int METHODID_KV_CHECK_SECONDARY_LOCKS = 7;
  private static final int METHODID_KV_COMMIT = 8;
  private static final int METHODID_KV_IMPORT = 9;
  private static final int METHODID_KV_CLEANUP = 10;
  private static final int METHODID_KV_BATCH_GET = 11;
  private static final int METHODID_KV_BATCH_ROLLBACK = 12;
  private static final int METHODID_KV_SCAN_LOCK = 13;
  private static final int METHODID_KV_RESOLVE_LOCK = 14;
  private static final int METHODID_KV_GC = 15;
  private static final int METHODID_KV_DELETE_RANGE = 16;
  private static final int METHODID_RAW_GET = 17;
  private static final int METHODID_RAW_BATCH_GET = 18;
  private static final int METHODID_RAW_PUT = 19;
  private static final int METHODID_RAW_BATCH_PUT = 20;
  private static final int METHODID_RAW_DELETE = 21;
  private static final int METHODID_RAW_BATCH_DELETE = 22;
  private static final int METHODID_RAW_SCAN = 23;
  private static final int METHODID_RAW_DELETE_RANGE = 24;
  private static final int METHODID_RAW_BATCH_SCAN = 25;
  private static final int METHODID_RAW_GET_KEY_TTL = 26;
  private static final int METHODID_RAW_COMPARE_AND_SWAP = 27;
  private static final int METHODID_VER_GET = 28;
  private static final int METHODID_VER_BATCH_GET = 29;
  private static final int METHODID_VER_MUT = 30;
  private static final int METHODID_VER_BATCH_MUT = 31;
  private static final int METHODID_VER_SCAN = 32;
  private static final int METHODID_VER_DELETE_RANGE = 33;
  private static final int METHODID_UNSAFE_DESTROY_RANGE = 34;
  private static final int METHODID_REGISTER_LOCK_OBSERVER = 35;
  private static final int METHODID_CHECK_LOCK_OBSERVER = 36;
  private static final int METHODID_REMOVE_LOCK_OBSERVER = 37;
  private static final int METHODID_PHYSICAL_SCAN_LOCK = 38;
  private static final int METHODID_COPROCESSOR = 39;
  private static final int METHODID_COPROCESSOR_STREAM = 40;
  private static final int METHODID_BATCH_COPROCESSOR = 41;
  private static final int METHODID_SPLIT_REGION = 42;
  private static final int METHODID_READ_INDEX = 43;
  private static final int METHODID_MVCC_GET_BY_KEY = 44;
  private static final int METHODID_MVCC_GET_BY_START_TS = 45;
  private static final int METHODID_DISPATCH_MPPTASK = 46;
  private static final int METHODID_CANCEL_MPPTASK = 47;
  private static final int METHODID_ESTABLISH_MPPCONNECTION = 48;
  private static final int METHODID_CHECK_LEADER = 49;
  private static final int METHODID_RAFT = 50;
  private static final int METHODID_BATCH_RAFT = 51;
  private static final int METHODID_SNAPSHOT = 52;
  private static final int METHODID_BATCH_COMMANDS = 53;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TikvImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TikvImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KV_GET:
          serviceImpl.kvGet((org.tikv.kvproto.Kvrpcpb.GetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GetResponse>) responseObserver);
          break;
        case METHODID_KV_SCAN:
          serviceImpl.kvScan((org.tikv.kvproto.Kvrpcpb.ScanRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanResponse>) responseObserver);
          break;
        case METHODID_KV_PREWRITE:
          serviceImpl.kvPrewrite((org.tikv.kvproto.Kvrpcpb.PrewriteRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PrewriteResponse>) responseObserver);
          break;
        case METHODID_KV_PESSIMISTIC_LOCK:
          serviceImpl.kvPessimisticLock((org.tikv.kvproto.Kvrpcpb.PessimisticLockRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticLockResponse>) responseObserver);
          break;
        case METHODID_KVPESSIMISTIC_ROLLBACK:
          serviceImpl.kVPessimisticRollback((org.tikv.kvproto.Kvrpcpb.PessimisticRollbackRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PessimisticRollbackResponse>) responseObserver);
          break;
        case METHODID_KV_TXN_HEART_BEAT:
          serviceImpl.kvTxnHeartBeat((org.tikv.kvproto.Kvrpcpb.TxnHeartBeatRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.TxnHeartBeatResponse>) responseObserver);
          break;
        case METHODID_KV_CHECK_TXN_STATUS:
          serviceImpl.kvCheckTxnStatus((org.tikv.kvproto.Kvrpcpb.CheckTxnStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckTxnStatusResponse>) responseObserver);
          break;
        case METHODID_KV_CHECK_SECONDARY_LOCKS:
          serviceImpl.kvCheckSecondaryLocks((org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckSecondaryLocksResponse>) responseObserver);
          break;
        case METHODID_KV_COMMIT:
          serviceImpl.kvCommit((org.tikv.kvproto.Kvrpcpb.CommitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CommitResponse>) responseObserver);
          break;
        case METHODID_KV_IMPORT:
          serviceImpl.kvImport((org.tikv.kvproto.Kvrpcpb.ImportRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ImportResponse>) responseObserver);
          break;
        case METHODID_KV_CLEANUP:
          serviceImpl.kvCleanup((org.tikv.kvproto.Kvrpcpb.CleanupRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CleanupResponse>) responseObserver);
          break;
        case METHODID_KV_BATCH_GET:
          serviceImpl.kvBatchGet((org.tikv.kvproto.Kvrpcpb.BatchGetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchGetResponse>) responseObserver);
          break;
        case METHODID_KV_BATCH_ROLLBACK:
          serviceImpl.kvBatchRollback((org.tikv.kvproto.Kvrpcpb.BatchRollbackRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.BatchRollbackResponse>) responseObserver);
          break;
        case METHODID_KV_SCAN_LOCK:
          serviceImpl.kvScanLock((org.tikv.kvproto.Kvrpcpb.ScanLockRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ScanLockResponse>) responseObserver);
          break;
        case METHODID_KV_RESOLVE_LOCK:
          serviceImpl.kvResolveLock((org.tikv.kvproto.Kvrpcpb.ResolveLockRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ResolveLockResponse>) responseObserver);
          break;
        case METHODID_KV_GC:
          serviceImpl.kvGC((org.tikv.kvproto.Kvrpcpb.GCRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.GCResponse>) responseObserver);
          break;
        case METHODID_KV_DELETE_RANGE:
          serviceImpl.kvDeleteRange((org.tikv.kvproto.Kvrpcpb.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_RAW_GET:
          serviceImpl.rawGet((org.tikv.kvproto.Kvrpcpb.RawGetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_GET:
          serviceImpl.rawBatchGet((org.tikv.kvproto.Kvrpcpb.RawBatchGetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchGetResponse>) responseObserver);
          break;
        case METHODID_RAW_PUT:
          serviceImpl.rawPut((org.tikv.kvproto.Kvrpcpb.RawPutRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawPutResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_PUT:
          serviceImpl.rawBatchPut((org.tikv.kvproto.Kvrpcpb.RawBatchPutRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchPutResponse>) responseObserver);
          break;
        case METHODID_RAW_DELETE:
          serviceImpl.rawDelete((org.tikv.kvproto.Kvrpcpb.RawDeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_DELETE:
          serviceImpl.rawBatchDelete((org.tikv.kvproto.Kvrpcpb.RawBatchDeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchDeleteResponse>) responseObserver);
          break;
        case METHODID_RAW_SCAN:
          serviceImpl.rawScan((org.tikv.kvproto.Kvrpcpb.RawScanRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawScanResponse>) responseObserver);
          break;
        case METHODID_RAW_DELETE_RANGE:
          serviceImpl.rawDeleteRange((org.tikv.kvproto.Kvrpcpb.RawDeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawDeleteRangeResponse>) responseObserver);
          break;
        case METHODID_RAW_BATCH_SCAN:
          serviceImpl.rawBatchScan((org.tikv.kvproto.Kvrpcpb.RawBatchScanRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawBatchScanResponse>) responseObserver);
          break;
        case METHODID_RAW_GET_KEY_TTL:
          serviceImpl.rawGetKeyTTL((org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawGetKeyTTLResponse>) responseObserver);
          break;
        case METHODID_RAW_COMPARE_AND_SWAP:
          serviceImpl.rawCompareAndSwap((org.tikv.kvproto.Kvrpcpb.RawCASRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RawCASResponse>) responseObserver);
          break;
        case METHODID_VER_GET:
          serviceImpl.verGet((org.tikv.kvproto.Kvrpcpb.VerGetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerGetResponse>) responseObserver);
          break;
        case METHODID_VER_BATCH_GET:
          serviceImpl.verBatchGet((org.tikv.kvproto.Kvrpcpb.VerBatchGetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchGetResponse>) responseObserver);
          break;
        case METHODID_VER_MUT:
          serviceImpl.verMut((org.tikv.kvproto.Kvrpcpb.VerMutRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerMutResponse>) responseObserver);
          break;
        case METHODID_VER_BATCH_MUT:
          serviceImpl.verBatchMut((org.tikv.kvproto.Kvrpcpb.VerBatchMutRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerBatchMutResponse>) responseObserver);
          break;
        case METHODID_VER_SCAN:
          serviceImpl.verScan((org.tikv.kvproto.Kvrpcpb.VerScanRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerScanResponse>) responseObserver);
          break;
        case METHODID_VER_DELETE_RANGE:
          serviceImpl.verDeleteRange((org.tikv.kvproto.Kvrpcpb.VerDeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.VerDeleteRangeResponse>) responseObserver);
          break;
        case METHODID_UNSAFE_DESTROY_RANGE:
          serviceImpl.unsafeDestroyRange((org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.UnsafeDestroyRangeResponse>) responseObserver);
          break;
        case METHODID_REGISTER_LOCK_OBSERVER:
          serviceImpl.registerLockObserver((org.tikv.kvproto.Kvrpcpb.RegisterLockObserverRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RegisterLockObserverResponse>) responseObserver);
          break;
        case METHODID_CHECK_LOCK_OBSERVER:
          serviceImpl.checkLockObserver((org.tikv.kvproto.Kvrpcpb.CheckLockObserverRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLockObserverResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LOCK_OBSERVER:
          serviceImpl.removeLockObserver((org.tikv.kvproto.Kvrpcpb.RemoveLockObserverRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.RemoveLockObserverResponse>) responseObserver);
          break;
        case METHODID_PHYSICAL_SCAN_LOCK:
          serviceImpl.physicalScanLock((org.tikv.kvproto.Kvrpcpb.PhysicalScanLockRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.PhysicalScanLockResponse>) responseObserver);
          break;
        case METHODID_COPROCESSOR:
          serviceImpl.coprocessor((org.tikv.kvproto.Coprocessor.Request) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response>) responseObserver);
          break;
        case METHODID_COPROCESSOR_STREAM:
          serviceImpl.coprocessorStream((org.tikv.kvproto.Coprocessor.Request) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.Response>) responseObserver);
          break;
        case METHODID_BATCH_COPROCESSOR:
          serviceImpl.batchCoprocessor((org.tikv.kvproto.Coprocessor.BatchRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Coprocessor.BatchResponse>) responseObserver);
          break;
        case METHODID_SPLIT_REGION:
          serviceImpl.splitRegion((org.tikv.kvproto.Kvrpcpb.SplitRegionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.SplitRegionResponse>) responseObserver);
          break;
        case METHODID_READ_INDEX:
          serviceImpl.readIndex((org.tikv.kvproto.Kvrpcpb.ReadIndexRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.ReadIndexResponse>) responseObserver);
          break;
        case METHODID_MVCC_GET_BY_KEY:
          serviceImpl.mvccGetByKey((org.tikv.kvproto.Kvrpcpb.MvccGetByKeyRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByKeyResponse>) responseObserver);
          break;
        case METHODID_MVCC_GET_BY_START_TS:
          serviceImpl.mvccGetByStartTs((org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.MvccGetByStartTsResponse>) responseObserver);
          break;
        case METHODID_DISPATCH_MPPTASK:
          serviceImpl.dispatchMPPTask((org.tikv.kvproto.Mpp.DispatchTaskRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.DispatchTaskResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MPPTASK:
          serviceImpl.cancelMPPTask((org.tikv.kvproto.Mpp.CancelTaskRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.CancelTaskResponse>) responseObserver);
          break;
        case METHODID_ESTABLISH_MPPCONNECTION:
          serviceImpl.establishMPPConnection((org.tikv.kvproto.Mpp.EstablishMPPConnectionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Mpp.MPPDataPacket>) responseObserver);
          break;
        case METHODID_CHECK_LEADER:
          serviceImpl.checkLeader((org.tikv.kvproto.Kvrpcpb.CheckLeaderRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Kvrpcpb.CheckLeaderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RAFT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.raft(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done>) responseObserver);
        case METHODID_BATCH_RAFT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchRaft(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done>) responseObserver);
        case METHODID_SNAPSHOT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.snapshot(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.RaftServerpb.Done>) responseObserver);
        case METHODID_BATCH_COMMANDS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchCommands(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Tikvpb.BatchCommandsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TikvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TikvBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.Tikvpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tikv");
    }
  }

  private static final class TikvFileDescriptorSupplier
      extends TikvBaseDescriptorSupplier {
    TikvFileDescriptorSupplier() {}
  }

  private static final class TikvMethodDescriptorSupplier
      extends TikvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TikvMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TikvGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TikvFileDescriptorSupplier())
              .addMethod(getKvGetMethod())
              .addMethod(getKvScanMethod())
              .addMethod(getKvPrewriteMethod())
              .addMethod(getKvPessimisticLockMethod())
              .addMethod(getKVPessimisticRollbackMethod())
              .addMethod(getKvTxnHeartBeatMethod())
              .addMethod(getKvCheckTxnStatusMethod())
              .addMethod(getKvCheckSecondaryLocksMethod())
              .addMethod(getKvCommitMethod())
              .addMethod(getKvImportMethod())
              .addMethod(getKvCleanupMethod())
              .addMethod(getKvBatchGetMethod())
              .addMethod(getKvBatchRollbackMethod())
              .addMethod(getKvScanLockMethod())
              .addMethod(getKvResolveLockMethod())
              .addMethod(getKvGCMethod())
              .addMethod(getKvDeleteRangeMethod())
              .addMethod(getRawGetMethod())
              .addMethod(getRawBatchGetMethod())
              .addMethod(getRawPutMethod())
              .addMethod(getRawBatchPutMethod())
              .addMethod(getRawDeleteMethod())
              .addMethod(getRawBatchDeleteMethod())
              .addMethod(getRawScanMethod())
              .addMethod(getRawDeleteRangeMethod())
              .addMethod(getRawBatchScanMethod())
              .addMethod(getRawGetKeyTTLMethod())
              .addMethod(getRawCompareAndSwapMethod())
              .addMethod(getVerGetMethod())
              .addMethod(getVerBatchGetMethod())
              .addMethod(getVerMutMethod())
              .addMethod(getVerBatchMutMethod())
              .addMethod(getVerScanMethod())
              .addMethod(getVerDeleteRangeMethod())
              .addMethod(getUnsafeDestroyRangeMethod())
              .addMethod(getRegisterLockObserverMethod())
              .addMethod(getCheckLockObserverMethod())
              .addMethod(getRemoveLockObserverMethod())
              .addMethod(getPhysicalScanLockMethod())
              .addMethod(getCoprocessorMethod())
              .addMethod(getCoprocessorStreamMethod())
              .addMethod(getBatchCoprocessorMethod())
              .addMethod(getRaftMethod())
              .addMethod(getBatchRaftMethod())
              .addMethod(getSnapshotMethod())
              .addMethod(getSplitRegionMethod())
              .addMethod(getReadIndexMethod())
              .addMethod(getMvccGetByKeyMethod())
              .addMethod(getMvccGetByStartTsMethod())
              .addMethod(getBatchCommandsMethod())
              .addMethod(getDispatchMPPTaskMethod())
              .addMethod(getCancelMPPTaskMethod())
              .addMethod(getEstablishMPPConnectionMethod())
              .addMethod(getCheckLeaderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
