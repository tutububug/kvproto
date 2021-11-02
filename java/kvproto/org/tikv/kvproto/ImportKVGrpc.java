package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ImportKV provides a service to import key-value pairs to TiKV.
 * In order to import key-value pairs to TiKV, the user should:
 * 1. Open an engine identified by an UUID.
 * 2. Open write streams to write key-value batches to the opened engine.
 *    Different streams/clients can write to the same engine concurrently.
 * 3. Close the engine after all write batches have been finished. An
 *    engine can only be closed when all write streams are closed. An
 *    engine can only be closed once, and it can not be opened again
 *    once it is closed.
 * 4. Import the data in the engine to the target cluster. Note that
 *    the import process is not atomic, it requires the data to be
 *    idempotent on retry. An engine can only be imported after it is
 *    closed. An engine can be imported multiple times, but can not be
 *    imported concurrently.
 * 5. Clean up the engine after it has been imported. Delete all data
 *    in the engine. An engine can not be cleaned up when it is
 *    writing or importing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: import_kvpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImportKVGrpc {

  private ImportKVGrpc() {}

  public static final String SERVICE_NAME = "import_kvpb.ImportKV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.SwitchModeRequest,
      org.tikv.kvproto.ImportKvpb.SwitchModeResponse> getSwitchModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwitchMode",
      requestType = org.tikv.kvproto.ImportKvpb.SwitchModeRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.SwitchModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.SwitchModeRequest,
      org.tikv.kvproto.ImportKvpb.SwitchModeResponse> getSwitchModeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.SwitchModeRequest, org.tikv.kvproto.ImportKvpb.SwitchModeResponse> getSwitchModeMethod;
    if ((getSwitchModeMethod = ImportKVGrpc.getSwitchModeMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getSwitchModeMethod = ImportKVGrpc.getSwitchModeMethod) == null) {
          ImportKVGrpc.getSwitchModeMethod = getSwitchModeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.SwitchModeRequest, org.tikv.kvproto.ImportKvpb.SwitchModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwitchMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.SwitchModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.SwitchModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("SwitchMode"))
              .build();
        }
      }
    }
    return getSwitchModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.OpenEngineRequest,
      org.tikv.kvproto.ImportKvpb.OpenEngineResponse> getOpenEngineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenEngine",
      requestType = org.tikv.kvproto.ImportKvpb.OpenEngineRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.OpenEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.OpenEngineRequest,
      org.tikv.kvproto.ImportKvpb.OpenEngineResponse> getOpenEngineMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.OpenEngineRequest, org.tikv.kvproto.ImportKvpb.OpenEngineResponse> getOpenEngineMethod;
    if ((getOpenEngineMethod = ImportKVGrpc.getOpenEngineMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getOpenEngineMethod = ImportKVGrpc.getOpenEngineMethod) == null) {
          ImportKVGrpc.getOpenEngineMethod = getOpenEngineMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.OpenEngineRequest, org.tikv.kvproto.ImportKvpb.OpenEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenEngine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.OpenEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.OpenEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("OpenEngine"))
              .build();
        }
      }
    }
    return getOpenEngineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineRequest,
      org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteEngine",
      requestType = org.tikv.kvproto.ImportKvpb.WriteEngineRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.WriteEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineRequest,
      org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineRequest, org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineMethod;
    if ((getWriteEngineMethod = ImportKVGrpc.getWriteEngineMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getWriteEngineMethod = ImportKVGrpc.getWriteEngineMethod) == null) {
          ImportKVGrpc.getWriteEngineMethod = getWriteEngineMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.WriteEngineRequest, org.tikv.kvproto.ImportKvpb.WriteEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteEngine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.WriteEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.WriteEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("WriteEngine"))
              .build();
        }
      }
    }
    return getWriteEngineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineV3Request,
      org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineV3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteEngineV3",
      requestType = org.tikv.kvproto.ImportKvpb.WriteEngineV3Request.class,
      responseType = org.tikv.kvproto.ImportKvpb.WriteEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineV3Request,
      org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineV3Method() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.WriteEngineV3Request, org.tikv.kvproto.ImportKvpb.WriteEngineResponse> getWriteEngineV3Method;
    if ((getWriteEngineV3Method = ImportKVGrpc.getWriteEngineV3Method) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getWriteEngineV3Method = ImportKVGrpc.getWriteEngineV3Method) == null) {
          ImportKVGrpc.getWriteEngineV3Method = getWriteEngineV3Method =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.WriteEngineV3Request, org.tikv.kvproto.ImportKvpb.WriteEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteEngineV3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.WriteEngineV3Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.WriteEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("WriteEngineV3"))
              .build();
        }
      }
    }
    return getWriteEngineV3Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CloseEngineRequest,
      org.tikv.kvproto.ImportKvpb.CloseEngineResponse> getCloseEngineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseEngine",
      requestType = org.tikv.kvproto.ImportKvpb.CloseEngineRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.CloseEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CloseEngineRequest,
      org.tikv.kvproto.ImportKvpb.CloseEngineResponse> getCloseEngineMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CloseEngineRequest, org.tikv.kvproto.ImportKvpb.CloseEngineResponse> getCloseEngineMethod;
    if ((getCloseEngineMethod = ImportKVGrpc.getCloseEngineMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getCloseEngineMethod = ImportKVGrpc.getCloseEngineMethod) == null) {
          ImportKVGrpc.getCloseEngineMethod = getCloseEngineMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.CloseEngineRequest, org.tikv.kvproto.ImportKvpb.CloseEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseEngine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CloseEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CloseEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("CloseEngine"))
              .build();
        }
      }
    }
    return getCloseEngineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.ImportEngineRequest,
      org.tikv.kvproto.ImportKvpb.ImportEngineResponse> getImportEngineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportEngine",
      requestType = org.tikv.kvproto.ImportKvpb.ImportEngineRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.ImportEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.ImportEngineRequest,
      org.tikv.kvproto.ImportKvpb.ImportEngineResponse> getImportEngineMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.ImportEngineRequest, org.tikv.kvproto.ImportKvpb.ImportEngineResponse> getImportEngineMethod;
    if ((getImportEngineMethod = ImportKVGrpc.getImportEngineMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getImportEngineMethod = ImportKVGrpc.getImportEngineMethod) == null) {
          ImportKVGrpc.getImportEngineMethod = getImportEngineMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.ImportEngineRequest, org.tikv.kvproto.ImportKvpb.ImportEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportEngine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.ImportEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.ImportEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("ImportEngine"))
              .build();
        }
      }
    }
    return getImportEngineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CleanupEngineRequest,
      org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> getCleanupEngineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanupEngine",
      requestType = org.tikv.kvproto.ImportKvpb.CleanupEngineRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.CleanupEngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CleanupEngineRequest,
      org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> getCleanupEngineMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CleanupEngineRequest, org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> getCleanupEngineMethod;
    if ((getCleanupEngineMethod = ImportKVGrpc.getCleanupEngineMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getCleanupEngineMethod = ImportKVGrpc.getCleanupEngineMethod) == null) {
          ImportKVGrpc.getCleanupEngineMethod = getCleanupEngineMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.CleanupEngineRequest, org.tikv.kvproto.ImportKvpb.CleanupEngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanupEngine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CleanupEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CleanupEngineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("CleanupEngine"))
              .build();
        }
      }
    }
    return getCleanupEngineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CompactClusterRequest,
      org.tikv.kvproto.ImportKvpb.CompactClusterResponse> getCompactClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompactCluster",
      requestType = org.tikv.kvproto.ImportKvpb.CompactClusterRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.CompactClusterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CompactClusterRequest,
      org.tikv.kvproto.ImportKvpb.CompactClusterResponse> getCompactClusterMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.CompactClusterRequest, org.tikv.kvproto.ImportKvpb.CompactClusterResponse> getCompactClusterMethod;
    if ((getCompactClusterMethod = ImportKVGrpc.getCompactClusterMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getCompactClusterMethod = ImportKVGrpc.getCompactClusterMethod) == null) {
          ImportKVGrpc.getCompactClusterMethod = getCompactClusterMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.CompactClusterRequest, org.tikv.kvproto.ImportKvpb.CompactClusterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompactCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CompactClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.CompactClusterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("CompactCluster"))
              .build();
        }
      }
    }
    return getCompactClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetVersionRequest,
      org.tikv.kvproto.ImportKvpb.GetVersionResponse> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = org.tikv.kvproto.ImportKvpb.GetVersionRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.GetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetVersionRequest,
      org.tikv.kvproto.ImportKvpb.GetVersionResponse> getGetVersionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetVersionRequest, org.tikv.kvproto.ImportKvpb.GetVersionResponse> getGetVersionMethod;
    if ((getGetVersionMethod = ImportKVGrpc.getGetVersionMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getGetVersionMethod = ImportKVGrpc.getGetVersionMethod) == null) {
          ImportKVGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.GetVersionRequest, org.tikv.kvproto.ImportKvpb.GetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.GetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetMetricsRequest,
      org.tikv.kvproto.ImportKvpb.GetMetricsResponse> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = org.tikv.kvproto.ImportKvpb.GetMetricsRequest.class,
      responseType = org.tikv.kvproto.ImportKvpb.GetMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetMetricsRequest,
      org.tikv.kvproto.ImportKvpb.GetMetricsResponse> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportKvpb.GetMetricsRequest, org.tikv.kvproto.ImportKvpb.GetMetricsResponse> getGetMetricsMethod;
    if ((getGetMetricsMethod = ImportKVGrpc.getGetMetricsMethod) == null) {
      synchronized (ImportKVGrpc.class) {
        if ((getGetMetricsMethod = ImportKVGrpc.getGetMetricsMethod) == null) {
          ImportKVGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportKvpb.GetMetricsRequest, org.tikv.kvproto.ImportKvpb.GetMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.GetMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportKvpb.GetMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportKVMethodDescriptorSupplier("GetMetrics"))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImportKVStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportKVStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportKVStub>() {
        @java.lang.Override
        public ImportKVStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportKVStub(channel, callOptions);
        }
      };
    return ImportKVStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImportKVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportKVBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportKVBlockingStub>() {
        @java.lang.Override
        public ImportKVBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportKVBlockingStub(channel, callOptions);
        }
      };
    return ImportKVBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImportKVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportKVFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportKVFutureStub>() {
        @java.lang.Override
        public ImportKVFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportKVFutureStub(channel, callOptions);
        }
      };
    return ImportKVFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ImportKV provides a service to import key-value pairs to TiKV.
   * In order to import key-value pairs to TiKV, the user should:
   * 1. Open an engine identified by an UUID.
   * 2. Open write streams to write key-value batches to the opened engine.
   *    Different streams/clients can write to the same engine concurrently.
   * 3. Close the engine after all write batches have been finished. An
   *    engine can only be closed when all write streams are closed. An
   *    engine can only be closed once, and it can not be opened again
   *    once it is closed.
   * 4. Import the data in the engine to the target cluster. Note that
   *    the import process is not atomic, it requires the data to be
   *    idempotent on retry. An engine can only be imported after it is
   *    closed. An engine can be imported multiple times, but can not be
   *    imported concurrently.
   * 5. Clean up the engine after it has been imported. Delete all data
   *    in the engine. An engine can not be cleaned up when it is
   *    writing or importing.
   * </pre>
   */
  public static abstract class ImportKVImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Switch the target cluster to normal/import mode.
     * </pre>
     */
    public void switchMode(org.tikv.kvproto.ImportKvpb.SwitchModeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.SwitchModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwitchModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open an engine.
     * </pre>
     */
    public void openEngine(org.tikv.kvproto.ImportKvpb.OpenEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.OpenEngineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenEngineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a write stream to the engine.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineRequest> writeEngine(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteEngineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write to engine, single message version
     * </pre>
     */
    public void writeEngineV3(org.tikv.kvproto.ImportKvpb.WriteEngineV3Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteEngineV3Method(), responseObserver);
    }

    /**
     * <pre>
     * Close the engine.
     * </pre>
     */
    public void closeEngine(org.tikv.kvproto.ImportKvpb.CloseEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CloseEngineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseEngineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import the engine to the target cluster.
     * </pre>
     */
    public void importEngine(org.tikv.kvproto.ImportKvpb.ImportEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.ImportEngineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportEngineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clean up the engine.
     * </pre>
     */
    public void cleanupEngine(org.tikv.kvproto.ImportKvpb.CleanupEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanupEngineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compact the target cluster for better performance.
     * </pre>
     */
    public void compactCluster(org.tikv.kvproto.ImportKvpb.CompactClusterRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CompactClusterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompactClusterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get current version and commit hash
     * </pre>
     */
    public void getVersion(org.tikv.kvproto.ImportKvpb.GetVersionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get importer metrics
     * </pre>
     */
    public void getMetrics(org.tikv.kvproto.ImportKvpb.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchModeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.SwitchModeRequest,
                org.tikv.kvproto.ImportKvpb.SwitchModeResponse>(
                  this, METHODID_SWITCH_MODE)))
          .addMethod(
            getOpenEngineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.OpenEngineRequest,
                org.tikv.kvproto.ImportKvpb.OpenEngineResponse>(
                  this, METHODID_OPEN_ENGINE)))
          .addMethod(
            getWriteEngineMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.WriteEngineRequest,
                org.tikv.kvproto.ImportKvpb.WriteEngineResponse>(
                  this, METHODID_WRITE_ENGINE)))
          .addMethod(
            getWriteEngineV3Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.WriteEngineV3Request,
                org.tikv.kvproto.ImportKvpb.WriteEngineResponse>(
                  this, METHODID_WRITE_ENGINE_V3)))
          .addMethod(
            getCloseEngineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.CloseEngineRequest,
                org.tikv.kvproto.ImportKvpb.CloseEngineResponse>(
                  this, METHODID_CLOSE_ENGINE)))
          .addMethod(
            getImportEngineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.ImportEngineRequest,
                org.tikv.kvproto.ImportKvpb.ImportEngineResponse>(
                  this, METHODID_IMPORT_ENGINE)))
          .addMethod(
            getCleanupEngineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.CleanupEngineRequest,
                org.tikv.kvproto.ImportKvpb.CleanupEngineResponse>(
                  this, METHODID_CLEANUP_ENGINE)))
          .addMethod(
            getCompactClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.CompactClusterRequest,
                org.tikv.kvproto.ImportKvpb.CompactClusterResponse>(
                  this, METHODID_COMPACT_CLUSTER)))
          .addMethod(
            getGetVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.GetVersionRequest,
                org.tikv.kvproto.ImportKvpb.GetVersionResponse>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            getGetMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportKvpb.GetMetricsRequest,
                org.tikv.kvproto.ImportKvpb.GetMetricsResponse>(
                  this, METHODID_GET_METRICS)))
          .build();
    }
  }

  /**
   * <pre>
   * ImportKV provides a service to import key-value pairs to TiKV.
   * In order to import key-value pairs to TiKV, the user should:
   * 1. Open an engine identified by an UUID.
   * 2. Open write streams to write key-value batches to the opened engine.
   *    Different streams/clients can write to the same engine concurrently.
   * 3. Close the engine after all write batches have been finished. An
   *    engine can only be closed when all write streams are closed. An
   *    engine can only be closed once, and it can not be opened again
   *    once it is closed.
   * 4. Import the data in the engine to the target cluster. Note that
   *    the import process is not atomic, it requires the data to be
   *    idempotent on retry. An engine can only be imported after it is
   *    closed. An engine can be imported multiple times, but can not be
   *    imported concurrently.
   * 5. Clean up the engine after it has been imported. Delete all data
   *    in the engine. An engine can not be cleaned up when it is
   *    writing or importing.
   * </pre>
   */
  public static final class ImportKVStub extends io.grpc.stub.AbstractAsyncStub<ImportKVStub> {
    private ImportKVStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportKVStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportKVStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch the target cluster to normal/import mode.
     * </pre>
     */
    public void switchMode(org.tikv.kvproto.ImportKvpb.SwitchModeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.SwitchModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwitchModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open an engine.
     * </pre>
     */
    public void openEngine(org.tikv.kvproto.ImportKvpb.OpenEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.OpenEngineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenEngineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a write stream to the engine.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineRequest> writeEngine(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteEngineMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Write to engine, single message version
     * </pre>
     */
    public void writeEngineV3(org.tikv.kvproto.ImportKvpb.WriteEngineV3Request request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteEngineV3Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close the engine.
     * </pre>
     */
    public void closeEngine(org.tikv.kvproto.ImportKvpb.CloseEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CloseEngineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseEngineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import the engine to the target cluster.
     * </pre>
     */
    public void importEngine(org.tikv.kvproto.ImportKvpb.ImportEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.ImportEngineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportEngineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clean up the engine.
     * </pre>
     */
    public void cleanupEngine(org.tikv.kvproto.ImportKvpb.CleanupEngineRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanupEngineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compact the target cluster for better performance.
     * </pre>
     */
    public void compactCluster(org.tikv.kvproto.ImportKvpb.CompactClusterRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CompactClusterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompactClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get current version and commit hash
     * </pre>
     */
    public void getVersion(org.tikv.kvproto.ImportKvpb.GetVersionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get importer metrics
     * </pre>
     */
    public void getMetrics(org.tikv.kvproto.ImportKvpb.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ImportKV provides a service to import key-value pairs to TiKV.
   * In order to import key-value pairs to TiKV, the user should:
   * 1. Open an engine identified by an UUID.
   * 2. Open write streams to write key-value batches to the opened engine.
   *    Different streams/clients can write to the same engine concurrently.
   * 3. Close the engine after all write batches have been finished. An
   *    engine can only be closed when all write streams are closed. An
   *    engine can only be closed once, and it can not be opened again
   *    once it is closed.
   * 4. Import the data in the engine to the target cluster. Note that
   *    the import process is not atomic, it requires the data to be
   *    idempotent on retry. An engine can only be imported after it is
   *    closed. An engine can be imported multiple times, but can not be
   *    imported concurrently.
   * 5. Clean up the engine after it has been imported. Delete all data
   *    in the engine. An engine can not be cleaned up when it is
   *    writing or importing.
   * </pre>
   */
  public static final class ImportKVBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImportKVBlockingStub> {
    private ImportKVBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportKVBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportKVBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch the target cluster to normal/import mode.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.SwitchModeResponse switchMode(org.tikv.kvproto.ImportKvpb.SwitchModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwitchModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open an engine.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.OpenEngineResponse openEngine(org.tikv.kvproto.ImportKvpb.OpenEngineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenEngineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write to engine, single message version
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.WriteEngineResponse writeEngineV3(org.tikv.kvproto.ImportKvpb.WriteEngineV3Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteEngineV3Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close the engine.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.CloseEngineResponse closeEngine(org.tikv.kvproto.ImportKvpb.CloseEngineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseEngineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import the engine to the target cluster.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.ImportEngineResponse importEngine(org.tikv.kvproto.ImportKvpb.ImportEngineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportEngineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clean up the engine.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.CleanupEngineResponse cleanupEngine(org.tikv.kvproto.ImportKvpb.CleanupEngineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanupEngineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compact the target cluster for better performance.
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.CompactClusterResponse compactCluster(org.tikv.kvproto.ImportKvpb.CompactClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompactClusterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get current version and commit hash
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.GetVersionResponse getVersion(org.tikv.kvproto.ImportKvpb.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get importer metrics
     * </pre>
     */
    public org.tikv.kvproto.ImportKvpb.GetMetricsResponse getMetrics(org.tikv.kvproto.ImportKvpb.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ImportKV provides a service to import key-value pairs to TiKV.
   * In order to import key-value pairs to TiKV, the user should:
   * 1. Open an engine identified by an UUID.
   * 2. Open write streams to write key-value batches to the opened engine.
   *    Different streams/clients can write to the same engine concurrently.
   * 3. Close the engine after all write batches have been finished. An
   *    engine can only be closed when all write streams are closed. An
   *    engine can only be closed once, and it can not be opened again
   *    once it is closed.
   * 4. Import the data in the engine to the target cluster. Note that
   *    the import process is not atomic, it requires the data to be
   *    idempotent on retry. An engine can only be imported after it is
   *    closed. An engine can be imported multiple times, but can not be
   *    imported concurrently.
   * 5. Clean up the engine after it has been imported. Delete all data
   *    in the engine. An engine can not be cleaned up when it is
   *    writing or importing.
   * </pre>
   */
  public static final class ImportKVFutureStub extends io.grpc.stub.AbstractFutureStub<ImportKVFutureStub> {
    private ImportKVFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportKVFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportKVFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch the target cluster to normal/import mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.SwitchModeResponse> switchMode(
        org.tikv.kvproto.ImportKvpb.SwitchModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwitchModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Open an engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.OpenEngineResponse> openEngine(
        org.tikv.kvproto.ImportKvpb.OpenEngineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenEngineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write to engine, single message version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.WriteEngineResponse> writeEngineV3(
        org.tikv.kvproto.ImportKvpb.WriteEngineV3Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteEngineV3Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close the engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.CloseEngineResponse> closeEngine(
        org.tikv.kvproto.ImportKvpb.CloseEngineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseEngineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import the engine to the target cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.ImportEngineResponse> importEngine(
        org.tikv.kvproto.ImportKvpb.ImportEngineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportEngineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clean up the engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.CleanupEngineResponse> cleanupEngine(
        org.tikv.kvproto.ImportKvpb.CleanupEngineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanupEngineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compact the target cluster for better performance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.CompactClusterResponse> compactCluster(
        org.tikv.kvproto.ImportKvpb.CompactClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompactClusterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get current version and commit hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.GetVersionResponse> getVersion(
        org.tikv.kvproto.ImportKvpb.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get importer metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportKvpb.GetMetricsResponse> getMetrics(
        org.tikv.kvproto.ImportKvpb.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_MODE = 0;
  private static final int METHODID_OPEN_ENGINE = 1;
  private static final int METHODID_WRITE_ENGINE_V3 = 2;
  private static final int METHODID_CLOSE_ENGINE = 3;
  private static final int METHODID_IMPORT_ENGINE = 4;
  private static final int METHODID_CLEANUP_ENGINE = 5;
  private static final int METHODID_COMPACT_CLUSTER = 6;
  private static final int METHODID_GET_VERSION = 7;
  private static final int METHODID_GET_METRICS = 8;
  private static final int METHODID_WRITE_ENGINE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImportKVImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImportKVImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_MODE:
          serviceImpl.switchMode((org.tikv.kvproto.ImportKvpb.SwitchModeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.SwitchModeResponse>) responseObserver);
          break;
        case METHODID_OPEN_ENGINE:
          serviceImpl.openEngine((org.tikv.kvproto.ImportKvpb.OpenEngineRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.OpenEngineResponse>) responseObserver);
          break;
        case METHODID_WRITE_ENGINE_V3:
          serviceImpl.writeEngineV3((org.tikv.kvproto.ImportKvpb.WriteEngineV3Request) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse>) responseObserver);
          break;
        case METHODID_CLOSE_ENGINE:
          serviceImpl.closeEngine((org.tikv.kvproto.ImportKvpb.CloseEngineRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CloseEngineResponse>) responseObserver);
          break;
        case METHODID_IMPORT_ENGINE:
          serviceImpl.importEngine((org.tikv.kvproto.ImportKvpb.ImportEngineRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.ImportEngineResponse>) responseObserver);
          break;
        case METHODID_CLEANUP_ENGINE:
          serviceImpl.cleanupEngine((org.tikv.kvproto.ImportKvpb.CleanupEngineRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CleanupEngineResponse>) responseObserver);
          break;
        case METHODID_COMPACT_CLUSTER:
          serviceImpl.compactCluster((org.tikv.kvproto.ImportKvpb.CompactClusterRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.CompactClusterResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((org.tikv.kvproto.ImportKvpb.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetVersionResponse>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((org.tikv.kvproto.ImportKvpb.GetMetricsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.GetMetricsResponse>) responseObserver);
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
        case METHODID_WRITE_ENGINE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeEngine(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportKvpb.WriteEngineResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImportKVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImportKVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.ImportKvpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImportKV");
    }
  }

  private static final class ImportKVFileDescriptorSupplier
      extends ImportKVBaseDescriptorSupplier {
    ImportKVFileDescriptorSupplier() {}
  }

  private static final class ImportKVMethodDescriptorSupplier
      extends ImportKVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImportKVMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImportKVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImportKVFileDescriptorSupplier())
              .addMethod(getSwitchModeMethod())
              .addMethod(getOpenEngineMethod())
              .addMethod(getWriteEngineMethod())
              .addMethod(getWriteEngineV3Method())
              .addMethod(getCloseEngineMethod())
              .addMethod(getImportEngineMethod())
              .addMethod(getCleanupEngineMethod())
              .addMethod(getCompactClusterMethod())
              .addMethod(getGetVersionMethod())
              .addMethod(getGetMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
