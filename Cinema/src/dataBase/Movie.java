package dataBase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {

    private final String name;
    private final double price;
    private final MovieRoom movieroom;
    private final Date movieDateAndTime;
    private final List<Ticket> tickets;

    public Date getMovieDateAndTime() {
        return movieDateAndTime;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public MovieRoom getMovieroom() {
        return movieroom;
    }



    public Movie(String name, double price, MovieRoom movieroom, Date movieDateAndTime) {
        this.name = name;
        this.price = price;
        this.movieroom = new MovieRoom(movieroom.getName(),
                movieroom.getRows(), movieroom.getSeats());
        this.movieDateAndTime = movieDateAndTime;
        tickets = new ArrayList<>();
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
