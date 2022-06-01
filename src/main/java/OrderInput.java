import javax.xml.bind.annotation.XmlElement;
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
public class OrderInput {
    @XmlElement
    private String id;
    @XmlElement
    private String naam;
    @XmlElement
    private String adres;
    @XmlElement
    private String postcode;
    @XmlElement
    private String plaats;
    @XmlElement
    private String provincie;
    @XmlElement
    private String land;
    @XmlElement
    private String productId;

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
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
