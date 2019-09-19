package edu.sjsu.cs249.abd;

import edu.sjsu.cs249.adb.ABDServiceGrpc;
import edu.sjsu.cs249.adb.Abd;
import edu.sjsu.cs249.adb.Read1Request;
import edu.sjsu.cs249.adb.Read1Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.NettyChannelProvider;

public class ABDClient {
    private ManagedChannel channel;
    private ABDServiceGrpc.ABDServiceBlockingStub  blockingStub;

    public ABDClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        blockingStub = ABDServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String args[]) throws Exception {
        ABDClient client = new ABDClient(args[0], Integer.parseInt(args[1]));
        Read1Response rsp = client.blockingStub.read1(Read1Request.newBuilder().setRegister("reg1").build());
        System.out.println(rsp.getValue());
    }
}
