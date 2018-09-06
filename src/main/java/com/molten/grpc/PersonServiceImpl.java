package com.molten.grpc;


import io.grpc.stub.StreamObserver;

public class PersonServiceImpl extends PersonServiceGrpc.PersonServiceImplBase {
    @Override
    public void getPerson(Empty request, StreamObserver<Person> responseObserver) {
        System.out.println(request);
        Person person = Person.newBuilder()
                .setEmail("vivek.kartha@molten.com")
                .setName("Vivek Kartha")
                .setPhone("90XXXXXXXX").build();
        responseObserver.onNext(person);
        responseObserver.onCompleted();
    }
}
