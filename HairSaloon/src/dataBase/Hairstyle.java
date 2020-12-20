package dataBase;

import users.Customer;
import users.Hairdresser;
import users.User;

public class Hairstyle {

    private Customer customer;
    private Hairdresser hairdresser;
    private int rating;
    private double price;

    public Hairstyle(Customer customer, Hairdresser hairdresser, int rating, double price) {
        this.customer = customer;
        this.hairdresser = hairdresser;
        this.rating = rating;
        this.price = price;
    }

    public Hairstyle() {
        this (null, null, 0, 0);
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setHairdresser(Hairdresser hairdresser) {
        this.hairdresser = hairdresser;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating range. Insert again.");
        }
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //todo delete the code below after the project is ready

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

    //todo delete to here!!!
}
