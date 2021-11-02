package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Diagnostics service for TiDB cluster components.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: diagnosticspb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiagnosticsGrpc {

  private DiagnosticsGrpc() {}

  public static final String SERVICE_NAME = "diagnosticspb.Diagnostics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.SearchLogRequest,
      org.tikv.kvproto.Diagnosticspb.SearchLogResponse> getSearchLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_log",
      requestType = org.tikv.kvproto.Diagnosticspb.SearchLogRequest.class,
      responseType = org.tikv.kvproto.Diagnosticspb.SearchLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.SearchLogRequest,
      org.tikv.kvproto.Diagnosticspb.SearchLogResponse> getSearchLogMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.SearchLogRequest, org.tikv.kvproto.Diagnosticspb.SearchLogResponse> getSearchLogMethod;
    if ((getSearchLogMethod = DiagnosticsGrpc.getSearchLogMethod) == null) {
      synchronized (DiagnosticsGrpc.class) {
        if ((getSearchLogMethod = DiagnosticsGrpc.getSearchLogMethod) == null) {
          DiagnosticsGrpc.getSearchLogMethod = getSearchLogMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Diagnosticspb.SearchLogRequest, org.tikv.kvproto.Diagnosticspb.SearchLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Diagnosticspb.SearchLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Diagnosticspb.SearchLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiagnosticsMethodDescriptorSupplier("search_log"))
              .build();
        }
      }
    }
    return getSearchLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.ServerInfoRequest,
      org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> getServerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "server_info",
      requestType = org.tikv.kvproto.Diagnosticspb.ServerInfoRequest.class,
      responseType = org.tikv.kvproto.Diagnosticspb.ServerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.ServerInfoRequest,
      org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> getServerInfoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Diagnosticspb.ServerInfoRequest, org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> getServerInfoMethod;
    if ((getServerInfoMethod = DiagnosticsGrpc.getServerInfoMethod) == null) {
      synchronized (DiagnosticsGrpc.class) {
        if ((getServerInfoMethod = DiagnosticsGrpc.getServerInfoMethod) == null) {
          DiagnosticsGrpc.getServerInfoMethod = getServerInfoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Diagnosticspb.ServerInfoRequest, org.tikv.kvproto.Diagnosticspb.ServerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "server_info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Diagnosticspb.ServerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Diagnosticspb.ServerInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiagnosticsMethodDescriptorSupplier("server_info"))
              .build();
        }
      }
    }
    return getServerInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiagnosticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiagnosticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiagnosticsStub>() {
        @java.lang.Override
        public DiagnosticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiagnosticsStub(channel, callOptions);
        }
      };
    return DiagnosticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiagnosticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiagnosticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiagnosticsBlockingStub>() {
        @java.lang.Override
        public DiagnosticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiagnosticsBlockingStub(channel, callOptions);
        }
      };
    return DiagnosticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiagnosticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiagnosticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiagnosticsFutureStub>() {
        @java.lang.Override
        public DiagnosticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiagnosticsFutureStub(channel, callOptions);
        }
      };
    return DiagnosticsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Diagnostics service for TiDB cluster components.
   * </pre>
   */
  public static abstract class DiagnosticsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Searchs log in the target node
     * </pre>
     */
    public void searchLog(org.tikv.kvproto.Diagnosticspb.SearchLogRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.SearchLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves server info in the target node
     * </pre>
     */
    public void serverInfo(org.tikv.kvproto.Diagnosticspb.ServerInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchLogMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Diagnosticspb.SearchLogRequest,
                org.tikv.kvproto.Diagnosticspb.SearchLogResponse>(
                  this, METHODID_SEARCH_LOG)))
          .addMethod(
            getServerInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Diagnosticspb.ServerInfoRequest,
                org.tikv.kvproto.Diagnosticspb.ServerInfoResponse>(
                  this, METHODID_SERVER_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * Diagnostics service for TiDB cluster components.
   * </pre>
   */
  public static final class DiagnosticsStub extends io.grpc.stub.AbstractAsyncStub<DiagnosticsStub> {
    private DiagnosticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiagnosticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiagnosticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searchs log in the target node
     * </pre>
     */
    public void searchLog(org.tikv.kvproto.Diagnosticspb.SearchLogRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.SearchLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves server info in the target node
     * </pre>
     */
    public void serverInfo(org.tikv.kvproto.Diagnosticspb.ServerInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Diagnostics service for TiDB cluster components.
   * </pre>
   */
  public static final class DiagnosticsBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiagnosticsBlockingStub> {
    private DiagnosticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiagnosticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiagnosticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searchs log in the target node
     * </pre>
     */
    public java.util.Iterator<org.tikv.kvproto.Diagnosticspb.SearchLogResponse> searchLog(
        org.tikv.kvproto.Diagnosticspb.SearchLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves server info in the target node
     * </pre>
     */
    public org.tikv.kvproto.Diagnosticspb.ServerInfoResponse serverInfo(org.tikv.kvproto.Diagnosticspb.ServerInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Diagnostics service for TiDB cluster components.
   * </pre>
   */
  public static final class DiagnosticsFutureStub extends io.grpc.stub.AbstractFutureStub<DiagnosticsFutureStub> {
    private DiagnosticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiagnosticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiagnosticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves server info in the target node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Diagnosticspb.ServerInfoResponse> serverInfo(
        org.tikv.kvproto.Diagnosticspb.ServerInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_LOG = 0;
  private static final int METHODID_SERVER_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiagnosticsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiagnosticsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_LOG:
          serviceImpl.searchLog((org.tikv.kvproto.Diagnosticspb.SearchLogRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.SearchLogResponse>) responseObserver);
          break;
        case METHODID_SERVER_INFO:
          serviceImpl.serverInfo((org.tikv.kvproto.Diagnosticspb.ServerInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Diagnosticspb.ServerInfoResponse>) responseObserver);
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

  private static abstract class DiagnosticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiagnosticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.Diagnosticspb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Diagnostics");
    }
  }

  private static final class DiagnosticsFileDescriptorSupplier
      extends DiagnosticsBaseDescriptorSupplier {
    DiagnosticsFileDescriptorSupplier() {}
  }

  private static final class DiagnosticsMethodDescriptorSupplier
      extends DiagnosticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiagnosticsMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiagnosticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiagnosticsFileDescriptorSupplier())
              .addMethod(getSearchLogMethod())
              .addMethod(getServerInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
