package dataBase;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;


public class Ticket {

    private  Movie movie;
    private  double price;
    private  ZonedDateTime date;
    private  int row;
    private  int seat;

    public Ticket(Movie movie, double price, ZonedDateTime date, int row, int seat) {
        this.movie = movie;
        this.price = price;
        this.date = date;
        this.row = row;
        this.seat = seat;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
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
