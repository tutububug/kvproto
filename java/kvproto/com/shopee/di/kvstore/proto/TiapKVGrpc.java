package com.shopee.di.kvstore.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Key/value store API for TiAP.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: tiappb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TiapKVGrpc {

  private TiapKVGrpc() {}

  public static final String SERVICE_NAME = "tiap_servicepb.TiapKV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest,
      com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> getRawKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawKV",
      requestType = com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest.class,
      responseType = com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest,
      com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> getRawKVMethod() {
    io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest, com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> getRawKVMethod;
    if ((getRawKVMethod = TiapKVGrpc.getRawKVMethod) == null) {
      synchronized (TiapKVGrpc.class) {
        if ((getRawKVMethod = TiapKVGrpc.getRawKVMethod) == null) {
          TiapKVGrpc.getRawKVMethod = getRawKVMethod =
              io.grpc.MethodDescriptor.<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest, com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TiapKVMethodDescriptorSupplier("RawKV"))
              .build();
        }
      }
    }
    return getRawKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest,
      com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> getHBaseLikeKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HBaseLikeKV",
      requestType = com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest.class,
      responseType = com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest,
      com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> getHBaseLikeKVMethod() {
    io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest, com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> getHBaseLikeKVMethod;
    if ((getHBaseLikeKVMethod = TiapKVGrpc.getHBaseLikeKVMethod) == null) {
      synchronized (TiapKVGrpc.class) {
        if ((getHBaseLikeKVMethod = TiapKVGrpc.getHBaseLikeKVMethod) == null) {
          TiapKVGrpc.getHBaseLikeKVMethod = getHBaseLikeKVMethod =
              io.grpc.MethodDescriptor.<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest, com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HBaseLikeKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TiapKVMethodDescriptorSupplier("HBaseLikeKV"))
              .build();
        }
      }
    }
    return getHBaseLikeKVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TiapKVStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapKVStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapKVStub>() {
        @java.lang.Override
        public TiapKVStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapKVStub(channel, callOptions);
        }
      };
    return TiapKVStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TiapKVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapKVBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapKVBlockingStub>() {
        @java.lang.Override
        public TiapKVBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapKVBlockingStub(channel, callOptions);
        }
      };
    return TiapKVBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TiapKVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapKVFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapKVFutureStub>() {
        @java.lang.Override
        public TiapKVFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapKVFutureStub(channel, callOptions);
        }
      };
    return TiapKVFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Key/value store API for TiAP.
   * </pre>
   */
  public static abstract class TiapKVImplBase implements io.grpc.BindableService {

    /**
     */
    public void rawKV(com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawKVMethod(), responseObserver);
    }

    /**
     */
    public void hBaseLikeKV(com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHBaseLikeKVMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRawKVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest,
                com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse>(
                  this, METHODID_RAW_KV)))
          .addMethod(
            getHBaseLikeKVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest,
                com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse>(
                  this, METHODID_HBASE_LIKE_KV)))
          .build();
    }
  }

  /**
   * <pre>
   * Key/value store API for TiAP.
   * </pre>
   */
  public static final class TiapKVStub extends io.grpc.stub.AbstractAsyncStub<TiapKVStub> {
    private TiapKVStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapKVStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapKVStub(channel, callOptions);
    }

    /**
     */
    public void rawKV(com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hBaseLikeKV(com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHBaseLikeKVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Key/value store API for TiAP.
   * </pre>
   */
  public static final class TiapKVBlockingStub extends io.grpc.stub.AbstractBlockingStub<TiapKVBlockingStub> {
    private TiapKVBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapKVBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapKVBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse rawKV(com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawKVMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse hBaseLikeKV(com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHBaseLikeKVMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Key/value store API for TiAP.
   * </pre>
   */
  public static final class TiapKVFutureStub extends io.grpc.stub.AbstractFutureStub<TiapKVFutureStub> {
    private TiapKVFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapKVFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapKVFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse> rawKV(
        com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawKVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse> hBaseLikeKV(
        com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHBaseLikeKVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RAW_KV = 0;
  private static final int METHODID_HBASE_LIKE_KV = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TiapKVImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TiapKVImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RAW_KV:
          serviceImpl.rawKV((com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVRequest) request,
              (io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawKvrpcpb.KVResponse>) responseObserver);
          break;
        case METHODID_HBASE_LIKE_KV:
          serviceImpl.hBaseLikeKV((com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVRequest) request,
              (io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeKvrpcpb.KVResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TiapKVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TiapKVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shopee.di.kvstore.proto.Tiappb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TiapKV");
    }
  }

  private static final class TiapKVFileDescriptorSupplier
      extends TiapKVBaseDescriptorSupplier {
    TiapKVFileDescriptorSupplier() {}
  }

  private static final class TiapKVMethodDescriptorSupplier
      extends TiapKVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TiapKVMethodDescriptorSupplier(String methodName) {
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
      synchronized (TiapKVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TiapKVFileDescriptorSupplier())
              .addMethod(getRawKVMethod())
              .addMethod(getHBaseLikeKVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
