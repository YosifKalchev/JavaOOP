package cart;

public class Main {

    public static void main(String[] args) {

//        MapShoppingCart cart = MapShoppingCart.getInstance();
//        testingProgramWithGivenValues(cart);
    }

    private static void testingProgramWithGivenValues(MapShoppingCart cart) {
        cart.removeItem(cart.getItemFromAllItems("fuji"));
        System.out.println("*After removing 1 fuji (but nothing was added)*");
        cart.printCart();
        System.out.printf("Total price: " + "%.2f%n",  cart.getTotal());

        System.out.println(" ");
        System.out.println("*Added some items*");
        cart.addItem(cart.getItemFromAllItems("fuji"));
        cart.addItem(cart.getItemFromAllItems("honeycrisp"));
        cart.addItem(cart.getItemFromAllItems("honeycrisp"));
        cart.addItem(cart.getItemFromAllItems("honeycrisp"));
        cart.addItem(cart.getItemFromAllItems("honeycrisp"));
        cart.addItem(cart.getItemFromAllItems("honeycrisp"));
        cart.addItem(cart.getItemFromAllItems("envy"));
        cart.addItem(cart.getItemFromAllItems("braeburn"));
        cart.addItem(cart.getItemFromAllItems("braeburn"));
        cart.addItem(cart.getItemFromAllItems("braeburn"));
        cart.printCart();
        System.out.printf("Total price: " + "%.2f%n",  cart.getTotal());
        System.out.println(" ");

        cart.removeItem(cart.getItemFromAllItems("fuji"));
        cart.removeItem(cart.getItemFromAllItems("braeburn"));
        System.out.println("*After removing 1 fuji and 1 braeburn*");
        cart.printCart();
        System.out.printf("Total price: " + "%.2f%n",  cart.getTotal());
        System.out.println(" ");

        cart.removeItem(cart.getItemFromAllItems("fuji"));
        System.out.println("*After removing 1 fuji (there was no fuji to remove)*");
        cart.printCart();
        System.out.printf("Total price: " + "%.2f%n",  cart.getTotal());
    }
}
