package taxi;

import kotlin.ranges.IntRange;
import org.junit.Assert;
import org.junit.Test;
import taxi.models.Driver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static taxi.TaxiParkTestUtilKt.taxiPark;
import static taxi.TaxiParkTestUtilKt.trip;

public class TestTask1Java {

    private void testFakeDrivers(Set<Integer> fakeDriverIndexes, TaxiPark tp) {
        String message = "Wrong result for 'findFakeDrivers()'." + tp.toString();
        Set<Driver> expected = fakeDriverIndexes.stream().map(integer -> (TaxiParkTestUtilKt.driver(integer))).collect(Collectors.toSet());
        Assert.assertEquals(message, expected, tp.findFakeDrivers());
    }

    @Test
    public void test0() {
        testFakeDrivers(setOf(0, 1, 2), taxiPark(new IntRange(0, 2), new IntRange(0, 4)));
    }

    @Test
    public void test1()    {
        testFakeDrivers(setOf(2, 3), taxiPark(new IntRange(1,3), new IntRange(1,2), trip(1, 1), trip(1, 2)));
    }

    @Test
    public void  test2() {
        testFakeDrivers(setOf(3), taxiPark(new IntRange(0, 3), new IntRange(0, 9),
                trip(2, listOf(9), 9, 36.0, null),
                trip(1, listOf(0), 15, 28.0, null),
                trip(2, listOf(1), 37, 30.0, null),
                trip(0, listOf(9), 24, 10.0, null),
                trip(1, listOf(2), 1, 6.0, null),
                trip(0, listOf(0, 9), 9, 7.0, null),
                trip(2, listOf(3, 2, 8), 18, 39.0, 0.1),
                trip(1, listOf(9, 4), 9, 1.0, 0.2),
                trip(1, listOf(3), 16, 23.0, null),
                trip(2, listOf(7), 10, 31.0, 0.2)));
    }

    private Set<Integer> setOf(Integer...args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(args));
        return set;
    }

    private List<Integer> listOf(Integer...args) {
        return Arrays.asList(args);
    }

}
