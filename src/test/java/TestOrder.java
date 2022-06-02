import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOrder {
    private OrderInput orderInput = Main.orderCreator();
    private OrderOutput orderOutput = Main.convertToJSON(orderInput);
    @Test
    public void testOrderId() {
        String orderReference = "12345";
        assertEquals(orderReference, orderOutput.orderReference);
    }

    @Test
    public void testNawGegevens() {
        String nawGegevens = "Jantje Jantjessen\nJantje Jantjessenstraat 5A\n9183DE Jantjesstad\nNederland";
        assertEquals(nawGegevens, orderOutput.nawGegevens);
    }

    @Test
    public void testProductId() {
        String productId = "83748";
        assertEquals(productId, orderOutput.productId);
    }
}
