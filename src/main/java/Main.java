import com.google.gson.Gson;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    private static OrderInput orderCreator() {
        OrderInput orderInput = null;
        try {
            JAXBContext context = JAXBContext.newInstance(OrderInput.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            orderInput = (OrderInput) unmarshaller.unmarshal(
                    new File("/home/kali/IdeaProjects/Project/src/main/resources/order.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return orderInput;
    }

/*    private static OrderOutput convertToJSON(OrderInput orderInput) {
        String orderReference = orderInput.getId();
        String nawGegevens = "" + orderInput.getNaam() + "\n" + orderInput.getAdres() +
                "\n" + orderInput.getPostcode() + " " + orderInput.getPlaats() + "\n" +
                orderInput.getLand();
        String productId = orderInput.getProductId();
        return new OrderOutput(orderReference, nawGegevens, productId);
    } */

    public static void main(String[] args) {
        OrderInput orderInput = orderCreator();
        //OrderOutput orderOutput = convertToJSON(orderInput);
    }
}
