package controllers;

import constants.AdminOption;
import dataBase.Movie;
import dataBase.MovieRoom;
import repos.MovieRepository;
import repos.MovieRoomRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class AdminController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public AdminController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an Admin. Choose an option:\n");
        AdminOption chosenOption = null;
        while (chosenOption != AdminOption.LOGOUT) {
            input.showAdminOptions();
            chosenOption = input.getAdminOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case SHOW_ALL_MOVIE_ROOMS -> showAllMovieRoomsOptionChosen();
                case CREATE_MOVIE_ROOM -> createMovieRoomOptionChosen();
                case SHOW_ALL_ACTIVE_MOVIES -> showAllActiveMoviesOptionChosen();
                case CREATE_MOVIE -> createMovieOptionChosen();
            }
        }
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void showAllMovieRoomsOptionChosen() {
        MovieRoomRepository.getInstance().printAllMovieRooms();
    }

    private void createMovieRoomOptionChosen() {


        print("Enter the name of the room (min 3 characters):  ");
        String roomName = input.getStringFromUser();
        int roomRows;
        int rowSeats;

        if ( MovieRoomRepository.getInstance().isEqual(roomName)) {
            print("The room with this name already exists. Enter a different name.");
            createMovieRoomOptionChosen();
        } else if (MovieRoomRepository.getInstance().isIdentical(roomName)) {
            print("There is a room with identical name. Enter a different name.");
            createMovieRoomOptionChosen();
        } else if (roomName.length() < 3) {
            print("The name of the room is too short");
            createMovieRoomOptionChosen();
        } else {
            print("Enter the number of rows: ");
            roomRows = input.getNumberFromUser();


            print("Enter the number of seats of each row: ");
            rowSeats = input.getNumberFromUser();

            MovieRoom movieRoom = new MovieRoom(roomName, roomRows, rowSeats);
            MovieRoomRepository.getInstance().addMovieRoom(movieRoom);
            MovieRoomRepository.getInstance().getMovieRoomByName(roomName).printVenue();
        }
    }

    private void showAllActiveMoviesOptionChosen() {
        MovieRepository.getInstance().printAllMovies();
    }

    private void createMovieOptionChosen() {

        MovieRoomRepository.getInstance().printAllMovieRooms();
        print("Enter the number to choose a movie room");
        int choice = input.getNumberFromUser();
        if (!MovieRoomRepository.getInstance().isValid(choice)) {
            print("Enter a valid number.");
            createMovieOptionChosen();
        } else {
            MovieRoom room = MovieRoomRepository.getInstance().getMovieRoomByNumber(choice);
            print("You have chosen room: " + room.getName());
            print("Enter the name of the movie");
            String movieName = input.getStringFromUser();
            print("Enter the price of the ticket: ");
            double ticketPrice = input.getDoubleFromUser();
            ZonedDateTime movieDateAndTime = getDateFromUser();
            Movie movie = new Movie(movieName, ticketPrice, room, movieDateAndTime);
            MovieRepository.getInstance().addMovie(movie);

            print("You have created a movie '" + movieName +
                    "' in room '" + room.getName() +
                    "' for " + movie.getMovieDateAndTime()
                                            .format(DateTimeFormatter
                                            .ofPattern("MM-dd-yyyy - HH:mm")) +
                    ". The ticket price is: " + ticketPrice);
            print("");
        }

    }

    public ZonedDateTime getDateFromUser() {
        print("Enter date  and time (eg. 2021-12-20 23:30)");
        String userInput = input.getStringFromUser();
        ZonedDateTime formattedDate = ZonedDateTime.now();

        try {
            char[] userInputAsArray = new char[userInput.length()];

            for (int i = 0; i < userInput.length(); i++) {
                userInputAsArray[i] = userInput.charAt(i);
            }

            formattedDate = formatTheDate(userInputAsArray);

            if (!checkIfDateIsCorrect(formattedDate)) {
                print("You have entered a past date. Try again.");
                return getDateFromUser();
            }  else {return formattedDate;}
        } catch (Exception ex) {
            System.out.println("Enter the date and time in the given format.");
            getDateFromUser();
        }
        return formattedDate;
        }


    private boolean checkIfDateIsCorrect(ZonedDateTime date) {
        return ZonedDateTime.now().isBefore(date);
    }

    private ZonedDateTime formatTheDate(char[] userInputAsArray) {
        char[] dateToArray = new char[10];
        char[] timeToArray = new char[5];

        System.arraycopy(userInputAsArray, 0, dateToArray, 0, 10);
        String date = new String(dateToArray);

        System.arraycopy(userInputAsArray, 11, timeToArray, 0, timeToArray.length);
        String time = new String(timeToArray);

        return ZonedDateTime.parse(date+"T"+time+":15+12:24");
    }

    private void print(String text) {
        System.out.println(text);
    }
}

