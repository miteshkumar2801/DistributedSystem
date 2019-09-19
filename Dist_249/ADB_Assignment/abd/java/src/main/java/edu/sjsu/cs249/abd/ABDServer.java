package edu.sjsu.cs249.abd;

import edu.sjsu.cs249.adb.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ABDServer extends ABDServiceGrpc.ABDServiceImplBase {
    private Server server;
    public ABDServer(int port) {
        this.server = ServerBuilder.forPort(port).addService(this).build();
    }

    @Override
    public void read1(Read1Request request, StreamObserver<Read1Response> responseObserver) {
        System.out.println("trying to read " + request.getRegister());
        Read1Response rsp = Read1Response.newBuilder().setValue("what?").build();
        responseObserver.onNext(rsp);
        responseObserver.onCompleted();
    }

    @Override
    public void read2(Read2Request request, StreamObserver<AckResponse> responseObserver) {
        super.read2(request, responseObserver);
    }

    @Override
    public void write(WriteRequest request, StreamObserver<AckResponse> responseObserver) {
        super.write(request, responseObserver);
    }

    public static void main(String args[]) throws Exception {
        ABDServer server = new ABDServer(2222);
        server.server.start();
        server.server.awaitTermination();
    }
}
