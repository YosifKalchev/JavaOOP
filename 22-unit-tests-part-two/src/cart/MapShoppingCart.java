package cart;


import cart.item.Apple;
import cart.item.Item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MapShoppingCart implements ShoppingCart {


    private Map<Item, Integer> items;

    private static final MapShoppingCart instance = new MapShoppingCart();

    public static MapShoppingCart getInstance() {
        return instance;
    }

    private Apple fuji = new Apple("fuji", "Fuji", 1);

    public MapShoppingCart() {
        items = new HashMap<>();
        items.put(fuji, 0);
    }


    @Override
    public Collection<Item> getUniqueItems() {
        return items.keySet();
    }

    @Override
    public void addItem(Item item) {
        if (item != null) {
            Integer occurrence = items.get(item);
            if (occurrence == null) {
                occurrence = new Integer(0);
            }
            items.put(item, ++occurrence);
        }
    }

    @Override
    public void removeItem(Item item) {
        if (!items.containsKey(item)) {
            return;
        }
        Integer occurrences = items.get(item);
        items.put(item, --occurrences);
    }

    @Override
    public double getTotal() {
        return 0;
    }
}
