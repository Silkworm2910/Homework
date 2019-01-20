package hw.hw141218.pizza;

public class Order {

    String order;
    String clientID;

    public Order(String order, String clientID) {
        this.order = order;
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }
}
