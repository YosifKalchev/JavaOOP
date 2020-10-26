package cart;

import cart.item.Item;

import java.util.Collection;

public interface ShoppingCart {

    /**
     * Returns the unique items in the shopping cart
     * Collection is an interface, so you will have
     * to choose an implementation just like an ArrayList
     *
     * @return the unique items in the shopping cart
     */
    Collection<Item> GetUniqueItems();

    /**
     * Adds an item to the shopping cart. If an item is null it is not added to
     * the cart; If the same item has been added already, then the number of
     * these items increases by one
     *
     * @param item
     *            the item to be added
     */
    void AddItem(Item item);

    /**
     * Removes the item from the shopping cart. If there is more than one of the
     * same item, then their number decreases by one. Think of what you will do
     * if the item you search for is not in the shopping cart
     *
     * @param item
     *            the item to be removed
     */
    void RemoveItem(Item item);

    /**
     * Returns the total sum to be paid at checkout
     *
     * @return the total sum to be paid at checkout
     */
    double GetTotal();

}