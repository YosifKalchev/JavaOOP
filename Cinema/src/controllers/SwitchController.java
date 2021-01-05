package controllers;

import dataBase.Movie;
import repos.MovieRepository;

import java.time.ZonedDateTime;
import java.util.List;

public class SwitchController {

    private static SwitchController instance;
    private final Controller loginController;
    private final Controller adminController;
    private final Controller customerController;


    private SwitchController (Input input) {
        LoginService loginService = new LoginService();
        loginController = new LoginController(input, loginService);
        adminController = new AdminController(input, loginService);
        customerController = new CustomerController(input, loginService);
    }

    public static SwitchController getInstance(Input input) {

//        removePastMovies();

        if (instance == null) instance = new SwitchController(input);
        return instance;
    }

    private static void removePastMovies() {
        try {
            if (MovieRepository.getInstance() != null) {
                for (Movie movie : MovieRepository.getInstance().getMovies()) {
                    if (movie.getMovieDateAndTime().isAfter(ZonedDateTime.now())) {
                        MovieRepository.getInstance().removeMovie(movie);
                    }
                }
            }

        } catch (Exception ignored) {
        }


    }

    public void startLogin() {
        loginController.startProgram();
    }

    public void startAdmin() {
        adminController.startProgram();
    }

    public void startCustomer() { customerController.startProgram();}
}
