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

    public static void main(String[] args) {
        OrderInput orderInput = orderCreator();
    }
}
