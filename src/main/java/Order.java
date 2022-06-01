import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "order")
@XmlType(propOrder = {
        "id",
        "naam",
        "adres",
        "postcode",
        "plaats",
        "provincie",
        "land",
        "productId"
})
public class Order {
    private String id;
    private String naam;
    private String adres;
    private String postcode;
    private String plaats;
    private String provincie;
    private String land;
    private String productId;

    public String id() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPlaats() {
        return plaats;
    }

    public String getProvincie() {
        return provincie;
    }

    public String getLand() {
        return land;
    }

    public String getProductId() {
        return productId;
    }
}
