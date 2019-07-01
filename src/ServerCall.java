
public abstract class ServerCall<ReqT, RespT> {

    public abstract static class Listener<ReqT> {
        public void onMessage(ReqT Message) {}
        public void onHalfClose() {}
        public void onCancell() {}
        public void onComplete() {}
        public void onReady () {}
    }

    public abstract void request(int numMessages);

//    public abstract void sendHeaders(Metadata metadata);

    public abstract void sendMessage(RespT message);

    public boolean isReady() {
        return true;
    }

//    public abstract void close(Status status, Metadata metadata);

    public abstract boolean isCancelled();

//    public abstract MethodDescriptor<ReqT, RespT> getMethodDescriptor();
}
