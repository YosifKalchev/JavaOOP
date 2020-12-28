package cart;


import cart.item.Apple;
import cart.item.Chocolate;
import cart.item.Item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MapShoppingCart implements ShoppingCart {


    private final Map<Item, Integer> items;

    private static final MapShoppingCart instance = new MapShoppingCart();

    public static MapShoppingCart getInstance() {
        return instance;
    }

    public MapShoppingCart() {

        items = new HashMap<>();
    }

    public Item[] AllItems = new Item[] {

            new Apple("fuji", "Fuji apple", 1.2),
            new Apple("honeycrisp", "Honeycrisp apple", 1.4),
            new Apple("envy", "Envy apple", 0.8),
            new Apple("gala", "Gala apple", 0.7),
            new Apple("pazazz", "Pazazz apple", 1.9),
            new Apple("braeburn", "Braeburn", 0.5),
            new Chocolate("milk", "Milk Chocolate", 1.8),
            new Chocolate("couverture", "Couverture Chocolate", 2),
            new Chocolate("compound", "Compound Chocolate", 1.9),
            new Chocolate("white", "White Chocolate", 1.2),
            new Chocolate("ruby", "Ruby Chocolate", 2.5)
    };


    public Map<Item, Integer> getItems() {
        return items;
    }

    @Override
    public Collection<Item> getUniqueItems() {
        return items.keySet();
    }

    @Override
    public void addItem(Item item) {
            if (items.containsKey(item)) {
                items.put(item, items.get(item) + 1 );
            } else {
                items.put(item, 1);
            }
    }



    @Override
    public void removeItem(Item item) {
        if (items.containsKey(item)) {
            if (items.get(item) == 1) {
                items.remove(item);
            } else {
                items.put(item, items.get(item) -1);
            }
        }
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Item item : items.keySet()) {
            total += item.getPrice() * items.get(item);
        } return total;
    }


    public Item getItemByName(String itemName) {
        for (Item item : items.keySet()) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        } return null;
    }

    public Item getItemFromAllItems(String itemName) {
        for (Item item : AllItems) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        } return null;
    }


    //This method is to improve testing.
    public void printCart() {
        for (Item item : items.keySet()) {
            System.out.println(
                    "Name: " + item.getName() +
                    ", Info: " + item.getDescription() +
                    ", Price: " + item.getPrice() +
                    ", Quantity/value: " + items.get(item)
            );
        }
    }
}
