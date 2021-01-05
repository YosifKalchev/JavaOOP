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
            movie.getMovieRoom().printVenue();
            print("This is the movie room. \nEnter the number of the tickets you want to buy:");

            int tickets = input.getNumberFromUser();
            Ticket ticket = new Ticket();
            int[] ticketCount = new int[tickets];
            int totalPrice = tickets;
            for (int number = 0; number < ticketCount.length; number++) {

                int row = isRowValidNumber(movie);
                int seat = isSeatValidNumber(movie);

                if (!movie.getMovieRoom().isExactSeatValid(row -1, seat -1)) {
                    System.out.println("You are trying to book a reserved seat.");
                    number--;
                } else {
                    ticket = new Ticket(
                            movie, movie.getPrice(), movie.getMovieDateAndTime(), row -1, seat-1);

                            movie.getMovieRoom().setSetUnavailable(row -1, seat-1);}
                            movie.addTicket(ticket);
                            movie.printTicket(ticket);
            

            }
            totalPrice *= movie.getPrice();
            print("You have bought your tickets.+\nTotal price: " + totalPrice);




        }
    }

    private int isSeatValidNumber(Movie movie) {
        int seat = Integer.MAX_VALUE;
        int trueSeat = 0;
        while (!movie.getMovieRoom().isSeatValid(seat-1)) {
            print("Enter the seat");
            trueSeat = input.getNumberFromUser();
            seat = trueSeat;
        }
        seat = trueSeat;
        return seat;
    }

    private int isRowValidNumber(Movie movie) {
        int row = Integer.MAX_VALUE;
        int trueRow = 0;
        while (!movie.getMovieRoom().isRowValid(row-1)) {
            print("Enter the row");
            trueRow = input.getNumberFromUser();
            row = trueRow;
        }
        row = trueRow;
        return row;
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

