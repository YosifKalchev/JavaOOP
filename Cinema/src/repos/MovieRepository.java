package repos;

import dataBase.Movie;
import dataBase.MovieRoom;

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


    public void printAllMovies() {
        if (!movies.isEmpty()) {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(
                        i+1 +
                                ". Movie name: " + movies.get(i).getName() +
                                ", Venue: " + movies.get(i).getMovieroom().getName());
                                movies.get(i).getMovieroom().printVenue();
                System.out.println();

            }
        } else System.out.println("There are no available movies.\n");

    }

    public List<Movie> getMovies() {
        return movies;
    }

    public boolean isValid(String choice) {
        for (Movie movie : movies) {
            if (choice.equals(movie.getName())) {
                return true;
            }
        } return false;
    }

    public Movie getMovieByName(String choice) {
        for (Movie movie : movies) {
            if (choice.equals(movie.getName())) {
                return movie;
            }
        } return null;
    }
}
