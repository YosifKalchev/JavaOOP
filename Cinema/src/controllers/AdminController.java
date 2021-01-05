package controllers;

import constants.AdminOption;
import dataBase.Movie;
import dataBase.MovieRoom;
import repos.MovieRepository;
import repos.MovieRoomRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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


        print("Enter the name of the movie room: ");
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


    }

    private void createMovieOptionChosen() {

        MovieRoomRepository.getInstance().printAllMovieRooms();
        print("Enter the name of the chosen movie room");
        String  choice = input.getStringFromUser(); //todo return choice by number
        if (!MovieRoomRepository.getInstance().isValid(choice)) {
            print("Enter a valid name.");
            createMovieOptionChosen();
        } else {
            MovieRoom room = MovieRoomRepository.getInstance().getMovieRoomByName(choice);
            print("You have chosen room: " + room.getName());
            print("Enter the name of the movie");
            String movieName = input.getStringFromUser();
            print("Enter the price of the ticket: ");
            double ticketPrice = input.getDoubleFromUser();
            Date movieDateAndTime = getDateFromUser();
            Movie movie = new Movie(movieName, ticketPrice, room, movieDateAndTime);
            MovieRepository.getInstance().addMovie(movie);

            print("You have created a movie " + movieName +
                    " in room " + room.getName() +
                    ". The ticket price is: " + ticketPrice);
            print("");
        }

    }


        public Date getDateFromUser() {
            Date date = new Date();
            print("Enter the time and date ( example: 20:15 01-01-2000 )");
            String inputDate = input.getStringFromUser();
            try {
                date = new SimpleDateFormat("kk:mm dd-MM-yyyy").parse(inputDate);
            } catch (ParseException e) {
                System.out.println("The date is not in valid format. Try again");
                getDateFromUser();
            } return date;
        }








    private void print(String text) {
        System.out.println(text);
    }
}
