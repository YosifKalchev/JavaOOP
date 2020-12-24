package cart.item;


public class Apple implements Item {

    private String name;
    private String description;
    private double price;

    public Apple(String name, String desc, double price) {

        this.name = name;
        this.description = desc;
        this.price = price;
    }

    public Apple () {
        this("milk chocolate", "Basic", 1);
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
