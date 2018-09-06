## gRPC - Java Server
Simple gRPC server written in Java.
Uses an rpc getPerson() which returns user details to the clients.

### Dependencies
* Maven
* Protobuf
* Netty


### Running the server
 `mvn package exec:java -Dexec.mainClass=com.molten.grpc.App`

### Android client code
[Android GRPC - Kotlin](https://github.com/vivekkartha/android-grpc-kotlin)
