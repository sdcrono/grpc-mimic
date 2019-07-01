public abstract class ForwardingServerCallListener<ReqT> extends PartialForwardingServerCallListener<ReqT> {
    @Override
    protected abstract ServerCall.Listener<ReqT> delegate();

    @Override
    public void onMessage(ReqT Message) {
        delegate().onMessage(Message);
    }

    public abstract static class SimpleForwardingServerCallListener<ReqT> extends ForwardingServerCallListener<ReqT> {
        private final ServerCall.Listener<ReqT> delegate;

        protected SimpleForwardingServerCallListener(ServerCall.Listener<ReqT> delegate) {
            this.delegate = delegate;
        }

        @Override
        protected ServerCall.Listener<ReqT> delegate() {
            return delegate;
        }
    }
}
