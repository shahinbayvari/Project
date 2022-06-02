import static org.junit.Assert.assertEquals;

public class TestOrder {
    private static void testOrderId(OrderOutput orderOutput) {
        String orderReference = "12345";
        assertEquals(orderReference, orderOutput.orderReference);
    }
    public static void main(String[] args) {
        OrderInput orderInput = Main.orderCreator();
        OrderOutput orderOutput = Main.convertToJSON(orderInput);
        testOrderId(orderOutput);
    }
}
