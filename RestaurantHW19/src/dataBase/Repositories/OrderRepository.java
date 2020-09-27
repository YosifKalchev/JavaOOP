package dataBase.Repositories;

import dataBase.Order;
import dataBase.Table;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private static final OrderRepository instance = new OrderRepository();

    public static OrderRepository getInstance() {return instance;}

    private static List<Order> orders;

    private OrderRepository() {
        orders = new ArrayList<>();
        orders.add(new Order());
        orders.add(new Order());
        orders.add(new Order());
    }

//
//    public Table getOrderByTable(int tableNumber) {
//        for (int i = 0; i < tables.size(); i++) {
//            if (tables.get(i).getTableNumber() == tableNumber) {
//                return tables.get(i);
//            }
//        } return null;
//    }

    public void showAllOrders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Order number: " + orders.get(i).getOrderNumber());
        }
    }
}
