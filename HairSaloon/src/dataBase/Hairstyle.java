package dataBase;

import users.Customer;
import users.Hairdresser;

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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setHairstyler(Hairdresser hairdresser) {
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
}
