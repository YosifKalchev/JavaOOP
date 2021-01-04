package dataBase;

public class Movie {

    private final String name;
    private final double price;
    private final MovieRoom movieroom;
    private final String date;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public MovieRoom getMovieroom() {
        return movieroom;
    }

    public String getDate() {
        return date;
    }

    public Movie(String name, double price, MovieRoom movieroom) {
        this.name = name;
        this.price = price;
        this.movieroom = movieroom;
        this.date = null;

        //todo add date in the constructor

    }
}
