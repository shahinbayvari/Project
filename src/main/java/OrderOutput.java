public class OrderOutput {
    protected String orderReference;
    protected String nawGegevens;
    protected String productId;

    public OrderOutput(String orderReference, String nawGegevens, String productId) {
        this.orderReference = orderReference;
        this.nawGegevens = nawGegevens;
        this.productId = productId;
    }
}
