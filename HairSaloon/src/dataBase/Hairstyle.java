package dataBase;

import users.Customer;
import users.Hairdresser;
import users.User;

public class Hairstyle {

    private final Customer customer;
    private final Hairdresser hairdresser;
    private final int rating;
    private final double price;

    public Hairstyle(Customer customer, Hairdresser hairdresser, int rating, double price) {
        this.customer = customer;
        this.hairdresser = hairdresser;
        this.rating = rating;
        this.price = price;
    }


    public Customer getCustomer() {
        return customer;
    }

    public Hairdresser getHairdresser() {
        return hairdresser;
    }

    public int getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

}
