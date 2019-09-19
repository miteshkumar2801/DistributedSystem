from concurrent import futures

import grpc

import abd_pb2
import abd_pb2_grpc

import time

class ABDServer(abd_pb2_grpc.ABDServiceServicer):
    def read1(self, read1_req, context):
        print("got: {}".format(read1_req))
        return abd_pb2.Read1Response(value="what? python")

server = grpc.server(futures.ThreadPoolExecutor())
abd_pb2_grpc.add_ABDServiceServicer_to_server(ABDServer(), server)
server.add_insecure_port("[::]:2222")
server.start()
while True:
    time.sleep(60)
