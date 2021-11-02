package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: backup.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BackupGrpc {

  private BackupGrpc() {}

  public static final String SERVICE_NAME = "backup.Backup";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.BackupOuterClass.BackupRequest,
      org.tikv.kvproto.BackupOuterClass.BackupResponse> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "backup",
      requestType = org.tikv.kvproto.BackupOuterClass.BackupRequest.class,
      responseType = org.tikv.kvproto.BackupOuterClass.BackupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.BackupOuterClass.BackupRequest,
      org.tikv.kvproto.BackupOuterClass.BackupResponse> getBackupMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.BackupOuterClass.BackupRequest, org.tikv.kvproto.BackupOuterClass.BackupResponse> getBackupMethod;
    if ((getBackupMethod = BackupGrpc.getBackupMethod) == null) {
      synchronized (BackupGrpc.class) {
        if ((getBackupMethod = BackupGrpc.getBackupMethod) == null) {
          BackupGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.BackupOuterClass.BackupRequest, org.tikv.kvproto.BackupOuterClass.BackupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.BackupOuterClass.BackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.BackupOuterClass.BackupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupMethodDescriptorSupplier("backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BackupStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupStub>() {
        @java.lang.Override
        public BackupStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupStub(channel, callOptions);
        }
      };
    return BackupStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BackupBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupBlockingStub>() {
        @java.lang.Override
        public BackupBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupBlockingStub(channel, callOptions);
        }
      };
    return BackupBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BackupFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupFutureStub>() {
        @java.lang.Override
        public BackupFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupFutureStub(channel, callOptions);
        }
      };
    return BackupFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BackupImplBase implements io.grpc.BindableService {

    /**
     */
    public void backup(org.tikv.kvproto.BackupOuterClass.BackupRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.BackupOuterClass.BackupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBackupMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.BackupOuterClass.BackupRequest,
                org.tikv.kvproto.BackupOuterClass.BackupResponse>(
                  this, METHODID_BACKUP)))
          .build();
    }
  }

  /**
   */
  public static final class BackupStub extends io.grpc.stub.AbstractAsyncStub<BackupStub> {
    private BackupStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupStub(channel, callOptions);
    }

    /**
     */
    public void backup(org.tikv.kvproto.BackupOuterClass.BackupRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.BackupOuterClass.BackupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BackupBlockingStub extends io.grpc.stub.AbstractBlockingStub<BackupBlockingStub> {
    private BackupBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.tikv.kvproto.BackupOuterClass.BackupResponse> backup(
        org.tikv.kvproto.BackupOuterClass.BackupRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BackupFutureStub extends io.grpc.stub.AbstractFutureStub<BackupFutureStub> {
    private BackupFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BACKUP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BackupImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BackupImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BACKUP:
          serviceImpl.backup((org.tikv.kvproto.BackupOuterClass.BackupRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.BackupOuterClass.BackupResponse>) responseObserver);
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

  private static abstract class BackupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BackupBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.BackupOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Backup");
    }
  }

  private static final class BackupFileDescriptorSupplier
      extends BackupBaseDescriptorSupplier {
    BackupFileDescriptorSupplier() {}
  }

  private static final class BackupMethodDescriptorSupplier
      extends BackupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BackupMethodDescriptorSupplier(String methodName) {
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
      synchronized (BackupGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BackupFileDescriptorSupplier())
              .addMethod(getBackupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
