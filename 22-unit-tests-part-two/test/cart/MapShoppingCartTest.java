package cart;

import cart.item.Apple;
import cart.item.Chocolate;
import cart.item.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapShoppingCartTest {

    Apple testApple = new Apple("fuji", "Fuji apple", 1.2);
    Chocolate testChocolate = new Chocolate("milk", "Milk Chocolate", 1.8);

    Item[] itemsArray = new Item[] {
            testApple,
            testChocolate
    };

    Map<Item, Integer> itemsHashMap = new HashMap<Item, Integer>() {{
        put(testApple, 0);
        put(testChocolate, 1);
    }};


    @Test
    public void testGetItemByNameWhenInsertStringAndItemExistsThenReturnTrue() {
        String input = "fuji";
        Item actual = testApple;
        Item expected = MapShoppingCart.getInstance().getItemFromAllItems("fuji");


        Assert.assertEquals("The items should be equal", expected, actual);

        //todo Make this test works. Find a way to compare the Items.

    }
}
