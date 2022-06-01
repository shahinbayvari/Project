public class OrderOutput {
    private String orderReference;
    private String nawGegevens;
    private String productId;

    public OrderOutput(String orderReference, String nawGegevens, String productId) {
        this.orderReference = orderReference;
        this.nawGegevens = nawGegevens;
        this.productId = productId;
    }
}
