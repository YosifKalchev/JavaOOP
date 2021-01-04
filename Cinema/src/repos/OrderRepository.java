package repos;

import dataBase.Movie;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private static final OrderRepository instance = new OrderRepository();

    public static OrderRepository getInstance() {
        return instance;
    }

    private final List<Movie> orders;

    private OrderRepository() {

        orders = new ArrayList<>();
    }
}
