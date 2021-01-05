package repos;

import dataBase.Movie;
import dataBase.MovieRoom;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static final MovieRepository instance = new MovieRepository();

    public static MovieRepository getInstance() {
        return instance;
    }

    private final List<Movie> movies;

    private MovieRepository() {

        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
    public void printAllMovies() {
        if (!movies.isEmpty()) {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(
                        (i + 1 ) + ". Movie name: " + movies.get(i).getName() +
                                ", Venue: " + movies.get(i).getMovieroom().getName()+ "Date and time: " +
                                movies.get(i)
                                        .getMovieDateAndTime()
                                        .format(DateTimeFormatter
                                                .ofPattern("MM-dd-yyyy - HH:mm")));


            } System.out.println();
        } else System.out.println("There are no available movies.\n");
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public boolean isValid(int choice) {
        for (int i = 0; i < movies.size(); i++) {
            if (i == choice - 1) {
                return true;
            }
        } return false;
    }

    public Movie getMovieByNumber(int choice) {
        for (int i = 0; i < movies.size(); i++) {
            if (i == choice - 1) {
                return movies.get(i);
            }
        } return null;
    }


}
