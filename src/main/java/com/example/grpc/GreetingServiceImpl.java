
package com.example.grpc;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase  {

    @Override
    public void greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
                         io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
        System.out.println(request);

        GreetingServiceOuterClass.HelloResponse helloResponse = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("Hello there ,"+request.getName())
                .build();

        responseObserver.onNext(helloResponse);

        responseObserver.onCompleted();
    }
}

