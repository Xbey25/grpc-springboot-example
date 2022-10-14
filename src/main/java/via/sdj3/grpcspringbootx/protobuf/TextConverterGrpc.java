package via.sdj3.grpcspringbootx.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: contract.proto")
public final class TextConverterGrpc {

  private TextConverterGrpc() {}

  public static final String SERVICE_NAME = "TextConverter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getToUpperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "toUpper",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getToUpperMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getToUpperMethod;
    if ((getToUpperMethod = TextConverterGrpc.getToUpperMethod) == null) {
      synchronized (TextConverterGrpc.class) {
        if ((getToUpperMethod = TextConverterGrpc.getToUpperMethod) == null) {
          TextConverterGrpc.getToUpperMethod = getToUpperMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "toUpper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new TextConverterMethodDescriptorSupplier("toUpper"))
              .build();
        }
      }
    }
    return getToUpperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getCapitalizeFirstCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "capitalizeFirstCharacter",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getCapitalizeFirstCharacterMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getCapitalizeFirstCharacterMethod;
    if ((getCapitalizeFirstCharacterMethod = TextConverterGrpc.getCapitalizeFirstCharacterMethod) == null) {
      synchronized (TextConverterGrpc.class) {
        if ((getCapitalizeFirstCharacterMethod = TextConverterGrpc.getCapitalizeFirstCharacterMethod) == null) {
          TextConverterGrpc.getCapitalizeFirstCharacterMethod = getCapitalizeFirstCharacterMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "capitalizeFirstCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new TextConverterMethodDescriptorSupplier("capitalizeFirstCharacter"))
              .build();
        }
      }
    }
    return getCapitalizeFirstCharacterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextConverterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterStub>() {
        @java.lang.Override
        public TextConverterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterStub(channel, callOptions);
        }
      };
    return TextConverterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextConverterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterBlockingStub>() {
        @java.lang.Override
        public TextConverterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterBlockingStub(channel, callOptions);
        }
      };
    return TextConverterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextConverterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterFutureStub>() {
        @java.lang.Override
        public TextConverterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterFutureStub(channel, callOptions);
        }
      };
    return TextConverterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TextConverterImplBase implements io.grpc.BindableService {

    /**
     */
    public void toUpper(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToUpperMethod(), responseObserver);
    }

    /**
     */
    public void capitalizeFirstCharacter(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCapitalizeFirstCharacterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getToUpperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_TO_UPPER)))
          .addMethod(
            getCapitalizeFirstCharacterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_CAPITALIZE_FIRST_CHARACTER)))
          .build();
    }
  }

  /**
   */
  public static final class TextConverterStub extends io.grpc.stub.AbstractAsyncStub<TextConverterStub> {
    private TextConverterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterStub(channel, callOptions);
    }

    /**
     */
    public void toUpper(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToUpperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void capitalizeFirstCharacter(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCapitalizeFirstCharacterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TextConverterBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextConverterBlockingStub> {
    private TextConverterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText toUpper(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToUpperMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText capitalizeFirstCharacter(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCapitalizeFirstCharacterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TextConverterFutureStub extends io.grpc.stub.AbstractFutureStub<TextConverterFutureStub> {
    private TextConverterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> toUpper(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToUpperMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> capitalizeFirstCharacter(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCapitalizeFirstCharacterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TO_UPPER = 0;
  private static final int METHODID_CAPITALIZE_FIRST_CHARACTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextConverterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextConverterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TO_UPPER:
          serviceImpl.toUpper((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
          break;
        case METHODID_CAPITALIZE_FIRST_CHARACTER:
          serviceImpl.capitalizeFirstCharacter((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
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

  private static abstract class TextConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextConverterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.grpcspringbootx.protobuf.Contract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextConverter");
    }
  }

  private static final class TextConverterFileDescriptorSupplier
      extends TextConverterBaseDescriptorSupplier {
    TextConverterFileDescriptorSupplier() {}
  }

  private static final class TextConverterMethodDescriptorSupplier
      extends TextConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextConverterMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextConverterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextConverterFileDescriptorSupplier())
              .addMethod(getToUpperMethod())
              .addMethod(getCapitalizeFirstCharacterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
