import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Order.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Order order = (Order) unmarshaller.unmarshal(
                    new File("/home/kali/IdeaProjects/Project/src/main/resources/order.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
