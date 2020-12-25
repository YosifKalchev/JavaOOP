package cart.item;


import cart.MapShoppingCart;

public class Apple implements Item {

    private String name;
    private String description;
    private double price;

    public Apple(String name, String desc, double price) {

        this.name = name;
        this.description = desc;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public Item getItemByUsername(String itemName) {
        return MapShoppingCart.getInstance().getItemFromAllItems(itemName);
    }
}
