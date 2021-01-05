package dataBase;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String name;
    private final double price;
    private final MovieRoom movieroom;
    private final ZonedDateTime movieDateAndTime;
    private final List<Ticket> tickets;


    public Movie(String name, double price, MovieRoom movieroom, ZonedDateTime movieDateAndTime) {
        this.name = name;
        this.price = price;
        this.movieroom = new MovieRoom(movieroom.getName(),
                movieroom.getRows(), movieroom.getSeats());
        this.movieDateAndTime = movieDateAndTime;
        tickets = new ArrayList<>();
    }

    public ZonedDateTime getMovieDateAndTime() {
        return movieDateAndTime;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public MovieRoom getMovieRoom() {
        return movieroom;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void printTicket(Ticket ticket) {
        System.out.println(
                "\n\nMovie: "+ticket.getMovie().getName() + ", Venue: " + getMovieRoom().getName() +
                "\nDate and time : " + ticket.getMovie().getMovieDateAndTime()
                                                        .format(DateTimeFormatter
                                                        .ofPattern("MM-dd-yyyy - HH:mm"))+
                "\nRow: "+ (ticket.getRow()+1) + ", Seat: "+(ticket.getSeat() +1)
                +"Price: "+ticket.getPrice() +"\n");
    }
}
