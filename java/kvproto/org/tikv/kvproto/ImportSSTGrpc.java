package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ImportSST provides a service to import a generated SST file to a region in TiKV.
 * In order to import an SST file to a region, the user should:
 * 1. Retrieve the meta of the region according to the SST file's range.
 * 2. Upload the SST file to the servers where the region's peers locate in.
 * 3. Issue an ingest request to the region's leader with the SST file's metadata.
 * It's the user's responsibility to make sure that the SST file is uploaded to
 * the servers where the region's peers locate in, before issue the ingest
 * request to the region's leader. However, the region can be scheduled (so the
 * location of the region's peers will be changed) or split/merged (so the range
 * of the region will be changed), after the SST file is uploaded, but before
 * the SST file is ingested. So, the region's epoch is provided in the SST
 * file's metadata, to guarantee that the region's epoch must be the same
 * between the SST file is uploaded and ingested later.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: import_sstpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImportSSTGrpc {

  private ImportSSTGrpc() {}

  public static final String SERVICE_NAME = "import_sstpb.ImportSST";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SwitchModeRequest,
      org.tikv.kvproto.ImportSstpb.SwitchModeResponse> getSwitchModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwitchMode",
      requestType = org.tikv.kvproto.ImportSstpb.SwitchModeRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.SwitchModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SwitchModeRequest,
      org.tikv.kvproto.ImportSstpb.SwitchModeResponse> getSwitchModeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SwitchModeRequest, org.tikv.kvproto.ImportSstpb.SwitchModeResponse> getSwitchModeMethod;
    if ((getSwitchModeMethod = ImportSSTGrpc.getSwitchModeMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getSwitchModeMethod = ImportSSTGrpc.getSwitchModeMethod) == null) {
          ImportSSTGrpc.getSwitchModeMethod = getSwitchModeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.SwitchModeRequest, org.tikv.kvproto.ImportSstpb.SwitchModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwitchMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.SwitchModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.SwitchModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("SwitchMode"))
              .build();
        }
      }
    }
    return getSwitchModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.UploadRequest,
      org.tikv.kvproto.ImportSstpb.UploadResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = org.tikv.kvproto.ImportSstpb.UploadRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.UploadRequest,
      org.tikv.kvproto.ImportSstpb.UploadResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.UploadRequest, org.tikv.kvproto.ImportSstpb.UploadResponse> getUploadMethod;
    if ((getUploadMethod = ImportSSTGrpc.getUploadMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getUploadMethod = ImportSSTGrpc.getUploadMethod) == null) {
          ImportSSTGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.UploadRequest, org.tikv.kvproto.ImportSstpb.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.IngestRequest,
      org.tikv.kvproto.ImportSstpb.IngestResponse> getIngestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ingest",
      requestType = org.tikv.kvproto.ImportSstpb.IngestRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.IngestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.IngestRequest,
      org.tikv.kvproto.ImportSstpb.IngestResponse> getIngestMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.IngestRequest, org.tikv.kvproto.ImportSstpb.IngestResponse> getIngestMethod;
    if ((getIngestMethod = ImportSSTGrpc.getIngestMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getIngestMethod = ImportSSTGrpc.getIngestMethod) == null) {
          ImportSSTGrpc.getIngestMethod = getIngestMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.IngestRequest, org.tikv.kvproto.ImportSstpb.IngestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ingest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.IngestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.IngestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("Ingest"))
              .build();
        }
      }
    }
    return getIngestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.CompactRequest,
      org.tikv.kvproto.ImportSstpb.CompactResponse> getCompactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compact",
      requestType = org.tikv.kvproto.ImportSstpb.CompactRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.CompactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.CompactRequest,
      org.tikv.kvproto.ImportSstpb.CompactResponse> getCompactMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.CompactRequest, org.tikv.kvproto.ImportSstpb.CompactResponse> getCompactMethod;
    if ((getCompactMethod = ImportSSTGrpc.getCompactMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getCompactMethod = ImportSSTGrpc.getCompactMethod) == null) {
          ImportSSTGrpc.getCompactMethod = getCompactMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.CompactRequest, org.tikv.kvproto.ImportSstpb.CompactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.CompactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.CompactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("Compact"))
              .build();
        }
      }
    }
    return getCompactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest,
      org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> getSetDownloadSpeedLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDownloadSpeedLimit",
      requestType = org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest,
      org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> getSetDownloadSpeedLimitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest, org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> getSetDownloadSpeedLimitMethod;
    if ((getSetDownloadSpeedLimitMethod = ImportSSTGrpc.getSetDownloadSpeedLimitMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getSetDownloadSpeedLimitMethod = ImportSSTGrpc.getSetDownloadSpeedLimitMethod) == null) {
          ImportSSTGrpc.getSetDownloadSpeedLimitMethod = getSetDownloadSpeedLimitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest, org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDownloadSpeedLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("SetDownloadSpeedLimit"))
              .build();
        }
      }
    }
    return getSetDownloadSpeedLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.DownloadRequest,
      org.tikv.kvproto.ImportSstpb.DownloadResponse> getDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Download",
      requestType = org.tikv.kvproto.ImportSstpb.DownloadRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.DownloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.DownloadRequest,
      org.tikv.kvproto.ImportSstpb.DownloadResponse> getDownloadMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.DownloadRequest, org.tikv.kvproto.ImportSstpb.DownloadResponse> getDownloadMethod;
    if ((getDownloadMethod = ImportSSTGrpc.getDownloadMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getDownloadMethod = ImportSSTGrpc.getDownloadMethod) == null) {
          ImportSSTGrpc.getDownloadMethod = getDownloadMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.DownloadRequest, org.tikv.kvproto.ImportSstpb.DownloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.DownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.DownloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("Download"))
              .build();
        }
      }
    }
    return getDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.WriteRequest,
      org.tikv.kvproto.ImportSstpb.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = org.tikv.kvproto.ImportSstpb.WriteRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.WriteRequest,
      org.tikv.kvproto.ImportSstpb.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.WriteRequest, org.tikv.kvproto.ImportSstpb.WriteResponse> getWriteMethod;
    if ((getWriteMethod = ImportSSTGrpc.getWriteMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getWriteMethod = ImportSSTGrpc.getWriteMethod) == null) {
          ImportSSTGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.WriteRequest, org.tikv.kvproto.ImportSstpb.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.MultiIngestRequest,
      org.tikv.kvproto.ImportSstpb.IngestResponse> getMultiIngestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiIngest",
      requestType = org.tikv.kvproto.ImportSstpb.MultiIngestRequest.class,
      responseType = org.tikv.kvproto.ImportSstpb.IngestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.MultiIngestRequest,
      org.tikv.kvproto.ImportSstpb.IngestResponse> getMultiIngestMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.ImportSstpb.MultiIngestRequest, org.tikv.kvproto.ImportSstpb.IngestResponse> getMultiIngestMethod;
    if ((getMultiIngestMethod = ImportSSTGrpc.getMultiIngestMethod) == null) {
      synchronized (ImportSSTGrpc.class) {
        if ((getMultiIngestMethod = ImportSSTGrpc.getMultiIngestMethod) == null) {
          ImportSSTGrpc.getMultiIngestMethod = getMultiIngestMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.ImportSstpb.MultiIngestRequest, org.tikv.kvproto.ImportSstpb.IngestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiIngest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.MultiIngestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.ImportSstpb.IngestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImportSSTMethodDescriptorSupplier("MultiIngest"))
              .build();
        }
      }
    }
    return getMultiIngestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImportSSTStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportSSTStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportSSTStub>() {
        @java.lang.Override
        public ImportSSTStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportSSTStub(channel, callOptions);
        }
      };
    return ImportSSTStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImportSSTBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportSSTBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportSSTBlockingStub>() {
        @java.lang.Override
        public ImportSSTBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportSSTBlockingStub(channel, callOptions);
        }
      };
    return ImportSSTBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImportSSTFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImportSSTFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImportSSTFutureStub>() {
        @java.lang.Override
        public ImportSSTFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImportSSTFutureStub(channel, callOptions);
        }
      };
    return ImportSSTFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ImportSST provides a service to import a generated SST file to a region in TiKV.
   * In order to import an SST file to a region, the user should:
   * 1. Retrieve the meta of the region according to the SST file's range.
   * 2. Upload the SST file to the servers where the region's peers locate in.
   * 3. Issue an ingest request to the region's leader with the SST file's metadata.
   * It's the user's responsibility to make sure that the SST file is uploaded to
   * the servers where the region's peers locate in, before issue the ingest
   * request to the region's leader. However, the region can be scheduled (so the
   * location of the region's peers will be changed) or split/merged (so the range
   * of the region will be changed), after the SST file is uploaded, but before
   * the SST file is ingested. So, the region's epoch is provided in the SST
   * file's metadata, to guarantee that the region's epoch must be the same
   * between the SST file is uploaded and ingested later.
   * </pre>
   */
  public static abstract class ImportSSTImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Switch to normal/import mode.
     * </pre>
     */
    public void switchMode(org.tikv.kvproto.ImportSstpb.SwitchModeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SwitchModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwitchModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload an SST file to a server.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.UploadRequest> upload(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.UploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ingest an uploaded SST file to a region.
     * </pre>
     */
    public void ingest(org.tikv.kvproto.ImportSstpb.IngestRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIngestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compact the specific range for better performance.
     * </pre>
     */
    public void compact(org.tikv.kvproto.ImportSstpb.CompactRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.CompactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompactMethod(), responseObserver);
    }

    /**
     */
    public void setDownloadSpeedLimit(org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDownloadSpeedLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download an SST file from an external storage, and performs key-rewrite
     * after downloading.
     * </pre>
     */
    public void download(org.tikv.kvproto.ImportSstpb.DownloadRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.DownloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a write stream to generate sst files
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.WriteRequest> write(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.WriteResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ingest Multiple files in one request
     * </pre>
     */
    public void multiIngest(org.tikv.kvproto.ImportSstpb.MultiIngestRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiIngestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchModeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.SwitchModeRequest,
                org.tikv.kvproto.ImportSstpb.SwitchModeResponse>(
                  this, METHODID_SWITCH_MODE)))
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.UploadRequest,
                org.tikv.kvproto.ImportSstpb.UploadResponse>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getIngestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.IngestRequest,
                org.tikv.kvproto.ImportSstpb.IngestResponse>(
                  this, METHODID_INGEST)))
          .addMethod(
            getCompactMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.CompactRequest,
                org.tikv.kvproto.ImportSstpb.CompactResponse>(
                  this, METHODID_COMPACT)))
          .addMethod(
            getSetDownloadSpeedLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest,
                org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse>(
                  this, METHODID_SET_DOWNLOAD_SPEED_LIMIT)))
          .addMethod(
            getDownloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.DownloadRequest,
                org.tikv.kvproto.ImportSstpb.DownloadResponse>(
                  this, METHODID_DOWNLOAD)))
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.WriteRequest,
                org.tikv.kvproto.ImportSstpb.WriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            getMultiIngestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.ImportSstpb.MultiIngestRequest,
                org.tikv.kvproto.ImportSstpb.IngestResponse>(
                  this, METHODID_MULTI_INGEST)))
          .build();
    }
  }

  /**
   * <pre>
   * ImportSST provides a service to import a generated SST file to a region in TiKV.
   * In order to import an SST file to a region, the user should:
   * 1. Retrieve the meta of the region according to the SST file's range.
   * 2. Upload the SST file to the servers where the region's peers locate in.
   * 3. Issue an ingest request to the region's leader with the SST file's metadata.
   * It's the user's responsibility to make sure that the SST file is uploaded to
   * the servers where the region's peers locate in, before issue the ingest
   * request to the region's leader. However, the region can be scheduled (so the
   * location of the region's peers will be changed) or split/merged (so the range
   * of the region will be changed), after the SST file is uploaded, but before
   * the SST file is ingested. So, the region's epoch is provided in the SST
   * file's metadata, to guarantee that the region's epoch must be the same
   * between the SST file is uploaded and ingested later.
   * </pre>
   */
  public static final class ImportSSTStub extends io.grpc.stub.AbstractAsyncStub<ImportSSTStub> {
    private ImportSSTStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportSSTStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportSSTStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch to normal/import mode.
     * </pre>
     */
    public void switchMode(org.tikv.kvproto.ImportSstpb.SwitchModeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SwitchModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwitchModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload an SST file to a server.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.UploadRequest> upload(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.UploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Ingest an uploaded SST file to a region.
     * </pre>
     */
    public void ingest(org.tikv.kvproto.ImportSstpb.IngestRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIngestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compact the specific range for better performance.
     * </pre>
     */
    public void compact(org.tikv.kvproto.ImportSstpb.CompactRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.CompactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDownloadSpeedLimit(org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDownloadSpeedLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download an SST file from an external storage, and performs key-rewrite
     * after downloading.
     * </pre>
     */
    public void download(org.tikv.kvproto.ImportSstpb.DownloadRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.DownloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a write stream to generate sst files
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.WriteRequest> write(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.WriteResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Ingest Multiple files in one request
     * </pre>
     */
    public void multiIngest(org.tikv.kvproto.ImportSstpb.MultiIngestRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiIngestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ImportSST provides a service to import a generated SST file to a region in TiKV.
   * In order to import an SST file to a region, the user should:
   * 1. Retrieve the meta of the region according to the SST file's range.
   * 2. Upload the SST file to the servers where the region's peers locate in.
   * 3. Issue an ingest request to the region's leader with the SST file's metadata.
   * It's the user's responsibility to make sure that the SST file is uploaded to
   * the servers where the region's peers locate in, before issue the ingest
   * request to the region's leader. However, the region can be scheduled (so the
   * location of the region's peers will be changed) or split/merged (so the range
   * of the region will be changed), after the SST file is uploaded, but before
   * the SST file is ingested. So, the region's epoch is provided in the SST
   * file's metadata, to guarantee that the region's epoch must be the same
   * between the SST file is uploaded and ingested later.
   * </pre>
   */
  public static final class ImportSSTBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImportSSTBlockingStub> {
    private ImportSSTBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportSSTBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportSSTBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch to normal/import mode.
     * </pre>
     */
    public org.tikv.kvproto.ImportSstpb.SwitchModeResponse switchMode(org.tikv.kvproto.ImportSstpb.SwitchModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwitchModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ingest an uploaded SST file to a region.
     * </pre>
     */
    public org.tikv.kvproto.ImportSstpb.IngestResponse ingest(org.tikv.kvproto.ImportSstpb.IngestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIngestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compact the specific range for better performance.
     * </pre>
     */
    public org.tikv.kvproto.ImportSstpb.CompactResponse compact(org.tikv.kvproto.ImportSstpb.CompactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompactMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse setDownloadSpeedLimit(org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDownloadSpeedLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download an SST file from an external storage, and performs key-rewrite
     * after downloading.
     * </pre>
     */
    public org.tikv.kvproto.ImportSstpb.DownloadResponse download(org.tikv.kvproto.ImportSstpb.DownloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ingest Multiple files in one request
     * </pre>
     */
    public org.tikv.kvproto.ImportSstpb.IngestResponse multiIngest(org.tikv.kvproto.ImportSstpb.MultiIngestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiIngestMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ImportSST provides a service to import a generated SST file to a region in TiKV.
   * In order to import an SST file to a region, the user should:
   * 1. Retrieve the meta of the region according to the SST file's range.
   * 2. Upload the SST file to the servers where the region's peers locate in.
   * 3. Issue an ingest request to the region's leader with the SST file's metadata.
   * It's the user's responsibility to make sure that the SST file is uploaded to
   * the servers where the region's peers locate in, before issue the ingest
   * request to the region's leader. However, the region can be scheduled (so the
   * location of the region's peers will be changed) or split/merged (so the range
   * of the region will be changed), after the SST file is uploaded, but before
   * the SST file is ingested. So, the region's epoch is provided in the SST
   * file's metadata, to guarantee that the region's epoch must be the same
   * between the SST file is uploaded and ingested later.
   * </pre>
   */
  public static final class ImportSSTFutureStub extends io.grpc.stub.AbstractFutureStub<ImportSSTFutureStub> {
    private ImportSSTFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImportSSTFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImportSSTFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Switch to normal/import mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.SwitchModeResponse> switchMode(
        org.tikv.kvproto.ImportSstpb.SwitchModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwitchModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ingest an uploaded SST file to a region.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.IngestResponse> ingest(
        org.tikv.kvproto.ImportSstpb.IngestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIngestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compact the specific range for better performance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.CompactResponse> compact(
        org.tikv.kvproto.ImportSstpb.CompactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse> setDownloadSpeedLimit(
        org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDownloadSpeedLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download an SST file from an external storage, and performs key-rewrite
     * after downloading.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.DownloadResponse> download(
        org.tikv.kvproto.ImportSstpb.DownloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ingest Multiple files in one request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.ImportSstpb.IngestResponse> multiIngest(
        org.tikv.kvproto.ImportSstpb.MultiIngestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiIngestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_MODE = 0;
  private static final int METHODID_INGEST = 1;
  private static final int METHODID_COMPACT = 2;
  private static final int METHODID_SET_DOWNLOAD_SPEED_LIMIT = 3;
  private static final int METHODID_DOWNLOAD = 4;
  private static final int METHODID_MULTI_INGEST = 5;
  private static final int METHODID_UPLOAD = 6;
  private static final int METHODID_WRITE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImportSSTImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImportSSTImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_MODE:
          serviceImpl.switchMode((org.tikv.kvproto.ImportSstpb.SwitchModeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SwitchModeResponse>) responseObserver);
          break;
        case METHODID_INGEST:
          serviceImpl.ingest((org.tikv.kvproto.ImportSstpb.IngestRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((org.tikv.kvproto.ImportSstpb.CompactRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.CompactResponse>) responseObserver);
          break;
        case METHODID_SET_DOWNLOAD_SPEED_LIMIT:
          serviceImpl.setDownloadSpeedLimit((org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.SetDownloadSpeedLimitResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((org.tikv.kvproto.ImportSstpb.DownloadRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.DownloadResponse>) responseObserver);
          break;
        case METHODID_MULTI_INGEST:
          serviceImpl.multiIngest((org.tikv.kvproto.ImportSstpb.MultiIngestRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.IngestResponse>) responseObserver);
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
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.UploadResponse>) responseObserver);
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.ImportSstpb.WriteResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImportSSTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImportSSTBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.ImportSstpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImportSST");
    }
  }

  private static final class ImportSSTFileDescriptorSupplier
      extends ImportSSTBaseDescriptorSupplier {
    ImportSSTFileDescriptorSupplier() {}
  }

  private static final class ImportSSTMethodDescriptorSupplier
      extends ImportSSTBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImportSSTMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImportSSTGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImportSSTFileDescriptorSupplier())
              .addMethod(getSwitchModeMethod())
              .addMethod(getUploadMethod())
              .addMethod(getIngestMethod())
              .addMethod(getCompactMethod())
              .addMethod(getSetDownloadSpeedLimitMethod())
              .addMethod(getDownloadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getMultiIngestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
