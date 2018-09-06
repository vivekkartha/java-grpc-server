package com.molten.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = Integer.parseInt(System.getenv("PORT"));
        Server server = ServerBuilder.forPort(port)
                .addService(new PersonServiceImpl())
                .build();
        server.start();
        // Server threads are running in the background.
        System.out.println("Server started on port "+port);
        // Don't exit the main thread. Wait until server is terminated.
        server.awaitTermination();
    }
}
