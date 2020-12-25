package cart.item;

public interface Item {


    public String getName();

    public String getDescription();

    public double getPrice();

    Item getItemByUsername(String itemName);
}