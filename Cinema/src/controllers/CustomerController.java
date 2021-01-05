package controllers;

import constants.CustomerOption;
import dataBase.Movie;
import dataBase.Ticket;
import repos.MovieRepository;



public class CustomerController implements Controller {

    protected final LoginService loginService;
    private final Input input;


    public CustomerController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {

        print("You are now logged as a CUSTOMER. Choose an option:\n");
        CustomerOption chosenOption = null;
        while (chosenOption != CustomerOption.LOGOUT) {
            input.showCustomerOptions();
            chosenOption = input.getCustomerOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case SEE_ALL_MOVIES-> seeAllMoviesOptionChosen();
                case BUY_TICKETS -> buyTicketsOptionChosen();
            }
        }
    }


    private void buyTicketsOptionChosen() {
        MovieRepository.getInstance().printAllMovies();
        if (MovieRepository.getInstance().getMovies().isEmpty()) {
            print("There is no movies.");
        }
        print("Enter a number to choose a movie");
        int choice = input.getNumberFromUser();
        if (!MovieRepository.getInstance().isValid(choice)) {
            print("Enter a valid number.");
            buyTicketsOptionChosen();
        } else {
            Movie movie = MovieRepository.getInstance().getMovieByNumber(choice);

            print("You have chosen movie: " + movie.getName());
            print(" ");
            movie.getMovieroom().printVenue();
            print("This is the movie room. Choose your seats");

            int row = Integer.MAX_VALUE;
            int trueRow = 0;
            while (!movie.getMovieroom().isRowValid(row-1)) {
                print("Enter the row");
                trueRow = input.getNumberFromUser();
                row = trueRow;
            } row = trueRow;

            int seat = Integer.MAX_VALUE;
            int trueSeat = 0;
            while (!movie.getMovieroom().isSeatValid(seat-1)) {
                print("Enter the seat");
                trueSeat = input.getNumberFromUser();
                seat = trueSeat;
            } seat = trueSeat;

            if (!movie.getMovieroom().isExactSeatValid(row -1, seat -1)) {
                System.out.println("You are trying to book a reserved seat.");
            } else {
                Ticket ticket = new Ticket(
                        movie, movie.getPrice(), movie.getMovieDateAndTime(), row -1, seat-1);
                print("You have bought your ticket.");
                movie.addTicket(ticket);
                movie.getMovieroom().setSetUnavailable(row -1, seat-1);}}
        }

    private void seeAllMoviesOptionChosen() {
        MovieRepository.getInstance().printAllMovies();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }

}

