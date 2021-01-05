package dataBase;

import java.time.ZonedDateTime;


public class Ticket {

    private final Movie movie;
    private final double price;
    private final ZonedDateTime date;
    private final int row;
    private final int seat;

    public Ticket(Movie movie, double price, ZonedDateTime date, int row, int seat) {
        this.movie = movie;
        this.price = price;
        this.date = date;
        this.row = row;
        this.seat = seat;
    }

    public Ticket() {
        this.movie = null;
        this.price = 0;
        this.date = ZonedDateTime.now();
        this.row = 0;
        this.seat = 0;
    }



    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        return price;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}
