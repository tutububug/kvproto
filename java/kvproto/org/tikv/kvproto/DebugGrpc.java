package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Debug service for TiKV.
 * Errors are defined as follow:
 *   - OK: Okay, we are good!
 *   - UNKNOWN: For unknown error.
 *   - INVALID_ARGUMENT: Something goes wrong within requests.
 *   - NOT_FOUND: It is key or region not found, it's based on context, detailed
 *                reason can be found in grpc message.
 * Note: It bypasses raft layer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: debugpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DebugGrpc {

  private DebugGrpc() {}

  public static final String SERVICE_NAME = "debugpb.Debug";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRequest,
      org.tikv.kvproto.Debugpb.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = org.tikv.kvproto.Debugpb.GetRequest.class,
      responseType = org.tikv.kvproto.Debugpb.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRequest,
      org.tikv.kvproto.Debugpb.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRequest, org.tikv.kvproto.Debugpb.GetResponse> getGetMethod;
    if ((getGetMethod = DebugGrpc.getGetMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getGetMethod = DebugGrpc.getGetMethod) == null) {
          DebugGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.GetRequest, org.tikv.kvproto.Debugpb.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RaftLogRequest,
      org.tikv.kvproto.Debugpb.RaftLogResponse> getRaftLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RaftLog",
      requestType = org.tikv.kvproto.Debugpb.RaftLogRequest.class,
      responseType = org.tikv.kvproto.Debugpb.RaftLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RaftLogRequest,
      org.tikv.kvproto.Debugpb.RaftLogResponse> getRaftLogMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RaftLogRequest, org.tikv.kvproto.Debugpb.RaftLogResponse> getRaftLogMethod;
    if ((getRaftLogMethod = DebugGrpc.getRaftLogMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getRaftLogMethod = DebugGrpc.getRaftLogMethod) == null) {
          DebugGrpc.getRaftLogMethod = getRaftLogMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.RaftLogRequest, org.tikv.kvproto.Debugpb.RaftLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RaftLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RaftLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RaftLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("RaftLog"))
              .build();
        }
      }
    }
    return getRaftLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionInfoRequest,
      org.tikv.kvproto.Debugpb.RegionInfoResponse> getRegionInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegionInfo",
      requestType = org.tikv.kvproto.Debugpb.RegionInfoRequest.class,
      responseType = org.tikv.kvproto.Debugpb.RegionInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionInfoRequest,
      org.tikv.kvproto.Debugpb.RegionInfoResponse> getRegionInfoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionInfoRequest, org.tikv.kvproto.Debugpb.RegionInfoResponse> getRegionInfoMethod;
    if ((getRegionInfoMethod = DebugGrpc.getRegionInfoMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getRegionInfoMethod = DebugGrpc.getRegionInfoMethod) == null) {
          DebugGrpc.getRegionInfoMethod = getRegionInfoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.RegionInfoRequest, org.tikv.kvproto.Debugpb.RegionInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegionInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("RegionInfo"))
              .build();
        }
      }
    }
    return getRegionInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionSizeRequest,
      org.tikv.kvproto.Debugpb.RegionSizeResponse> getRegionSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegionSize",
      requestType = org.tikv.kvproto.Debugpb.RegionSizeRequest.class,
      responseType = org.tikv.kvproto.Debugpb.RegionSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionSizeRequest,
      org.tikv.kvproto.Debugpb.RegionSizeResponse> getRegionSizeMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionSizeRequest, org.tikv.kvproto.Debugpb.RegionSizeResponse> getRegionSizeMethod;
    if ((getRegionSizeMethod = DebugGrpc.getRegionSizeMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getRegionSizeMethod = DebugGrpc.getRegionSizeMethod) == null) {
          DebugGrpc.getRegionSizeMethod = getRegionSizeMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.RegionSizeRequest, org.tikv.kvproto.Debugpb.RegionSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegionSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("RegionSize"))
              .build();
        }
      }
    }
    return getRegionSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ScanMvccRequest,
      org.tikv.kvproto.Debugpb.ScanMvccResponse> getScanMvccMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanMvcc",
      requestType = org.tikv.kvproto.Debugpb.ScanMvccRequest.class,
      responseType = org.tikv.kvproto.Debugpb.ScanMvccResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ScanMvccRequest,
      org.tikv.kvproto.Debugpb.ScanMvccResponse> getScanMvccMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ScanMvccRequest, org.tikv.kvproto.Debugpb.ScanMvccResponse> getScanMvccMethod;
    if ((getScanMvccMethod = DebugGrpc.getScanMvccMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getScanMvccMethod = DebugGrpc.getScanMvccMethod) == null) {
          DebugGrpc.getScanMvccMethod = getScanMvccMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.ScanMvccRequest, org.tikv.kvproto.Debugpb.ScanMvccResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanMvcc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ScanMvccRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ScanMvccResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("ScanMvcc"))
              .build();
        }
      }
    }
    return getScanMvccMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.CompactRequest,
      org.tikv.kvproto.Debugpb.CompactResponse> getCompactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compact",
      requestType = org.tikv.kvproto.Debugpb.CompactRequest.class,
      responseType = org.tikv.kvproto.Debugpb.CompactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.CompactRequest,
      org.tikv.kvproto.Debugpb.CompactResponse> getCompactMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.CompactRequest, org.tikv.kvproto.Debugpb.CompactResponse> getCompactMethod;
    if ((getCompactMethod = DebugGrpc.getCompactMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getCompactMethod = DebugGrpc.getCompactMethod) == null) {
          DebugGrpc.getCompactMethod = getCompactMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.CompactRequest, org.tikv.kvproto.Debugpb.CompactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.CompactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.CompactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("Compact"))
              .build();
        }
      }
    }
    return getCompactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.InjectFailPointRequest,
      org.tikv.kvproto.Debugpb.InjectFailPointResponse> getInjectFailPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InjectFailPoint",
      requestType = org.tikv.kvproto.Debugpb.InjectFailPointRequest.class,
      responseType = org.tikv.kvproto.Debugpb.InjectFailPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.InjectFailPointRequest,
      org.tikv.kvproto.Debugpb.InjectFailPointResponse> getInjectFailPointMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.InjectFailPointRequest, org.tikv.kvproto.Debugpb.InjectFailPointResponse> getInjectFailPointMethod;
    if ((getInjectFailPointMethod = DebugGrpc.getInjectFailPointMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getInjectFailPointMethod = DebugGrpc.getInjectFailPointMethod) == null) {
          DebugGrpc.getInjectFailPointMethod = getInjectFailPointMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.InjectFailPointRequest, org.tikv.kvproto.Debugpb.InjectFailPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InjectFailPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.InjectFailPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.InjectFailPointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("InjectFailPoint"))
              .build();
        }
      }
    }
    return getInjectFailPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RecoverFailPointRequest,
      org.tikv.kvproto.Debugpb.RecoverFailPointResponse> getRecoverFailPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecoverFailPoint",
      requestType = org.tikv.kvproto.Debugpb.RecoverFailPointRequest.class,
      responseType = org.tikv.kvproto.Debugpb.RecoverFailPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RecoverFailPointRequest,
      org.tikv.kvproto.Debugpb.RecoverFailPointResponse> getRecoverFailPointMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RecoverFailPointRequest, org.tikv.kvproto.Debugpb.RecoverFailPointResponse> getRecoverFailPointMethod;
    if ((getRecoverFailPointMethod = DebugGrpc.getRecoverFailPointMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getRecoverFailPointMethod = DebugGrpc.getRecoverFailPointMethod) == null) {
          DebugGrpc.getRecoverFailPointMethod = getRecoverFailPointMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.RecoverFailPointRequest, org.tikv.kvproto.Debugpb.RecoverFailPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecoverFailPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RecoverFailPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RecoverFailPointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("RecoverFailPoint"))
              .build();
        }
      }
    }
    return getRecoverFailPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ListFailPointsRequest,
      org.tikv.kvproto.Debugpb.ListFailPointsResponse> getListFailPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFailPoints",
      requestType = org.tikv.kvproto.Debugpb.ListFailPointsRequest.class,
      responseType = org.tikv.kvproto.Debugpb.ListFailPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ListFailPointsRequest,
      org.tikv.kvproto.Debugpb.ListFailPointsResponse> getListFailPointsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ListFailPointsRequest, org.tikv.kvproto.Debugpb.ListFailPointsResponse> getListFailPointsMethod;
    if ((getListFailPointsMethod = DebugGrpc.getListFailPointsMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getListFailPointsMethod = DebugGrpc.getListFailPointsMethod) == null) {
          DebugGrpc.getListFailPointsMethod = getListFailPointsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.ListFailPointsRequest, org.tikv.kvproto.Debugpb.ListFailPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFailPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ListFailPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ListFailPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("ListFailPoints"))
              .build();
        }
      }
    }
    return getListFailPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetMetricsRequest,
      org.tikv.kvproto.Debugpb.GetMetricsResponse> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = org.tikv.kvproto.Debugpb.GetMetricsRequest.class,
      responseType = org.tikv.kvproto.Debugpb.GetMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetMetricsRequest,
      org.tikv.kvproto.Debugpb.GetMetricsResponse> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetMetricsRequest, org.tikv.kvproto.Debugpb.GetMetricsResponse> getGetMetricsMethod;
    if ((getGetMetricsMethod = DebugGrpc.getGetMetricsMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getGetMetricsMethod = DebugGrpc.getGetMetricsMethod) == null) {
          DebugGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.GetMetricsRequest, org.tikv.kvproto.Debugpb.GetMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("GetMetrics"))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest,
      org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> getCheckRegionConsistencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRegionConsistency",
      requestType = org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest.class,
      responseType = org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest,
      org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> getCheckRegionConsistencyMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest, org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> getCheckRegionConsistencyMethod;
    if ((getCheckRegionConsistencyMethod = DebugGrpc.getCheckRegionConsistencyMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getCheckRegionConsistencyMethod = DebugGrpc.getCheckRegionConsistencyMethod) == null) {
          DebugGrpc.getCheckRegionConsistencyMethod = getCheckRegionConsistencyMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest, org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckRegionConsistency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("CheckRegionConsistency"))
              .build();
        }
      }
    }
    return getCheckRegionConsistencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest,
      org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> getModifyTikvConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyTikvConfig",
      requestType = org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest.class,
      responseType = org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest,
      org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> getModifyTikvConfigMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest, org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> getModifyTikvConfigMethod;
    if ((getModifyTikvConfigMethod = DebugGrpc.getModifyTikvConfigMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getModifyTikvConfigMethod = DebugGrpc.getModifyTikvConfigMethod) == null) {
          DebugGrpc.getModifyTikvConfigMethod = getModifyTikvConfigMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest, org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyTikvConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("ModifyTikvConfig"))
              .build();
        }
      }
    }
    return getModifyTikvConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest,
      org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> getGetRegionPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegionProperties",
      requestType = org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest.class,
      responseType = org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest,
      org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> getGetRegionPropertiesMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest, org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> getGetRegionPropertiesMethod;
    if ((getGetRegionPropertiesMethod = DebugGrpc.getGetRegionPropertiesMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getGetRegionPropertiesMethod = DebugGrpc.getGetRegionPropertiesMethod) == null) {
          DebugGrpc.getGetRegionPropertiesMethod = getGetRegionPropertiesMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest, org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegionProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("GetRegionProperties"))
              .build();
        }
      }
    }
    return getGetRegionPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetStoreInfoRequest,
      org.tikv.kvproto.Debugpb.GetStoreInfoResponse> getGetStoreInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStoreInfo",
      requestType = org.tikv.kvproto.Debugpb.GetStoreInfoRequest.class,
      responseType = org.tikv.kvproto.Debugpb.GetStoreInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetStoreInfoRequest,
      org.tikv.kvproto.Debugpb.GetStoreInfoResponse> getGetStoreInfoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetStoreInfoRequest, org.tikv.kvproto.Debugpb.GetStoreInfoResponse> getGetStoreInfoMethod;
    if ((getGetStoreInfoMethod = DebugGrpc.getGetStoreInfoMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getGetStoreInfoMethod = DebugGrpc.getGetStoreInfoMethod) == null) {
          DebugGrpc.getGetStoreInfoMethod = getGetStoreInfoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.GetStoreInfoRequest, org.tikv.kvproto.Debugpb.GetStoreInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStoreInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetStoreInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetStoreInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("GetStoreInfo"))
              .build();
        }
      }
    }
    return getGetStoreInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetClusterInfoRequest,
      org.tikv.kvproto.Debugpb.GetClusterInfoResponse> getGetClusterInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterInfo",
      requestType = org.tikv.kvproto.Debugpb.GetClusterInfoRequest.class,
      responseType = org.tikv.kvproto.Debugpb.GetClusterInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetClusterInfoRequest,
      org.tikv.kvproto.Debugpb.GetClusterInfoResponse> getGetClusterInfoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Debugpb.GetClusterInfoRequest, org.tikv.kvproto.Debugpb.GetClusterInfoResponse> getGetClusterInfoMethod;
    if ((getGetClusterInfoMethod = DebugGrpc.getGetClusterInfoMethod) == null) {
      synchronized (DebugGrpc.class) {
        if ((getGetClusterInfoMethod = DebugGrpc.getGetClusterInfoMethod) == null) {
          DebugGrpc.getGetClusterInfoMethod = getGetClusterInfoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Debugpb.GetClusterInfoRequest, org.tikv.kvproto.Debugpb.GetClusterInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetClusterInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Debugpb.GetClusterInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DebugMethodDescriptorSupplier("GetClusterInfo"))
              .build();
        }
      }
    }
    return getGetClusterInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DebugStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugStub>() {
        @java.lang.Override
        public DebugStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugStub(channel, callOptions);
        }
      };
    return DebugStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DebugBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugBlockingStub>() {
        @java.lang.Override
        public DebugBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugBlockingStub(channel, callOptions);
        }
      };
    return DebugBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DebugFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DebugFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DebugFutureStub>() {
        @java.lang.Override
        public DebugFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DebugFutureStub(channel, callOptions);
        }
      };
    return DebugFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Debug service for TiKV.
   * Errors are defined as follow:
   *   - OK: Okay, we are good!
   *   - UNKNOWN: For unknown error.
   *   - INVALID_ARGUMENT: Something goes wrong within requests.
   *   - NOT_FOUND: It is key or region not found, it's based on context, detailed
   *                reason can be found in grpc message.
   * Note: It bypasses raft layer.
   * </pre>
   */
  public static abstract class DebugImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Read a value arbitrarily for a key.
     * Note: Server uses key directly w/o any encoding.
     * </pre>
     */
    public void get(org.tikv.kvproto.Debugpb.GetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read raft info.
     * </pre>
     */
    public void raftLog(org.tikv.kvproto.Debugpb.RaftLogRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RaftLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRaftLogMethod(), responseObserver);
    }

    /**
     */
    public void regionInfo(org.tikv.kvproto.Debugpb.RegionInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegionInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Calculate size of a region.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     * </pre>
     */
    public void regionSize(org.tikv.kvproto.Debugpb.RegionSizeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionSizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegionSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Scan a specific range.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     *       Server uses keys directly w/o any encoding.
     * </pre>
     */
    public void scanMvcc(org.tikv.kvproto.Debugpb.ScanMvccRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ScanMvccResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanMvccMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compact a column family in a specified range.
     * Note: Server uses keys directly w/o any encoding.
     * </pre>
     */
    public void compact(org.tikv.kvproto.Debugpb.CompactRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.CompactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Inject a fail point. Currently, it's only used in tests.
     * Note: DO NOT CALL IT IN PRODUCTION.
     * </pre>
     */
    public void injectFailPoint(org.tikv.kvproto.Debugpb.InjectFailPointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.InjectFailPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInjectFailPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Recover from a fail point.
     * </pre>
     */
    public void recoverFailPoint(org.tikv.kvproto.Debugpb.RecoverFailPointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RecoverFailPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoverFailPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all fail points.
     * </pre>
     */
    public void listFailPoints(org.tikv.kvproto.Debugpb.ListFailPointsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ListFailPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFailPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Metrics
     * </pre>
     */
    public void getMetrics(org.tikv.kvproto.Debugpb.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Do a consistent check for a region.
     * </pre>
     */
    public void checkRegionConsistency(org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRegionConsistencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * dynamically modify tikv's config
     * </pre>
     */
    public void modifyTikvConfig(org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyTikvConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get region properties
     * </pre>
     */
    public void getRegionProperties(org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get store ID
     * </pre>
     */
    public void getStoreInfo(org.tikv.kvproto.Debugpb.GetStoreInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetStoreInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStoreInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get cluster ID
     * </pre>
     */
    public void getClusterInfo(org.tikv.kvproto.Debugpb.GetClusterInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetClusterInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.GetRequest,
                org.tikv.kvproto.Debugpb.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getRaftLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.RaftLogRequest,
                org.tikv.kvproto.Debugpb.RaftLogResponse>(
                  this, METHODID_RAFT_LOG)))
          .addMethod(
            getRegionInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.RegionInfoRequest,
                org.tikv.kvproto.Debugpb.RegionInfoResponse>(
                  this, METHODID_REGION_INFO)))
          .addMethod(
            getRegionSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.RegionSizeRequest,
                org.tikv.kvproto.Debugpb.RegionSizeResponse>(
                  this, METHODID_REGION_SIZE)))
          .addMethod(
            getScanMvccMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.ScanMvccRequest,
                org.tikv.kvproto.Debugpb.ScanMvccResponse>(
                  this, METHODID_SCAN_MVCC)))
          .addMethod(
            getCompactMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.CompactRequest,
                org.tikv.kvproto.Debugpb.CompactResponse>(
                  this, METHODID_COMPACT)))
          .addMethod(
            getInjectFailPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.InjectFailPointRequest,
                org.tikv.kvproto.Debugpb.InjectFailPointResponse>(
                  this, METHODID_INJECT_FAIL_POINT)))
          .addMethod(
            getRecoverFailPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.RecoverFailPointRequest,
                org.tikv.kvproto.Debugpb.RecoverFailPointResponse>(
                  this, METHODID_RECOVER_FAIL_POINT)))
          .addMethod(
            getListFailPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.ListFailPointsRequest,
                org.tikv.kvproto.Debugpb.ListFailPointsResponse>(
                  this, METHODID_LIST_FAIL_POINTS)))
          .addMethod(
            getGetMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.GetMetricsRequest,
                org.tikv.kvproto.Debugpb.GetMetricsResponse>(
                  this, METHODID_GET_METRICS)))
          .addMethod(
            getCheckRegionConsistencyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest,
                org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse>(
                  this, METHODID_CHECK_REGION_CONSISTENCY)))
          .addMethod(
            getModifyTikvConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest,
                org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse>(
                  this, METHODID_MODIFY_TIKV_CONFIG)))
          .addMethod(
            getGetRegionPropertiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest,
                org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse>(
                  this, METHODID_GET_REGION_PROPERTIES)))
          .addMethod(
            getGetStoreInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.GetStoreInfoRequest,
                org.tikv.kvproto.Debugpb.GetStoreInfoResponse>(
                  this, METHODID_GET_STORE_INFO)))
          .addMethod(
            getGetClusterInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Debugpb.GetClusterInfoRequest,
                org.tikv.kvproto.Debugpb.GetClusterInfoResponse>(
                  this, METHODID_GET_CLUSTER_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * Debug service for TiKV.
   * Errors are defined as follow:
   *   - OK: Okay, we are good!
   *   - UNKNOWN: For unknown error.
   *   - INVALID_ARGUMENT: Something goes wrong within requests.
   *   - NOT_FOUND: It is key or region not found, it's based on context, detailed
   *                reason can be found in grpc message.
   * Note: It bypasses raft layer.
   * </pre>
   */
  public static final class DebugStub extends io.grpc.stub.AbstractAsyncStub<DebugStub> {
    private DebugStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read a value arbitrarily for a key.
     * Note: Server uses key directly w/o any encoding.
     * </pre>
     */
    public void get(org.tikv.kvproto.Debugpb.GetRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read raft info.
     * </pre>
     */
    public void raftLog(org.tikv.kvproto.Debugpb.RaftLogRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RaftLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRaftLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void regionInfo(org.tikv.kvproto.Debugpb.RegionInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegionInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Calculate size of a region.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     * </pre>
     */
    public void regionSize(org.tikv.kvproto.Debugpb.RegionSizeRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionSizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegionSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Scan a specific range.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     *       Server uses keys directly w/o any encoding.
     * </pre>
     */
    public void scanMvcc(org.tikv.kvproto.Debugpb.ScanMvccRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ScanMvccResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getScanMvccMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compact a column family in a specified range.
     * Note: Server uses keys directly w/o any encoding.
     * </pre>
     */
    public void compact(org.tikv.kvproto.Debugpb.CompactRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.CompactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Inject a fail point. Currently, it's only used in tests.
     * Note: DO NOT CALL IT IN PRODUCTION.
     * </pre>
     */
    public void injectFailPoint(org.tikv.kvproto.Debugpb.InjectFailPointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.InjectFailPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInjectFailPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Recover from a fail point.
     * </pre>
     */
    public void recoverFailPoint(org.tikv.kvproto.Debugpb.RecoverFailPointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RecoverFailPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoverFailPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all fail points.
     * </pre>
     */
    public void listFailPoints(org.tikv.kvproto.Debugpb.ListFailPointsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ListFailPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFailPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Metrics
     * </pre>
     */
    public void getMetrics(org.tikv.kvproto.Debugpb.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Do a consistent check for a region.
     * </pre>
     */
    public void checkRegionConsistency(org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRegionConsistencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * dynamically modify tikv's config
     * </pre>
     */
    public void modifyTikvConfig(org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyTikvConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get region properties
     * </pre>
     */
    public void getRegionProperties(org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get store ID
     * </pre>
     */
    public void getStoreInfo(org.tikv.kvproto.Debugpb.GetStoreInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetStoreInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStoreInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get cluster ID
     * </pre>
     */
    public void getClusterInfo(org.tikv.kvproto.Debugpb.GetClusterInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetClusterInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Debug service for TiKV.
   * Errors are defined as follow:
   *   - OK: Okay, we are good!
   *   - UNKNOWN: For unknown error.
   *   - INVALID_ARGUMENT: Something goes wrong within requests.
   *   - NOT_FOUND: It is key or region not found, it's based on context, detailed
   *                reason can be found in grpc message.
   * Note: It bypasses raft layer.
   * </pre>
   */
  public static final class DebugBlockingStub extends io.grpc.stub.AbstractBlockingStub<DebugBlockingStub> {
    private DebugBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read a value arbitrarily for a key.
     * Note: Server uses key directly w/o any encoding.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.GetResponse get(org.tikv.kvproto.Debugpb.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read raft info.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.RaftLogResponse raftLog(org.tikv.kvproto.Debugpb.RaftLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRaftLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Debugpb.RegionInfoResponse regionInfo(org.tikv.kvproto.Debugpb.RegionInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegionInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Calculate size of a region.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.RegionSizeResponse regionSize(org.tikv.kvproto.Debugpb.RegionSizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegionSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Scan a specific range.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     *       Server uses keys directly w/o any encoding.
     * </pre>
     */
    public java.util.Iterator<org.tikv.kvproto.Debugpb.ScanMvccResponse> scanMvcc(
        org.tikv.kvproto.Debugpb.ScanMvccRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getScanMvccMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compact a column family in a specified range.
     * Note: Server uses keys directly w/o any encoding.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.CompactResponse compact(org.tikv.kvproto.Debugpb.CompactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Inject a fail point. Currently, it's only used in tests.
     * Note: DO NOT CALL IT IN PRODUCTION.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.InjectFailPointResponse injectFailPoint(org.tikv.kvproto.Debugpb.InjectFailPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInjectFailPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Recover from a fail point.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.RecoverFailPointResponse recoverFailPoint(org.tikv.kvproto.Debugpb.RecoverFailPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverFailPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all fail points.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.ListFailPointsResponse listFailPoints(org.tikv.kvproto.Debugpb.ListFailPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFailPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Metrics
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.GetMetricsResponse getMetrics(org.tikv.kvproto.Debugpb.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Do a consistent check for a region.
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse checkRegionConsistency(org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRegionConsistencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * dynamically modify tikv's config
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse modifyTikvConfig(org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyTikvConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get region properties
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse getRegionProperties(org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get store ID
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.GetStoreInfoResponse getStoreInfo(org.tikv.kvproto.Debugpb.GetStoreInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStoreInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get cluster ID
     * </pre>
     */
    public org.tikv.kvproto.Debugpb.GetClusterInfoResponse getClusterInfo(org.tikv.kvproto.Debugpb.GetClusterInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Debug service for TiKV.
   * Errors are defined as follow:
   *   - OK: Okay, we are good!
   *   - UNKNOWN: For unknown error.
   *   - INVALID_ARGUMENT: Something goes wrong within requests.
   *   - NOT_FOUND: It is key or region not found, it's based on context, detailed
   *                reason can be found in grpc message.
   * Note: It bypasses raft layer.
   * </pre>
   */
  public static final class DebugFutureStub extends io.grpc.stub.AbstractFutureStub<DebugFutureStub> {
    private DebugFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebugFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DebugFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read a value arbitrarily for a key.
     * Note: Server uses key directly w/o any encoding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.GetResponse> get(
        org.tikv.kvproto.Debugpb.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read raft info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.RaftLogResponse> raftLog(
        org.tikv.kvproto.Debugpb.RaftLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRaftLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.RegionInfoResponse> regionInfo(
        org.tikv.kvproto.Debugpb.RegionInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegionInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Calculate size of a region.
     * Note: DO NOT CALL IT IN PRODUCTION, it's really expensive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.RegionSizeResponse> regionSize(
        org.tikv.kvproto.Debugpb.RegionSizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegionSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compact a column family in a specified range.
     * Note: Server uses keys directly w/o any encoding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.CompactResponse> compact(
        org.tikv.kvproto.Debugpb.CompactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Inject a fail point. Currently, it's only used in tests.
     * Note: DO NOT CALL IT IN PRODUCTION.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.InjectFailPointResponse> injectFailPoint(
        org.tikv.kvproto.Debugpb.InjectFailPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInjectFailPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Recover from a fail point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.RecoverFailPointResponse> recoverFailPoint(
        org.tikv.kvproto.Debugpb.RecoverFailPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoverFailPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all fail points.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.ListFailPointsResponse> listFailPoints(
        org.tikv.kvproto.Debugpb.ListFailPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFailPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.GetMetricsResponse> getMetrics(
        org.tikv.kvproto.Debugpb.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Do a consistent check for a region.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse> checkRegionConsistency(
        org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRegionConsistencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * dynamically modify tikv's config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse> modifyTikvConfig(
        org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyTikvConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get region properties
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse> getRegionProperties(
        org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get store ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.GetStoreInfoResponse> getStoreInfo(
        org.tikv.kvproto.Debugpb.GetStoreInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStoreInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get cluster ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Debugpb.GetClusterInfoResponse> getClusterInfo(
        org.tikv.kvproto.Debugpb.GetClusterInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_RAFT_LOG = 1;
  private static final int METHODID_REGION_INFO = 2;
  private static final int METHODID_REGION_SIZE = 3;
  private static final int METHODID_SCAN_MVCC = 4;
  private static final int METHODID_COMPACT = 5;
  private static final int METHODID_INJECT_FAIL_POINT = 6;
  private static final int METHODID_RECOVER_FAIL_POINT = 7;
  private static final int METHODID_LIST_FAIL_POINTS = 8;
  private static final int METHODID_GET_METRICS = 9;
  private static final int METHODID_CHECK_REGION_CONSISTENCY = 10;
  private static final int METHODID_MODIFY_TIKV_CONFIG = 11;
  private static final int METHODID_GET_REGION_PROPERTIES = 12;
  private static final int METHODID_GET_STORE_INFO = 13;
  private static final int METHODID_GET_CLUSTER_INFO = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DebugImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DebugImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((org.tikv.kvproto.Debugpb.GetRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetResponse>) responseObserver);
          break;
        case METHODID_RAFT_LOG:
          serviceImpl.raftLog((org.tikv.kvproto.Debugpb.RaftLogRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RaftLogResponse>) responseObserver);
          break;
        case METHODID_REGION_INFO:
          serviceImpl.regionInfo((org.tikv.kvproto.Debugpb.RegionInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionInfoResponse>) responseObserver);
          break;
        case METHODID_REGION_SIZE:
          serviceImpl.regionSize((org.tikv.kvproto.Debugpb.RegionSizeRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionSizeResponse>) responseObserver);
          break;
        case METHODID_SCAN_MVCC:
          serviceImpl.scanMvcc((org.tikv.kvproto.Debugpb.ScanMvccRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ScanMvccResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((org.tikv.kvproto.Debugpb.CompactRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.CompactResponse>) responseObserver);
          break;
        case METHODID_INJECT_FAIL_POINT:
          serviceImpl.injectFailPoint((org.tikv.kvproto.Debugpb.InjectFailPointRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.InjectFailPointResponse>) responseObserver);
          break;
        case METHODID_RECOVER_FAIL_POINT:
          serviceImpl.recoverFailPoint((org.tikv.kvproto.Debugpb.RecoverFailPointRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RecoverFailPointResponse>) responseObserver);
          break;
        case METHODID_LIST_FAIL_POINTS:
          serviceImpl.listFailPoints((org.tikv.kvproto.Debugpb.ListFailPointsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ListFailPointsResponse>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((org.tikv.kvproto.Debugpb.GetMetricsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetMetricsResponse>) responseObserver);
          break;
        case METHODID_CHECK_REGION_CONSISTENCY:
          serviceImpl.checkRegionConsistency((org.tikv.kvproto.Debugpb.RegionConsistencyCheckRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.RegionConsistencyCheckResponse>) responseObserver);
          break;
        case METHODID_MODIFY_TIKV_CONFIG:
          serviceImpl.modifyTikvConfig((org.tikv.kvproto.Debugpb.ModifyTikvConfigRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.ModifyTikvConfigResponse>) responseObserver);
          break;
        case METHODID_GET_REGION_PROPERTIES:
          serviceImpl.getRegionProperties((org.tikv.kvproto.Debugpb.GetRegionPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetRegionPropertiesResponse>) responseObserver);
          break;
        case METHODID_GET_STORE_INFO:
          serviceImpl.getStoreInfo((org.tikv.kvproto.Debugpb.GetStoreInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetStoreInfoResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER_INFO:
          serviceImpl.getClusterInfo((org.tikv.kvproto.Debugpb.GetClusterInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Debugpb.GetClusterInfoResponse>) responseObserver);
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

  private static abstract class DebugBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DebugBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.Debugpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Debug");
    }
  }

  private static final class DebugFileDescriptorSupplier
      extends DebugBaseDescriptorSupplier {
    DebugFileDescriptorSupplier() {}
  }

  private static final class DebugMethodDescriptorSupplier
      extends DebugBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DebugMethodDescriptorSupplier(String methodName) {
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
      synchronized (DebugGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DebugFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getRaftLogMethod())
              .addMethod(getRegionInfoMethod())
              .addMethod(getRegionSizeMethod())
              .addMethod(getScanMvccMethod())
              .addMethod(getCompactMethod())
              .addMethod(getInjectFailPointMethod())
              .addMethod(getRecoverFailPointMethod())
              .addMethod(getListFailPointsMethod())
              .addMethod(getGetMetricsMethod())
              .addMethod(getCheckRegionConsistencyMethod())
              .addMethod(getModifyTikvConfigMethod())
              .addMethod(getGetRegionPropertiesMethod())
              .addMethod(getGetStoreInfoMethod())
              .addMethod(getGetClusterInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
