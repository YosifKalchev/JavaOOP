package dataBase;

import java.util.Date;

public class Ticket {

    private  Movie movie;
    private  double price;
    private  Date date;
    private  int row;
    private  int seat;

    public Ticket(Movie movie, double price, Date date, int row, int seat) {
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

    public void setDate(Date date) {
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

    public Date getDate() {
        return date;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}
