package cart.item;

public class Chocolate implements Item {

    private final String name;
    private final String description;
    private final double price;

    public Chocolate(String name, String desc, double price) {
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

}