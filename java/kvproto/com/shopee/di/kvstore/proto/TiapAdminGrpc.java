package com.shopee.di.kvstore.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DB/Table admin API for TiAP
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: tiappb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TiapAdminGrpc {

  private TiapAdminGrpc() {}

  public static final String SERVICE_NAME = "tiap_servicepb.TiapAdmin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> getDBAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DBAdmin",
      requestType = com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest.class,
      responseType = com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> getDBAdminMethod() {
    io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> getDBAdminMethod;
    if ((getDBAdminMethod = TiapAdminGrpc.getDBAdminMethod) == null) {
      synchronized (TiapAdminGrpc.class) {
        if ((getDBAdminMethod = TiapAdminGrpc.getDBAdminMethod) == null) {
          TiapAdminGrpc.getDBAdminMethod = getDBAdminMethod =
              io.grpc.MethodDescriptor.<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DBAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TiapAdminMethodDescriptorSupplier("DBAdmin"))
              .build();
        }
      }
    }
    return getDBAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> getRawTableAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawTableAdmin",
      requestType = com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest.class,
      responseType = com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> getRawTableAdminMethod() {
    io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> getRawTableAdminMethod;
    if ((getRawTableAdminMethod = TiapAdminGrpc.getRawTableAdminMethod) == null) {
      synchronized (TiapAdminGrpc.class) {
        if ((getRawTableAdminMethod = TiapAdminGrpc.getRawTableAdminMethod) == null) {
          TiapAdminGrpc.getRawTableAdminMethod = getRawTableAdminMethod =
              io.grpc.MethodDescriptor.<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawTableAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TiapAdminMethodDescriptorSupplier("RawTableAdmin"))
              .build();
        }
      }
    }
    return getRawTableAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> getHBaseLikeTableAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HBaseLikeTableAdmin",
      requestType = com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest.class,
      responseType = com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest,
      com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> getHBaseLikeTableAdminMethod() {
    io.grpc.MethodDescriptor<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> getHBaseLikeTableAdminMethod;
    if ((getHBaseLikeTableAdminMethod = TiapAdminGrpc.getHBaseLikeTableAdminMethod) == null) {
      synchronized (TiapAdminGrpc.class) {
        if ((getHBaseLikeTableAdminMethod = TiapAdminGrpc.getHBaseLikeTableAdminMethod) == null) {
          TiapAdminGrpc.getHBaseLikeTableAdminMethod = getHBaseLikeTableAdminMethod =
              io.grpc.MethodDescriptor.<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest, com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HBaseLikeTableAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TiapAdminMethodDescriptorSupplier("HBaseLikeTableAdmin"))
              .build();
        }
      }
    }
    return getHBaseLikeTableAdminMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TiapAdminStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapAdminStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapAdminStub>() {
        @java.lang.Override
        public TiapAdminStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapAdminStub(channel, callOptions);
        }
      };
    return TiapAdminStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TiapAdminBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapAdminBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapAdminBlockingStub>() {
        @java.lang.Override
        public TiapAdminBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapAdminBlockingStub(channel, callOptions);
        }
      };
    return TiapAdminBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TiapAdminFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TiapAdminFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TiapAdminFutureStub>() {
        @java.lang.Override
        public TiapAdminFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TiapAdminFutureStub(channel, callOptions);
        }
      };
    return TiapAdminFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DB/Table admin API for TiAP
   * </pre>
   */
  public static abstract class TiapAdminImplBase implements io.grpc.BindableService {

    /**
     */
    public void dBAdmin(com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDBAdminMethod(), responseObserver);
    }

    /**
     */
    public void rawTableAdmin(com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawTableAdminMethod(), responseObserver);
    }

    /**
     */
    public void hBaseLikeTableAdmin(com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHBaseLikeTableAdminMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDBAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest,
                com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse>(
                  this, METHODID_DBADMIN)))
          .addMethod(
            getRawTableAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest,
                com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse>(
                  this, METHODID_RAW_TABLE_ADMIN)))
          .addMethod(
            getHBaseLikeTableAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest,
                com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse>(
                  this, METHODID_HBASE_LIKE_TABLE_ADMIN)))
          .build();
    }
  }

  /**
   * <pre>
   * DB/Table admin API for TiAP
   * </pre>
   */
  public static final class TiapAdminStub extends io.grpc.stub.AbstractAsyncStub<TiapAdminStub> {
    private TiapAdminStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapAdminStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapAdminStub(channel, callOptions);
    }

    /**
     */
    public void dBAdmin(com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDBAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rawTableAdmin(com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawTableAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hBaseLikeTableAdmin(com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest request,
        io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHBaseLikeTableAdminMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DB/Table admin API for TiAP
   * </pre>
   */
  public static final class TiapAdminBlockingStub extends io.grpc.stub.AbstractBlockingStub<TiapAdminBlockingStub> {
    private TiapAdminBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapAdminBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapAdminBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse dBAdmin(com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDBAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse rawTableAdmin(com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawTableAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse hBaseLikeTableAdmin(com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHBaseLikeTableAdminMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DB/Table admin API for TiAP
   * </pre>
   */
  public static final class TiapAdminFutureStub extends io.grpc.stub.AbstractFutureStub<TiapAdminFutureStub> {
    private TiapAdminFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiapAdminFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TiapAdminFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse> dBAdmin(
        com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDBAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse> rawTableAdmin(
        com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawTableAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse> hBaseLikeTableAdmin(
        com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHBaseLikeTableAdminMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DBADMIN = 0;
  private static final int METHODID_RAW_TABLE_ADMIN = 1;
  private static final int METHODID_HBASE_LIKE_TABLE_ADMIN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TiapAdminImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TiapAdminImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DBADMIN:
          serviceImpl.dBAdmin((com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminRequest) request,
              (io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapAdminrpcpb.AdminResponse>) responseObserver);
          break;
        case METHODID_RAW_TABLE_ADMIN:
          serviceImpl.rawTableAdmin((com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminRequest) request,
              (io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapRawAdminrpcpb.AdminResponse>) responseObserver);
          break;
        case METHODID_HBASE_LIKE_TABLE_ADMIN:
          serviceImpl.hBaseLikeTableAdmin((com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminRequest) request,
              (io.grpc.stub.StreamObserver<com.shopee.di.kvstore.proto.TiapHbaselikeAdminrpcpb.AdminResponse>) responseObserver);
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

  private static abstract class TiapAdminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TiapAdminBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shopee.di.kvstore.proto.Tiappb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TiapAdmin");
    }
  }

  private static final class TiapAdminFileDescriptorSupplier
      extends TiapAdminBaseDescriptorSupplier {
    TiapAdminFileDescriptorSupplier() {}
  }

  private static final class TiapAdminMethodDescriptorSupplier
      extends TiapAdminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TiapAdminMethodDescriptorSupplier(String methodName) {
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
      synchronized (TiapAdminGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TiapAdminFileDescriptorSupplier())
              .addMethod(getDBAdminMethod())
              .addMethod(getRawTableAdminMethod())
              .addMethod(getHBaseLikeTableAdminMethod())
              .build();
        }
      }
    }
    return result;
  }
}
