package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: cdcpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChangeDataGrpc {

  private ChangeDataGrpc() {}

  public static final String SERVICE_NAME = "cdcpb.ChangeData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Cdcpb.ChangeDataRequest,
      org.tikv.kvproto.Cdcpb.ChangeDataEvent> getEventFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EventFeed",
      requestType = org.tikv.kvproto.Cdcpb.ChangeDataRequest.class,
      responseType = org.tikv.kvproto.Cdcpb.ChangeDataEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Cdcpb.ChangeDataRequest,
      org.tikv.kvproto.Cdcpb.ChangeDataEvent> getEventFeedMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Cdcpb.ChangeDataRequest, org.tikv.kvproto.Cdcpb.ChangeDataEvent> getEventFeedMethod;
    if ((getEventFeedMethod = ChangeDataGrpc.getEventFeedMethod) == null) {
      synchronized (ChangeDataGrpc.class) {
        if ((getEventFeedMethod = ChangeDataGrpc.getEventFeedMethod) == null) {
          ChangeDataGrpc.getEventFeedMethod = getEventFeedMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Cdcpb.ChangeDataRequest, org.tikv.kvproto.Cdcpb.ChangeDataEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EventFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Cdcpb.ChangeDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Cdcpb.ChangeDataEvent.getDefaultInstance()))
              .setSchemaDescriptor(new ChangeDataMethodDescriptorSupplier("EventFeed"))
              .build();
        }
      }
    }
    return getEventFeedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChangeDataStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeDataStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeDataStub>() {
        @java.lang.Override
        public ChangeDataStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeDataStub(channel, callOptions);
        }
      };
    return ChangeDataStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChangeDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeDataBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeDataBlockingStub>() {
        @java.lang.Override
        public ChangeDataBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeDataBlockingStub(channel, callOptions);
        }
      };
    return ChangeDataBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChangeDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChangeDataFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChangeDataFutureStub>() {
        @java.lang.Override
        public ChangeDataFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChangeDataFutureStub(channel, callOptions);
        }
      };
    return ChangeDataFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChangeDataImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Cdcpb.ChangeDataRequest> eventFeed(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Cdcpb.ChangeDataEvent> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEventFeedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEventFeedMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Cdcpb.ChangeDataRequest,
                org.tikv.kvproto.Cdcpb.ChangeDataEvent>(
                  this, METHODID_EVENT_FEED)))
          .build();
    }
  }

  /**
   */
  public static final class ChangeDataStub extends io.grpc.stub.AbstractAsyncStub<ChangeDataStub> {
    private ChangeDataStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeDataStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeDataStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Cdcpb.ChangeDataRequest> eventFeed(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Cdcpb.ChangeDataEvent> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEventFeedMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChangeDataBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChangeDataBlockingStub> {
    private ChangeDataBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeDataBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeDataBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ChangeDataFutureStub extends io.grpc.stub.AbstractFutureStub<ChangeDataFutureStub> {
    private ChangeDataFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChangeDataFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChangeDataFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EVENT_FEED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChangeDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChangeDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EVENT_FEED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.eventFeed(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Cdcpb.ChangeDataEvent>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChangeDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChangeDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.Cdcpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChangeData");
    }
  }

  private static final class ChangeDataFileDescriptorSupplier
      extends ChangeDataBaseDescriptorSupplier {
    ChangeDataFileDescriptorSupplier() {}
  }

  private static final class ChangeDataMethodDescriptorSupplier
      extends ChangeDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChangeDataMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChangeDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChangeDataFileDescriptorSupplier())
              .addMethod(getEventFeedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
