public abstract class PartialForwardingServerCallListener<ReqT> extends ServerCall.Listener<ReqT> {
    protected abstract ServerCall.Listener<?> delegate();

    @Override
    public void onHalfClose() {
        delegate().onHalfClose();
    }

    @Override
    public void onCancell() {
        delegate().onCancell();
    }

    @Override
    public void onComplete() {
        delegate().onComplete();
    }

    @Override
    public void onReady() {
        delegate().onReady();
    }
}
