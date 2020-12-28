package cart;


import cart.item.Apple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class MapShoppingCartTest {

    private MapShoppingCart cart;

    Apple apple = new Apple("test", "test Apple", 1.5);

    @Before
    public void initShoppingCart() {
        this.cart = new MapShoppingCart();
    }

    @Test
    public void testAddItemWhenItemIsAddedThenReturnTrue() {
        cart.addItem(apple);
        boolean expected = cart.getUniqueItems().contains(apple);

        Assert.assertTrue("The item should be in the cart", expected);
    }

    @Test
    public void testRemoveItemWhenOneItemIsInTheCartThenReturnFalse() {
        cart.addItem(apple);
        cart.removeItem(apple);
        boolean expected = cart.getUniqueItems().contains(apple);

        Assert.assertFalse("The item should not be in the cart", expected);
    }

    @Test
    public void testRemoveItemWhenItemIsNotInTheCartThenReturnFalse() {

        cart.removeItem(apple);
        boolean expected = cart.getUniqueItems().contains(apple);

        Assert.assertFalse("The item should not be in the cart", expected);
    }

    @Test
    public void testRemoveItemWhenMoreThanOneInstancesOfTheItemAreInTheCartThenReturnTheNumberOfInstances() {
        cart.addItem(apple);
        cart.addItem(apple);
        cart.addItem(apple);
        cart.removeItem(apple);

        double expected = 2;
        double actual = cart.getItems().get(apple);

        Assert.assertEquals("Calculation is wrong.", actual, expected, 0.0001);

    }

    @Test
    public void testAddItemWhenItemIsNotInTheCartThenReturnOne() {
        cart.addItem(apple);

        double expected = 1;
        double actual = cart.getItems().get(apple);

        Assert.assertEquals("Calculation is wrong.", actual, expected, 0.0001);
    }

    @Test
    public void testAddItemWhenItemIsInTheCartThenReturnPositiveNumber() {

        cart.addItem(apple);
        cart.addItem(apple);
        cart.addItem(apple);

        double expected = 3;
        double actual = cart.getItems().get(apple);

        Assert.assertEquals("Calculation is wrong.", actual, expected, 0.0001);
    }

    @Test
    public void testGetTotalWhenTheCartIsEmptyThenReturnZero() {

        double expected = 0;
        double actual = cart.getTotal();

        Assert.assertEquals("The cost of an empty cart should be zero.", expected, actual, 0.0001);
    }

    @Test
    public void testGetTotalWhenTheCartIsNotEmptyThenReturnPositiveNumber() {

        cart.addItem(apple);
        cart.addItem(apple);
        cart.addItem(apple);

        double expected = 3 * 1.5 ;
        double actual = cart.getTotal();

        Assert.assertEquals("The cost calculation is wrong.", expected, actual, 0.001);
    }
}
