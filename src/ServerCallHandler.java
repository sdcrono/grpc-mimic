public interface ServerCallHandler<ReqT, RespT> {
    ServerCall.Listener<ReqT> startCall(ServerCall<ReqT, RespT> call);
}
