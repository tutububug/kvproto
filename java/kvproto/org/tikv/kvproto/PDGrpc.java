package org.tikv.kvproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: pdpb.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PDGrpc {

  private PDGrpc() {}

  public static final String SERVICE_NAME = "pdpb.PD";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetMembersRequest,
      org.tikv.kvproto.Pdpb.GetMembersResponse> getGetMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMembers",
      requestType = org.tikv.kvproto.Pdpb.GetMembersRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetMembersRequest,
      org.tikv.kvproto.Pdpb.GetMembersResponse> getGetMembersMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetMembersRequest, org.tikv.kvproto.Pdpb.GetMembersResponse> getGetMembersMethod;
    if ((getGetMembersMethod = PDGrpc.getGetMembersMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetMembersMethod = PDGrpc.getGetMembersMethod) == null) {
          PDGrpc.getGetMembersMethod = getGetMembersMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetMembersRequest, org.tikv.kvproto.Pdpb.GetMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetMembers"))
              .build();
        }
      }
    }
    return getGetMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.TsoRequest,
      org.tikv.kvproto.Pdpb.TsoResponse> getTsoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tso",
      requestType = org.tikv.kvproto.Pdpb.TsoRequest.class,
      responseType = org.tikv.kvproto.Pdpb.TsoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.TsoRequest,
      org.tikv.kvproto.Pdpb.TsoResponse> getTsoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.TsoRequest, org.tikv.kvproto.Pdpb.TsoResponse> getTsoMethod;
    if ((getTsoMethod = PDGrpc.getTsoMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getTsoMethod = PDGrpc.getTsoMethod) == null) {
          PDGrpc.getTsoMethod = getTsoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.TsoRequest, org.tikv.kvproto.Pdpb.TsoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tso"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.TsoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.TsoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("Tso"))
              .build();
        }
      }
    }
    return getTsoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.BootstrapRequest,
      org.tikv.kvproto.Pdpb.BootstrapResponse> getBootstrapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bootstrap",
      requestType = org.tikv.kvproto.Pdpb.BootstrapRequest.class,
      responseType = org.tikv.kvproto.Pdpb.BootstrapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.BootstrapRequest,
      org.tikv.kvproto.Pdpb.BootstrapResponse> getBootstrapMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.BootstrapRequest, org.tikv.kvproto.Pdpb.BootstrapResponse> getBootstrapMethod;
    if ((getBootstrapMethod = PDGrpc.getBootstrapMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getBootstrapMethod = PDGrpc.getBootstrapMethod) == null) {
          PDGrpc.getBootstrapMethod = getBootstrapMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.BootstrapRequest, org.tikv.kvproto.Pdpb.BootstrapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bootstrap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.BootstrapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.BootstrapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("Bootstrap"))
              .build();
        }
      }
    }
    return getBootstrapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.IsBootstrappedRequest,
      org.tikv.kvproto.Pdpb.IsBootstrappedResponse> getIsBootstrappedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsBootstrapped",
      requestType = org.tikv.kvproto.Pdpb.IsBootstrappedRequest.class,
      responseType = org.tikv.kvproto.Pdpb.IsBootstrappedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.IsBootstrappedRequest,
      org.tikv.kvproto.Pdpb.IsBootstrappedResponse> getIsBootstrappedMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.IsBootstrappedRequest, org.tikv.kvproto.Pdpb.IsBootstrappedResponse> getIsBootstrappedMethod;
    if ((getIsBootstrappedMethod = PDGrpc.getIsBootstrappedMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getIsBootstrappedMethod = PDGrpc.getIsBootstrappedMethod) == null) {
          PDGrpc.getIsBootstrappedMethod = getIsBootstrappedMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.IsBootstrappedRequest, org.tikv.kvproto.Pdpb.IsBootstrappedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsBootstrapped"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.IsBootstrappedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.IsBootstrappedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("IsBootstrapped"))
              .build();
        }
      }
    }
    return getIsBootstrappedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AllocIDRequest,
      org.tikv.kvproto.Pdpb.AllocIDResponse> getAllocIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllocID",
      requestType = org.tikv.kvproto.Pdpb.AllocIDRequest.class,
      responseType = org.tikv.kvproto.Pdpb.AllocIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AllocIDRequest,
      org.tikv.kvproto.Pdpb.AllocIDResponse> getAllocIDMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AllocIDRequest, org.tikv.kvproto.Pdpb.AllocIDResponse> getAllocIDMethod;
    if ((getAllocIDMethod = PDGrpc.getAllocIDMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getAllocIDMethod = PDGrpc.getAllocIDMethod) == null) {
          PDGrpc.getAllocIDMethod = getAllocIDMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.AllocIDRequest, org.tikv.kvproto.Pdpb.AllocIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllocID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AllocIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AllocIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("AllocID"))
              .build();
        }
      }
    }
    return getAllocIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetStoreRequest,
      org.tikv.kvproto.Pdpb.GetStoreResponse> getGetStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStore",
      requestType = org.tikv.kvproto.Pdpb.GetStoreRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetStoreRequest,
      org.tikv.kvproto.Pdpb.GetStoreResponse> getGetStoreMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetStoreRequest, org.tikv.kvproto.Pdpb.GetStoreResponse> getGetStoreMethod;
    if ((getGetStoreMethod = PDGrpc.getGetStoreMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetStoreMethod = PDGrpc.getGetStoreMethod) == null) {
          PDGrpc.getGetStoreMethod = getGetStoreMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetStoreRequest, org.tikv.kvproto.Pdpb.GetStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetStore"))
              .build();
        }
      }
    }
    return getGetStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutStoreRequest,
      org.tikv.kvproto.Pdpb.PutStoreResponse> getPutStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutStore",
      requestType = org.tikv.kvproto.Pdpb.PutStoreRequest.class,
      responseType = org.tikv.kvproto.Pdpb.PutStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutStoreRequest,
      org.tikv.kvproto.Pdpb.PutStoreResponse> getPutStoreMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutStoreRequest, org.tikv.kvproto.Pdpb.PutStoreResponse> getPutStoreMethod;
    if ((getPutStoreMethod = PDGrpc.getPutStoreMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getPutStoreMethod = PDGrpc.getPutStoreMethod) == null) {
          PDGrpc.getPutStoreMethod = getPutStoreMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.PutStoreRequest, org.tikv.kvproto.Pdpb.PutStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.PutStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.PutStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("PutStore"))
              .build();
        }
      }
    }
    return getPutStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetAllStoresRequest,
      org.tikv.kvproto.Pdpb.GetAllStoresResponse> getGetAllStoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStores",
      requestType = org.tikv.kvproto.Pdpb.GetAllStoresRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetAllStoresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetAllStoresRequest,
      org.tikv.kvproto.Pdpb.GetAllStoresResponse> getGetAllStoresMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetAllStoresRequest, org.tikv.kvproto.Pdpb.GetAllStoresResponse> getGetAllStoresMethod;
    if ((getGetAllStoresMethod = PDGrpc.getGetAllStoresMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetAllStoresMethod = PDGrpc.getGetAllStoresMethod) == null) {
          PDGrpc.getGetAllStoresMethod = getGetAllStoresMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetAllStoresRequest, org.tikv.kvproto.Pdpb.GetAllStoresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetAllStoresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetAllStoresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetAllStores"))
              .build();
        }
      }
    }
    return getGetAllStoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.StoreHeartbeatRequest,
      org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> getStoreHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreHeartbeat",
      requestType = org.tikv.kvproto.Pdpb.StoreHeartbeatRequest.class,
      responseType = org.tikv.kvproto.Pdpb.StoreHeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.StoreHeartbeatRequest,
      org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> getStoreHeartbeatMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.StoreHeartbeatRequest, org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> getStoreHeartbeatMethod;
    if ((getStoreHeartbeatMethod = PDGrpc.getStoreHeartbeatMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getStoreHeartbeatMethod = PDGrpc.getStoreHeartbeatMethod) == null) {
          PDGrpc.getStoreHeartbeatMethod = getStoreHeartbeatMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.StoreHeartbeatRequest, org.tikv.kvproto.Pdpb.StoreHeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreHeartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.StoreHeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.StoreHeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("StoreHeartbeat"))
              .build();
        }
      }
    }
    return getStoreHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest,
      org.tikv.kvproto.Pdpb.RegionHeartbeatResponse> getRegionHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegionHeartbeat",
      requestType = org.tikv.kvproto.Pdpb.RegionHeartbeatRequest.class,
      responseType = org.tikv.kvproto.Pdpb.RegionHeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest,
      org.tikv.kvproto.Pdpb.RegionHeartbeatResponse> getRegionHeartbeatMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest, org.tikv.kvproto.Pdpb.RegionHeartbeatResponse> getRegionHeartbeatMethod;
    if ((getRegionHeartbeatMethod = PDGrpc.getRegionHeartbeatMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getRegionHeartbeatMethod = PDGrpc.getRegionHeartbeatMethod) == null) {
          PDGrpc.getRegionHeartbeatMethod = getRegionHeartbeatMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest, org.tikv.kvproto.Pdpb.RegionHeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegionHeartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.RegionHeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.RegionHeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("RegionHeartbeat"))
              .build();
        }
      }
    }
    return getRegionHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegion",
      requestType = org.tikv.kvproto.Pdpb.GetRegionRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest, org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionMethod;
    if ((getGetRegionMethod = PDGrpc.getGetRegionMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetRegionMethod = PDGrpc.getGetRegionMethod) == null) {
          PDGrpc.getGetRegionMethod = getGetRegionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetRegionRequest, org.tikv.kvproto.Pdpb.GetRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetRegion"))
              .build();
        }
      }
    }
    return getGetRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetPrevRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrevRegion",
      requestType = org.tikv.kvproto.Pdpb.GetRegionRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetPrevRegionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionRequest, org.tikv.kvproto.Pdpb.GetRegionResponse> getGetPrevRegionMethod;
    if ((getGetPrevRegionMethod = PDGrpc.getGetPrevRegionMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetPrevRegionMethod = PDGrpc.getGetPrevRegionMethod) == null) {
          PDGrpc.getGetPrevRegionMethod = getGetPrevRegionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetRegionRequest, org.tikv.kvproto.Pdpb.GetRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrevRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetPrevRegion"))
              .build();
        }
      }
    }
    return getGetPrevRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionByIDRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegionByID",
      requestType = org.tikv.kvproto.Pdpb.GetRegionByIDRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionByIDRequest,
      org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionByIDMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetRegionByIDRequest, org.tikv.kvproto.Pdpb.GetRegionResponse> getGetRegionByIDMethod;
    if ((getGetRegionByIDMethod = PDGrpc.getGetRegionByIDMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetRegionByIDMethod = PDGrpc.getGetRegionByIDMethod) == null) {
          PDGrpc.getGetRegionByIDMethod = getGetRegionByIDMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetRegionByIDRequest, org.tikv.kvproto.Pdpb.GetRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegionByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetRegionByID"))
              .build();
        }
      }
    }
    return getGetRegionByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScanRegionsRequest,
      org.tikv.kvproto.Pdpb.ScanRegionsResponse> getScanRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanRegions",
      requestType = org.tikv.kvproto.Pdpb.ScanRegionsRequest.class,
      responseType = org.tikv.kvproto.Pdpb.ScanRegionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScanRegionsRequest,
      org.tikv.kvproto.Pdpb.ScanRegionsResponse> getScanRegionsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScanRegionsRequest, org.tikv.kvproto.Pdpb.ScanRegionsResponse> getScanRegionsMethod;
    if ((getScanRegionsMethod = PDGrpc.getScanRegionsMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getScanRegionsMethod = PDGrpc.getScanRegionsMethod) == null) {
          PDGrpc.getScanRegionsMethod = getScanRegionsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.ScanRegionsRequest, org.tikv.kvproto.Pdpb.ScanRegionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ScanRegionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ScanRegionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("ScanRegions"))
              .build();
        }
      }
    }
    return getScanRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskSplitRequest,
      org.tikv.kvproto.Pdpb.AskSplitResponse> getAskSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AskSplit",
      requestType = org.tikv.kvproto.Pdpb.AskSplitRequest.class,
      responseType = org.tikv.kvproto.Pdpb.AskSplitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskSplitRequest,
      org.tikv.kvproto.Pdpb.AskSplitResponse> getAskSplitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskSplitRequest, org.tikv.kvproto.Pdpb.AskSplitResponse> getAskSplitMethod;
    if ((getAskSplitMethod = PDGrpc.getAskSplitMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getAskSplitMethod = PDGrpc.getAskSplitMethod) == null) {
          PDGrpc.getAskSplitMethod = getAskSplitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.AskSplitRequest, org.tikv.kvproto.Pdpb.AskSplitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AskSplit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AskSplitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AskSplitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("AskSplit"))
              .build();
        }
      }
    }
    return getAskSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportSplitRequest,
      org.tikv.kvproto.Pdpb.ReportSplitResponse> getReportSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportSplit",
      requestType = org.tikv.kvproto.Pdpb.ReportSplitRequest.class,
      responseType = org.tikv.kvproto.Pdpb.ReportSplitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportSplitRequest,
      org.tikv.kvproto.Pdpb.ReportSplitResponse> getReportSplitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportSplitRequest, org.tikv.kvproto.Pdpb.ReportSplitResponse> getReportSplitMethod;
    if ((getReportSplitMethod = PDGrpc.getReportSplitMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getReportSplitMethod = PDGrpc.getReportSplitMethod) == null) {
          PDGrpc.getReportSplitMethod = getReportSplitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.ReportSplitRequest, org.tikv.kvproto.Pdpb.ReportSplitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportSplit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ReportSplitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ReportSplitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("ReportSplit"))
              .build();
        }
      }
    }
    return getReportSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskBatchSplitRequest,
      org.tikv.kvproto.Pdpb.AskBatchSplitResponse> getAskBatchSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AskBatchSplit",
      requestType = org.tikv.kvproto.Pdpb.AskBatchSplitRequest.class,
      responseType = org.tikv.kvproto.Pdpb.AskBatchSplitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskBatchSplitRequest,
      org.tikv.kvproto.Pdpb.AskBatchSplitResponse> getAskBatchSplitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.AskBatchSplitRequest, org.tikv.kvproto.Pdpb.AskBatchSplitResponse> getAskBatchSplitMethod;
    if ((getAskBatchSplitMethod = PDGrpc.getAskBatchSplitMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getAskBatchSplitMethod = PDGrpc.getAskBatchSplitMethod) == null) {
          PDGrpc.getAskBatchSplitMethod = getAskBatchSplitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.AskBatchSplitRequest, org.tikv.kvproto.Pdpb.AskBatchSplitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AskBatchSplit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AskBatchSplitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.AskBatchSplitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("AskBatchSplit"))
              .build();
        }
      }
    }
    return getAskBatchSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportBatchSplitRequest,
      org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> getReportBatchSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportBatchSplit",
      requestType = org.tikv.kvproto.Pdpb.ReportBatchSplitRequest.class,
      responseType = org.tikv.kvproto.Pdpb.ReportBatchSplitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportBatchSplitRequest,
      org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> getReportBatchSplitMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ReportBatchSplitRequest, org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> getReportBatchSplitMethod;
    if ((getReportBatchSplitMethod = PDGrpc.getReportBatchSplitMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getReportBatchSplitMethod = PDGrpc.getReportBatchSplitMethod) == null) {
          PDGrpc.getReportBatchSplitMethod = getReportBatchSplitMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.ReportBatchSplitRequest, org.tikv.kvproto.Pdpb.ReportBatchSplitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportBatchSplit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ReportBatchSplitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ReportBatchSplitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("ReportBatchSplit"))
              .build();
        }
      }
    }
    return getReportBatchSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetClusterConfigRequest,
      org.tikv.kvproto.Pdpb.GetClusterConfigResponse> getGetClusterConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClusterConfig",
      requestType = org.tikv.kvproto.Pdpb.GetClusterConfigRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetClusterConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetClusterConfigRequest,
      org.tikv.kvproto.Pdpb.GetClusterConfigResponse> getGetClusterConfigMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetClusterConfigRequest, org.tikv.kvproto.Pdpb.GetClusterConfigResponse> getGetClusterConfigMethod;
    if ((getGetClusterConfigMethod = PDGrpc.getGetClusterConfigMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetClusterConfigMethod = PDGrpc.getGetClusterConfigMethod) == null) {
          PDGrpc.getGetClusterConfigMethod = getGetClusterConfigMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetClusterConfigRequest, org.tikv.kvproto.Pdpb.GetClusterConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClusterConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetClusterConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetClusterConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetClusterConfig"))
              .build();
        }
      }
    }
    return getGetClusterConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutClusterConfigRequest,
      org.tikv.kvproto.Pdpb.PutClusterConfigResponse> getPutClusterConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutClusterConfig",
      requestType = org.tikv.kvproto.Pdpb.PutClusterConfigRequest.class,
      responseType = org.tikv.kvproto.Pdpb.PutClusterConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutClusterConfigRequest,
      org.tikv.kvproto.Pdpb.PutClusterConfigResponse> getPutClusterConfigMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.PutClusterConfigRequest, org.tikv.kvproto.Pdpb.PutClusterConfigResponse> getPutClusterConfigMethod;
    if ((getPutClusterConfigMethod = PDGrpc.getPutClusterConfigMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getPutClusterConfigMethod = PDGrpc.getPutClusterConfigMethod) == null) {
          PDGrpc.getPutClusterConfigMethod = getPutClusterConfigMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.PutClusterConfigRequest, org.tikv.kvproto.Pdpb.PutClusterConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutClusterConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.PutClusterConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.PutClusterConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("PutClusterConfig"))
              .build();
        }
      }
    }
    return getPutClusterConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScatterRegionRequest,
      org.tikv.kvproto.Pdpb.ScatterRegionResponse> getScatterRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScatterRegion",
      requestType = org.tikv.kvproto.Pdpb.ScatterRegionRequest.class,
      responseType = org.tikv.kvproto.Pdpb.ScatterRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScatterRegionRequest,
      org.tikv.kvproto.Pdpb.ScatterRegionResponse> getScatterRegionMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.ScatterRegionRequest, org.tikv.kvproto.Pdpb.ScatterRegionResponse> getScatterRegionMethod;
    if ((getScatterRegionMethod = PDGrpc.getScatterRegionMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getScatterRegionMethod = PDGrpc.getScatterRegionMethod) == null) {
          PDGrpc.getScatterRegionMethod = getScatterRegionMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.ScatterRegionRequest, org.tikv.kvproto.Pdpb.ScatterRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScatterRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ScatterRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.ScatterRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("ScatterRegion"))
              .build();
        }
      }
    }
    return getScatterRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetGCSafePointRequest,
      org.tikv.kvproto.Pdpb.GetGCSafePointResponse> getGetGCSafePointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGCSafePoint",
      requestType = org.tikv.kvproto.Pdpb.GetGCSafePointRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetGCSafePointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetGCSafePointRequest,
      org.tikv.kvproto.Pdpb.GetGCSafePointResponse> getGetGCSafePointMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetGCSafePointRequest, org.tikv.kvproto.Pdpb.GetGCSafePointResponse> getGetGCSafePointMethod;
    if ((getGetGCSafePointMethod = PDGrpc.getGetGCSafePointMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetGCSafePointMethod = PDGrpc.getGetGCSafePointMethod) == null) {
          PDGrpc.getGetGCSafePointMethod = getGetGCSafePointMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetGCSafePointRequest, org.tikv.kvproto.Pdpb.GetGCSafePointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGCSafePoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetGCSafePointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetGCSafePointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetGCSafePoint"))
              .build();
        }
      }
    }
    return getGetGCSafePointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest,
      org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> getUpdateGCSafePointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGCSafePoint",
      requestType = org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest.class,
      responseType = org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest,
      org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> getUpdateGCSafePointMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest, org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> getUpdateGCSafePointMethod;
    if ((getUpdateGCSafePointMethod = PDGrpc.getUpdateGCSafePointMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getUpdateGCSafePointMethod = PDGrpc.getUpdateGCSafePointMethod) == null) {
          PDGrpc.getUpdateGCSafePointMethod = getUpdateGCSafePointMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest, org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGCSafePoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("UpdateGCSafePoint"))
              .build();
        }
      }
    }
    return getUpdateGCSafePointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest,
      org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> getUpdateServiceGCSafePointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceGCSafePoint",
      requestType = org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest.class,
      responseType = org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest,
      org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> getUpdateServiceGCSafePointMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest, org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> getUpdateServiceGCSafePointMethod;
    if ((getUpdateServiceGCSafePointMethod = PDGrpc.getUpdateServiceGCSafePointMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getUpdateServiceGCSafePointMethod = PDGrpc.getUpdateServiceGCSafePointMethod) == null) {
          PDGrpc.getUpdateServiceGCSafePointMethod = getUpdateServiceGCSafePointMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest, org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceGCSafePoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("UpdateServiceGCSafePoint"))
              .build();
        }
      }
    }
    return getUpdateServiceGCSafePointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncRegionRequest,
      org.tikv.kvproto.Pdpb.SyncRegionResponse> getSyncRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncRegions",
      requestType = org.tikv.kvproto.Pdpb.SyncRegionRequest.class,
      responseType = org.tikv.kvproto.Pdpb.SyncRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncRegionRequest,
      org.tikv.kvproto.Pdpb.SyncRegionResponse> getSyncRegionsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncRegionRequest, org.tikv.kvproto.Pdpb.SyncRegionResponse> getSyncRegionsMethod;
    if ((getSyncRegionsMethod = PDGrpc.getSyncRegionsMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getSyncRegionsMethod = PDGrpc.getSyncRegionsMethod) == null) {
          PDGrpc.getSyncRegionsMethod = getSyncRegionsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.SyncRegionRequest, org.tikv.kvproto.Pdpb.SyncRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SyncRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SyncRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("SyncRegions"))
              .build();
        }
      }
    }
    return getSyncRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetOperatorRequest,
      org.tikv.kvproto.Pdpb.GetOperatorResponse> getGetOperatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperator",
      requestType = org.tikv.kvproto.Pdpb.GetOperatorRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetOperatorRequest,
      org.tikv.kvproto.Pdpb.GetOperatorResponse> getGetOperatorMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetOperatorRequest, org.tikv.kvproto.Pdpb.GetOperatorResponse> getGetOperatorMethod;
    if ((getGetOperatorMethod = PDGrpc.getGetOperatorMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetOperatorMethod = PDGrpc.getGetOperatorMethod) == null) {
          PDGrpc.getGetOperatorMethod = getGetOperatorMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetOperatorRequest, org.tikv.kvproto.Pdpb.GetOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetOperatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetOperator"))
              .build();
        }
      }
    }
    return getGetOperatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncMaxTSRequest,
      org.tikv.kvproto.Pdpb.SyncMaxTSResponse> getSyncMaxTSMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncMaxTS",
      requestType = org.tikv.kvproto.Pdpb.SyncMaxTSRequest.class,
      responseType = org.tikv.kvproto.Pdpb.SyncMaxTSResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncMaxTSRequest,
      org.tikv.kvproto.Pdpb.SyncMaxTSResponse> getSyncMaxTSMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SyncMaxTSRequest, org.tikv.kvproto.Pdpb.SyncMaxTSResponse> getSyncMaxTSMethod;
    if ((getSyncMaxTSMethod = PDGrpc.getSyncMaxTSMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getSyncMaxTSMethod = PDGrpc.getSyncMaxTSMethod) == null) {
          PDGrpc.getSyncMaxTSMethod = getSyncMaxTSMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.SyncMaxTSRequest, org.tikv.kvproto.Pdpb.SyncMaxTSResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncMaxTS"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SyncMaxTSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SyncMaxTSResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("SyncMaxTS"))
              .build();
        }
      }
    }
    return getSyncMaxTSMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SplitRegionsRequest,
      org.tikv.kvproto.Pdpb.SplitRegionsResponse> getSplitRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SplitRegions",
      requestType = org.tikv.kvproto.Pdpb.SplitRegionsRequest.class,
      responseType = org.tikv.kvproto.Pdpb.SplitRegionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SplitRegionsRequest,
      org.tikv.kvproto.Pdpb.SplitRegionsResponse> getSplitRegionsMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.SplitRegionsRequest, org.tikv.kvproto.Pdpb.SplitRegionsResponse> getSplitRegionsMethod;
    if ((getSplitRegionsMethod = PDGrpc.getSplitRegionsMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getSplitRegionsMethod = PDGrpc.getSplitRegionsMethod) == null) {
          PDGrpc.getSplitRegionsMethod = getSplitRegionsMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.SplitRegionsRequest, org.tikv.kvproto.Pdpb.SplitRegionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SplitRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SplitRegionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.SplitRegionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("SplitRegions"))
              .build();
        }
      }
    }
    return getSplitRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest,
      org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> getGetDCLocationInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDCLocationInfo",
      requestType = org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest.class,
      responseType = org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest,
      org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> getGetDCLocationInfoMethod() {
    io.grpc.MethodDescriptor<org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest, org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> getGetDCLocationInfoMethod;
    if ((getGetDCLocationInfoMethod = PDGrpc.getGetDCLocationInfoMethod) == null) {
      synchronized (PDGrpc.class) {
        if ((getGetDCLocationInfoMethod = PDGrpc.getGetDCLocationInfoMethod) == null) {
          PDGrpc.getGetDCLocationInfoMethod = getGetDCLocationInfoMethod =
              io.grpc.MethodDescriptor.<org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest, org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDCLocationInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDMethodDescriptorSupplier("GetDCLocationInfo"))
              .build();
        }
      }
    }
    return getGetDCLocationInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PDStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDStub>() {
        @java.lang.Override
        public PDStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDStub(channel, callOptions);
        }
      };
    return PDStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PDBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDBlockingStub>() {
        @java.lang.Override
        public PDBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDBlockingStub(channel, callOptions);
        }
      };
    return PDBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PDFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDFutureStub>() {
        @java.lang.Override
        public PDFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDFutureStub(channel, callOptions);
        }
      };
    return PDFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PDImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetMembers get the member list of this cluster. It does not require
     * the cluster_id in request matchs the id of this cluster.
     * </pre>
     */
    public void getMembers(org.tikv.kvproto.Pdpb.GetMembersRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMembersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.TsoRequest> tso(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.TsoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTsoMethod(), responseObserver);
    }

    /**
     */
    public void bootstrap(org.tikv.kvproto.Pdpb.BootstrapRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.BootstrapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBootstrapMethod(), responseObserver);
    }

    /**
     */
    public void isBootstrapped(org.tikv.kvproto.Pdpb.IsBootstrappedRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.IsBootstrappedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsBootstrappedMethod(), responseObserver);
    }

    /**
     */
    public void allocID(org.tikv.kvproto.Pdpb.AllocIDRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AllocIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllocIDMethod(), responseObserver);
    }

    /**
     */
    public void getStore(org.tikv.kvproto.Pdpb.GetStoreRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStoreMethod(), responseObserver);
    }

    /**
     */
    public void putStore(org.tikv.kvproto.Pdpb.PutStoreRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutStoreMethod(), responseObserver);
    }

    /**
     */
    public void getAllStores(org.tikv.kvproto.Pdpb.GetAllStoresRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetAllStoresResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStoresMethod(), responseObserver);
    }

    /**
     */
    public void storeHeartbeat(org.tikv.kvproto.Pdpb.StoreHeartbeatRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreHeartbeatMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest> regionHeartbeat(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.RegionHeartbeatResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRegionHeartbeatMethod(), responseObserver);
    }

    /**
     */
    public void getRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionMethod(), responseObserver);
    }

    /**
     */
    public void getPrevRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPrevRegionMethod(), responseObserver);
    }

    /**
     */
    public void getRegionByID(org.tikv.kvproto.Pdpb.GetRegionByIDRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionByIDMethod(), responseObserver);
    }

    /**
     */
    public void scanRegions(org.tikv.kvproto.Pdpb.ScanRegionsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScanRegionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanRegionsMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void askSplit(org.tikv.kvproto.Pdpb.AskSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskSplitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAskSplitMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void reportSplit(org.tikv.kvproto.Pdpb.ReportSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportSplitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportSplitMethod(), responseObserver);
    }

    /**
     */
    public void askBatchSplit(org.tikv.kvproto.Pdpb.AskBatchSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskBatchSplitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAskBatchSplitMethod(), responseObserver);
    }

    /**
     */
    public void reportBatchSplit(org.tikv.kvproto.Pdpb.ReportBatchSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportBatchSplitMethod(), responseObserver);
    }

    /**
     */
    public void getClusterConfig(org.tikv.kvproto.Pdpb.GetClusterConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetClusterConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClusterConfigMethod(), responseObserver);
    }

    /**
     */
    public void putClusterConfig(org.tikv.kvproto.Pdpb.PutClusterConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutClusterConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutClusterConfigMethod(), responseObserver);
    }

    /**
     */
    public void scatterRegion(org.tikv.kvproto.Pdpb.ScatterRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScatterRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScatterRegionMethod(), responseObserver);
    }

    /**
     */
    public void getGCSafePoint(org.tikv.kvproto.Pdpb.GetGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetGCSafePointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGCSafePointMethod(), responseObserver);
    }

    /**
     */
    public void updateGCSafePoint(org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGCSafePointMethod(), responseObserver);
    }

    /**
     */
    public void updateServiceGCSafePoint(org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceGCSafePointMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncRegionRequest> syncRegions(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncRegionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSyncRegionsMethod(), responseObserver);
    }

    /**
     */
    public void getOperator(org.tikv.kvproto.Pdpb.GetOperatorRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetOperatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOperatorMethod(), responseObserver);
    }

    /**
     */
    public void syncMaxTS(org.tikv.kvproto.Pdpb.SyncMaxTSRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncMaxTSResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMaxTSMethod(), responseObserver);
    }

    /**
     */
    public void splitRegions(org.tikv.kvproto.Pdpb.SplitRegionsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SplitRegionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitRegionsMethod(), responseObserver);
    }

    /**
     */
    public void getDCLocationInfo(org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDCLocationInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetMembersRequest,
                org.tikv.kvproto.Pdpb.GetMembersResponse>(
                  this, METHODID_GET_MEMBERS)))
          .addMethod(
            getTsoMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.TsoRequest,
                org.tikv.kvproto.Pdpb.TsoResponse>(
                  this, METHODID_TSO)))
          .addMethod(
            getBootstrapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.BootstrapRequest,
                org.tikv.kvproto.Pdpb.BootstrapResponse>(
                  this, METHODID_BOOTSTRAP)))
          .addMethod(
            getIsBootstrappedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.IsBootstrappedRequest,
                org.tikv.kvproto.Pdpb.IsBootstrappedResponse>(
                  this, METHODID_IS_BOOTSTRAPPED)))
          .addMethod(
            getAllocIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.AllocIDRequest,
                org.tikv.kvproto.Pdpb.AllocIDResponse>(
                  this, METHODID_ALLOC_ID)))
          .addMethod(
            getGetStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetStoreRequest,
                org.tikv.kvproto.Pdpb.GetStoreResponse>(
                  this, METHODID_GET_STORE)))
          .addMethod(
            getPutStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.PutStoreRequest,
                org.tikv.kvproto.Pdpb.PutStoreResponse>(
                  this, METHODID_PUT_STORE)))
          .addMethod(
            getGetAllStoresMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetAllStoresRequest,
                org.tikv.kvproto.Pdpb.GetAllStoresResponse>(
                  this, METHODID_GET_ALL_STORES)))
          .addMethod(
            getStoreHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.StoreHeartbeatRequest,
                org.tikv.kvproto.Pdpb.StoreHeartbeatResponse>(
                  this, METHODID_STORE_HEARTBEAT)))
          .addMethod(
            getRegionHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.RegionHeartbeatRequest,
                org.tikv.kvproto.Pdpb.RegionHeartbeatResponse>(
                  this, METHODID_REGION_HEARTBEAT)))
          .addMethod(
            getGetRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetRegionRequest,
                org.tikv.kvproto.Pdpb.GetRegionResponse>(
                  this, METHODID_GET_REGION)))
          .addMethod(
            getGetPrevRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetRegionRequest,
                org.tikv.kvproto.Pdpb.GetRegionResponse>(
                  this, METHODID_GET_PREV_REGION)))
          .addMethod(
            getGetRegionByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetRegionByIDRequest,
                org.tikv.kvproto.Pdpb.GetRegionResponse>(
                  this, METHODID_GET_REGION_BY_ID)))
          .addMethod(
            getScanRegionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.ScanRegionsRequest,
                org.tikv.kvproto.Pdpb.ScanRegionsResponse>(
                  this, METHODID_SCAN_REGIONS)))
          .addMethod(
            getAskSplitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.AskSplitRequest,
                org.tikv.kvproto.Pdpb.AskSplitResponse>(
                  this, METHODID_ASK_SPLIT)))
          .addMethod(
            getReportSplitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.ReportSplitRequest,
                org.tikv.kvproto.Pdpb.ReportSplitResponse>(
                  this, METHODID_REPORT_SPLIT)))
          .addMethod(
            getAskBatchSplitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.AskBatchSplitRequest,
                org.tikv.kvproto.Pdpb.AskBatchSplitResponse>(
                  this, METHODID_ASK_BATCH_SPLIT)))
          .addMethod(
            getReportBatchSplitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.ReportBatchSplitRequest,
                org.tikv.kvproto.Pdpb.ReportBatchSplitResponse>(
                  this, METHODID_REPORT_BATCH_SPLIT)))
          .addMethod(
            getGetClusterConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetClusterConfigRequest,
                org.tikv.kvproto.Pdpb.GetClusterConfigResponse>(
                  this, METHODID_GET_CLUSTER_CONFIG)))
          .addMethod(
            getPutClusterConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.PutClusterConfigRequest,
                org.tikv.kvproto.Pdpb.PutClusterConfigResponse>(
                  this, METHODID_PUT_CLUSTER_CONFIG)))
          .addMethod(
            getScatterRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.ScatterRegionRequest,
                org.tikv.kvproto.Pdpb.ScatterRegionResponse>(
                  this, METHODID_SCATTER_REGION)))
          .addMethod(
            getGetGCSafePointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetGCSafePointRequest,
                org.tikv.kvproto.Pdpb.GetGCSafePointResponse>(
                  this, METHODID_GET_GCSAFE_POINT)))
          .addMethod(
            getUpdateGCSafePointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest,
                org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse>(
                  this, METHODID_UPDATE_GCSAFE_POINT)))
          .addMethod(
            getUpdateServiceGCSafePointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest,
                org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse>(
                  this, METHODID_UPDATE_SERVICE_GCSAFE_POINT)))
          .addMethod(
            getSyncRegionsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.SyncRegionRequest,
                org.tikv.kvproto.Pdpb.SyncRegionResponse>(
                  this, METHODID_SYNC_REGIONS)))
          .addMethod(
            getGetOperatorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetOperatorRequest,
                org.tikv.kvproto.Pdpb.GetOperatorResponse>(
                  this, METHODID_GET_OPERATOR)))
          .addMethod(
            getSyncMaxTSMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.SyncMaxTSRequest,
                org.tikv.kvproto.Pdpb.SyncMaxTSResponse>(
                  this, METHODID_SYNC_MAX_TS)))
          .addMethod(
            getSplitRegionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.SplitRegionsRequest,
                org.tikv.kvproto.Pdpb.SplitRegionsResponse>(
                  this, METHODID_SPLIT_REGIONS)))
          .addMethod(
            getGetDCLocationInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest,
                org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse>(
                  this, METHODID_GET_DCLOCATION_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class PDStub extends io.grpc.stub.AbstractAsyncStub<PDStub> {
    private PDStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMembers get the member list of this cluster. It does not require
     * the cluster_id in request matchs the id of this cluster.
     * </pre>
     */
    public void getMembers(org.tikv.kvproto.Pdpb.GetMembersRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.TsoRequest> tso(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.TsoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTsoMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void bootstrap(org.tikv.kvproto.Pdpb.BootstrapRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.BootstrapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBootstrapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isBootstrapped(org.tikv.kvproto.Pdpb.IsBootstrappedRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.IsBootstrappedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsBootstrappedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allocID(org.tikv.kvproto.Pdpb.AllocIDRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AllocIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllocIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStore(org.tikv.kvproto.Pdpb.GetStoreRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putStore(org.tikv.kvproto.Pdpb.PutStoreRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStores(org.tikv.kvproto.Pdpb.GetAllStoresRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetAllStoresResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void storeHeartbeat(org.tikv.kvproto.Pdpb.StoreHeartbeatRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.RegionHeartbeatRequest> regionHeartbeat(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.RegionHeartbeatResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRegionHeartbeatMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPrevRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPrevRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegionByID(org.tikv.kvproto.Pdpb.GetRegionByIDRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanRegions(org.tikv.kvproto.Pdpb.ScanRegionsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScanRegionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanRegionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void askSplit(org.tikv.kvproto.Pdpb.AskSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskSplitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAskSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void reportSplit(org.tikv.kvproto.Pdpb.ReportSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportSplitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void askBatchSplit(org.tikv.kvproto.Pdpb.AskBatchSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskBatchSplitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAskBatchSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportBatchSplit(org.tikv.kvproto.Pdpb.ReportBatchSplitRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportBatchSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClusterConfig(org.tikv.kvproto.Pdpb.GetClusterConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetClusterConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClusterConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putClusterConfig(org.tikv.kvproto.Pdpb.PutClusterConfigRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutClusterConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutClusterConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scatterRegion(org.tikv.kvproto.Pdpb.ScatterRegionRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScatterRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScatterRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGCSafePoint(org.tikv.kvproto.Pdpb.GetGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetGCSafePointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGCSafePointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGCSafePoint(org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGCSafePointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServiceGCSafePoint(org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceGCSafePointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncRegionRequest> syncRegions(
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncRegionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSyncRegionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getOperator(org.tikv.kvproto.Pdpb.GetOperatorRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetOperatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOperatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncMaxTS(org.tikv.kvproto.Pdpb.SyncMaxTSRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncMaxTSResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncMaxTSMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void splitRegions(org.tikv.kvproto.Pdpb.SplitRegionsRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SplitRegionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSplitRegionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDCLocationInfo(org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest request,
        io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDCLocationInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PDBlockingStub extends io.grpc.stub.AbstractBlockingStub<PDBlockingStub> {
    private PDBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMembers get the member list of this cluster. It does not require
     * the cluster_id in request matchs the id of this cluster.
     * </pre>
     */
    public org.tikv.kvproto.Pdpb.GetMembersResponse getMembers(org.tikv.kvproto.Pdpb.GetMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.BootstrapResponse bootstrap(org.tikv.kvproto.Pdpb.BootstrapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBootstrapMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.IsBootstrappedResponse isBootstrapped(org.tikv.kvproto.Pdpb.IsBootstrappedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsBootstrappedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.AllocIDResponse allocID(org.tikv.kvproto.Pdpb.AllocIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllocIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetStoreResponse getStore(org.tikv.kvproto.Pdpb.GetStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.PutStoreResponse putStore(org.tikv.kvproto.Pdpb.PutStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetAllStoresResponse getAllStores(org.tikv.kvproto.Pdpb.GetAllStoresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStoresMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.StoreHeartbeatResponse storeHeartbeat(org.tikv.kvproto.Pdpb.StoreHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetRegionResponse getRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetRegionResponse getPrevRegion(org.tikv.kvproto.Pdpb.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPrevRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetRegionResponse getRegionByID(org.tikv.kvproto.Pdpb.GetRegionByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.ScanRegionsResponse scanRegions(org.tikv.kvproto.Pdpb.ScanRegionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanRegionsMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public org.tikv.kvproto.Pdpb.AskSplitResponse askSplit(org.tikv.kvproto.Pdpb.AskSplitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAskSplitMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public org.tikv.kvproto.Pdpb.ReportSplitResponse reportSplit(org.tikv.kvproto.Pdpb.ReportSplitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportSplitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.AskBatchSplitResponse askBatchSplit(org.tikv.kvproto.Pdpb.AskBatchSplitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAskBatchSplitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.ReportBatchSplitResponse reportBatchSplit(org.tikv.kvproto.Pdpb.ReportBatchSplitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportBatchSplitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetClusterConfigResponse getClusterConfig(org.tikv.kvproto.Pdpb.GetClusterConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClusterConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.PutClusterConfigResponse putClusterConfig(org.tikv.kvproto.Pdpb.PutClusterConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutClusterConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.ScatterRegionResponse scatterRegion(org.tikv.kvproto.Pdpb.ScatterRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScatterRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetGCSafePointResponse getGCSafePoint(org.tikv.kvproto.Pdpb.GetGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGCSafePointMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse updateGCSafePoint(org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGCSafePointMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse updateServiceGCSafePoint(org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceGCSafePointMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetOperatorResponse getOperator(org.tikv.kvproto.Pdpb.GetOperatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOperatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.SyncMaxTSResponse syncMaxTS(org.tikv.kvproto.Pdpb.SyncMaxTSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncMaxTSMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.SplitRegionsResponse splitRegions(org.tikv.kvproto.Pdpb.SplitRegionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSplitRegionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse getDCLocationInfo(org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDCLocationInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PDFutureStub extends io.grpc.stub.AbstractFutureStub<PDFutureStub> {
    private PDFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMembers get the member list of this cluster. It does not require
     * the cluster_id in request matchs the id of this cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetMembersResponse> getMembers(
        org.tikv.kvproto.Pdpb.GetMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.BootstrapResponse> bootstrap(
        org.tikv.kvproto.Pdpb.BootstrapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBootstrapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.IsBootstrappedResponse> isBootstrapped(
        org.tikv.kvproto.Pdpb.IsBootstrappedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsBootstrappedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.AllocIDResponse> allocID(
        org.tikv.kvproto.Pdpb.AllocIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllocIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetStoreResponse> getStore(
        org.tikv.kvproto.Pdpb.GetStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.PutStoreResponse> putStore(
        org.tikv.kvproto.Pdpb.PutStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetAllStoresResponse> getAllStores(
        org.tikv.kvproto.Pdpb.GetAllStoresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStoresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.StoreHeartbeatResponse> storeHeartbeat(
        org.tikv.kvproto.Pdpb.StoreHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetRegionResponse> getRegion(
        org.tikv.kvproto.Pdpb.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetRegionResponse> getPrevRegion(
        org.tikv.kvproto.Pdpb.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPrevRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetRegionResponse> getRegionByID(
        org.tikv.kvproto.Pdpb.GetRegionByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.ScanRegionsResponse> scanRegions(
        org.tikv.kvproto.Pdpb.ScanRegionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanRegionsMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.AskSplitResponse> askSplit(
        org.tikv.kvproto.Pdpb.AskSplitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAskSplitMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.ReportSplitResponse> reportSplit(
        org.tikv.kvproto.Pdpb.ReportSplitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportSplitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.AskBatchSplitResponse> askBatchSplit(
        org.tikv.kvproto.Pdpb.AskBatchSplitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAskBatchSplitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.ReportBatchSplitResponse> reportBatchSplit(
        org.tikv.kvproto.Pdpb.ReportBatchSplitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportBatchSplitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetClusterConfigResponse> getClusterConfig(
        org.tikv.kvproto.Pdpb.GetClusterConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClusterConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.PutClusterConfigResponse> putClusterConfig(
        org.tikv.kvproto.Pdpb.PutClusterConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutClusterConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.ScatterRegionResponse> scatterRegion(
        org.tikv.kvproto.Pdpb.ScatterRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScatterRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetGCSafePointResponse> getGCSafePoint(
        org.tikv.kvproto.Pdpb.GetGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGCSafePointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse> updateGCSafePoint(
        org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGCSafePointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse> updateServiceGCSafePoint(
        org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceGCSafePointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetOperatorResponse> getOperator(
        org.tikv.kvproto.Pdpb.GetOperatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOperatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.SyncMaxTSResponse> syncMaxTS(
        org.tikv.kvproto.Pdpb.SyncMaxTSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncMaxTSMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.SplitRegionsResponse> splitRegions(
        org.tikv.kvproto.Pdpb.SplitRegionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSplitRegionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse> getDCLocationInfo(
        org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDCLocationInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MEMBERS = 0;
  private static final int METHODID_BOOTSTRAP = 1;
  private static final int METHODID_IS_BOOTSTRAPPED = 2;
  private static final int METHODID_ALLOC_ID = 3;
  private static final int METHODID_GET_STORE = 4;
  private static final int METHODID_PUT_STORE = 5;
  private static final int METHODID_GET_ALL_STORES = 6;
  private static final int METHODID_STORE_HEARTBEAT = 7;
  private static final int METHODID_GET_REGION = 8;
  private static final int METHODID_GET_PREV_REGION = 9;
  private static final int METHODID_GET_REGION_BY_ID = 10;
  private static final int METHODID_SCAN_REGIONS = 11;
  private static final int METHODID_ASK_SPLIT = 12;
  private static final int METHODID_REPORT_SPLIT = 13;
  private static final int METHODID_ASK_BATCH_SPLIT = 14;
  private static final int METHODID_REPORT_BATCH_SPLIT = 15;
  private static final int METHODID_GET_CLUSTER_CONFIG = 16;
  private static final int METHODID_PUT_CLUSTER_CONFIG = 17;
  private static final int METHODID_SCATTER_REGION = 18;
  private static final int METHODID_GET_GCSAFE_POINT = 19;
  private static final int METHODID_UPDATE_GCSAFE_POINT = 20;
  private static final int METHODID_UPDATE_SERVICE_GCSAFE_POINT = 21;
  private static final int METHODID_GET_OPERATOR = 22;
  private static final int METHODID_SYNC_MAX_TS = 23;
  private static final int METHODID_SPLIT_REGIONS = 24;
  private static final int METHODID_GET_DCLOCATION_INFO = 25;
  private static final int METHODID_TSO = 26;
  private static final int METHODID_REGION_HEARTBEAT = 27;
  private static final int METHODID_SYNC_REGIONS = 28;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PDImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PDImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MEMBERS:
          serviceImpl.getMembers((org.tikv.kvproto.Pdpb.GetMembersRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetMembersResponse>) responseObserver);
          break;
        case METHODID_BOOTSTRAP:
          serviceImpl.bootstrap((org.tikv.kvproto.Pdpb.BootstrapRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.BootstrapResponse>) responseObserver);
          break;
        case METHODID_IS_BOOTSTRAPPED:
          serviceImpl.isBootstrapped((org.tikv.kvproto.Pdpb.IsBootstrappedRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.IsBootstrappedResponse>) responseObserver);
          break;
        case METHODID_ALLOC_ID:
          serviceImpl.allocID((org.tikv.kvproto.Pdpb.AllocIDRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AllocIDResponse>) responseObserver);
          break;
        case METHODID_GET_STORE:
          serviceImpl.getStore((org.tikv.kvproto.Pdpb.GetStoreRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetStoreResponse>) responseObserver);
          break;
        case METHODID_PUT_STORE:
          serviceImpl.putStore((org.tikv.kvproto.Pdpb.PutStoreRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutStoreResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_STORES:
          serviceImpl.getAllStores((org.tikv.kvproto.Pdpb.GetAllStoresRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetAllStoresResponse>) responseObserver);
          break;
        case METHODID_STORE_HEARTBEAT:
          serviceImpl.storeHeartbeat((org.tikv.kvproto.Pdpb.StoreHeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.StoreHeartbeatResponse>) responseObserver);
          break;
        case METHODID_GET_REGION:
          serviceImpl.getRegion((org.tikv.kvproto.Pdpb.GetRegionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse>) responseObserver);
          break;
        case METHODID_GET_PREV_REGION:
          serviceImpl.getPrevRegion((org.tikv.kvproto.Pdpb.GetRegionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse>) responseObserver);
          break;
        case METHODID_GET_REGION_BY_ID:
          serviceImpl.getRegionByID((org.tikv.kvproto.Pdpb.GetRegionByIDRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetRegionResponse>) responseObserver);
          break;
        case METHODID_SCAN_REGIONS:
          serviceImpl.scanRegions((org.tikv.kvproto.Pdpb.ScanRegionsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScanRegionsResponse>) responseObserver);
          break;
        case METHODID_ASK_SPLIT:
          serviceImpl.askSplit((org.tikv.kvproto.Pdpb.AskSplitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskSplitResponse>) responseObserver);
          break;
        case METHODID_REPORT_SPLIT:
          serviceImpl.reportSplit((org.tikv.kvproto.Pdpb.ReportSplitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportSplitResponse>) responseObserver);
          break;
        case METHODID_ASK_BATCH_SPLIT:
          serviceImpl.askBatchSplit((org.tikv.kvproto.Pdpb.AskBatchSplitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.AskBatchSplitResponse>) responseObserver);
          break;
        case METHODID_REPORT_BATCH_SPLIT:
          serviceImpl.reportBatchSplit((org.tikv.kvproto.Pdpb.ReportBatchSplitRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ReportBatchSplitResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER_CONFIG:
          serviceImpl.getClusterConfig((org.tikv.kvproto.Pdpb.GetClusterConfigRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetClusterConfigResponse>) responseObserver);
          break;
        case METHODID_PUT_CLUSTER_CONFIG:
          serviceImpl.putClusterConfig((org.tikv.kvproto.Pdpb.PutClusterConfigRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.PutClusterConfigResponse>) responseObserver);
          break;
        case METHODID_SCATTER_REGION:
          serviceImpl.scatterRegion((org.tikv.kvproto.Pdpb.ScatterRegionRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.ScatterRegionResponse>) responseObserver);
          break;
        case METHODID_GET_GCSAFE_POINT:
          serviceImpl.getGCSafePoint((org.tikv.kvproto.Pdpb.GetGCSafePointRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetGCSafePointResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GCSAFE_POINT:
          serviceImpl.updateGCSafePoint((org.tikv.kvproto.Pdpb.UpdateGCSafePointRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateGCSafePointResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_GCSAFE_POINT:
          serviceImpl.updateServiceGCSafePoint((org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.UpdateServiceGCSafePointResponse>) responseObserver);
          break;
        case METHODID_GET_OPERATOR:
          serviceImpl.getOperator((org.tikv.kvproto.Pdpb.GetOperatorRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetOperatorResponse>) responseObserver);
          break;
        case METHODID_SYNC_MAX_TS:
          serviceImpl.syncMaxTS((org.tikv.kvproto.Pdpb.SyncMaxTSRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncMaxTSResponse>) responseObserver);
          break;
        case METHODID_SPLIT_REGIONS:
          serviceImpl.splitRegions((org.tikv.kvproto.Pdpb.SplitRegionsRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SplitRegionsResponse>) responseObserver);
          break;
        case METHODID_GET_DCLOCATION_INFO:
          serviceImpl.getDCLocationInfo((org.tikv.kvproto.Pdpb.GetDCLocationInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.GetDCLocationInfoResponse>) responseObserver);
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
        case METHODID_TSO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.tso(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.TsoResponse>) responseObserver);
        case METHODID_REGION_HEARTBEAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.regionHeartbeat(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.RegionHeartbeatResponse>) responseObserver);
        case METHODID_SYNC_REGIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.syncRegions(
              (io.grpc.stub.StreamObserver<org.tikv.kvproto.Pdpb.SyncRegionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PDBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PDBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tikv.kvproto.Pdpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PD");
    }
  }

  private static final class PDFileDescriptorSupplier
      extends PDBaseDescriptorSupplier {
    PDFileDescriptorSupplier() {}
  }

  private static final class PDMethodDescriptorSupplier
      extends PDBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PDMethodDescriptorSupplier(String methodName) {
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
      synchronized (PDGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PDFileDescriptorSupplier())
              .addMethod(getGetMembersMethod())
              .addMethod(getTsoMethod())
              .addMethod(getBootstrapMethod())
              .addMethod(getIsBootstrappedMethod())
              .addMethod(getAllocIDMethod())
              .addMethod(getGetStoreMethod())
              .addMethod(getPutStoreMethod())
              .addMethod(getGetAllStoresMethod())
              .addMethod(getStoreHeartbeatMethod())
              .addMethod(getRegionHeartbeatMethod())
              .addMethod(getGetRegionMethod())
              .addMethod(getGetPrevRegionMethod())
              .addMethod(getGetRegionByIDMethod())
              .addMethod(getScanRegionsMethod())
              .addMethod(getAskSplitMethod())
              .addMethod(getReportSplitMethod())
              .addMethod(getAskBatchSplitMethod())
              .addMethod(getReportBatchSplitMethod())
              .addMethod(getGetClusterConfigMethod())
              .addMethod(getPutClusterConfigMethod())
              .addMethod(getScatterRegionMethod())
              .addMethod(getGetGCSafePointMethod())
              .addMethod(getUpdateGCSafePointMethod())
              .addMethod(getUpdateServiceGCSafePointMethod())
              .addMethod(getSyncRegionsMethod())
              .addMethod(getGetOperatorMethod())
              .addMethod(getSyncMaxTSMethod())
              .addMethod(getSplitRegionsMethod())
              .addMethod(getGetDCLocationInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
