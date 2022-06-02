import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOrder {
    @Test
    public void testOrderId(OrderOutput orderOutput) {
        String orderReference = "12345";
        assertEquals(orderReference, orderOutput.orderReference);
    }

    @Test
    public void testNawGegevens(OrderOutput orderOutput) {
        String nawGegevens = "Jantje Jantjessen\nJantje Jantjessenstraat 5A\n9183DE Jantjesstad\nNederland";
        assertEquals(nawGegevens, orderOutput.nawGegevens);
    }

    @Test
    public void testProductId(OrderOutput orderOutput) {
        String productId = "83748";
        assertEquals(productId, orderOutput.productId);
    }
}
