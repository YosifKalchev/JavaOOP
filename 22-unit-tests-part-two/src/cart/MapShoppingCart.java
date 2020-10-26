package cart;

import cart.item.Item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MapShoppingCart implements ShoppingCart {

    private Map<Item, Integer> items = new HashMap<>();

    @Override
    public Collection<Item> GetUniqueItems() {
        return items.keySet();
    }

    @Override
    public void AddItem(Item item) {
        if (item != null) {
            Integer occurrences = items.get(item);
            if (occurrences == null) {
                occurrences = new Integer(0);
            }
            items.put(item, ++occurrences);
        }
    }

    @Override
    public void RemoveItem(Item item) {
        if (!items.containsKey(item)) {
            return;
        }
        Integer occurrences = items.get(item);
        items.put(item, occurrences--);
    }

    @Override
    public double GetTotal() {
        int total = 0;
        for (Map.Entry<Item, Integer> e : items.entrySet()) {
            total += e.getKey().getPrice();
        }
        return total;
    }

}
