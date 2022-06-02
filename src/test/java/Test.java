public class Test {
    public static void main(String[] args) {
        OrderInput orderInput = Main.orderCreator();
        OrderOutput orderOutput = Main.convertToJSON(orderInput);

    }
}
