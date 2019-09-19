import grpc

import abd_pb2
import abd_pb2_grpc

print("opening channel")
with grpc.insecure_channel('127.0.0.1:2222') as channel:
    print("creating stub")
    stub = abd_pb2_grpc.ABDServiceStub(channel)
    print("making request")
    response = stub.read1(abd_pb2.Read1Request(register="i am python"))
    print("got: " + str(response))
