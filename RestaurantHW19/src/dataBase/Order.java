package dataBase;

public class Order {

    private static int orderObjectCounter;
    private int orderNumber;
    private String orderStatus;

    public Order() {
        orderObjectCounter++;
        orderNumber = orderObjectCounter;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    private boolean isActive;


}
