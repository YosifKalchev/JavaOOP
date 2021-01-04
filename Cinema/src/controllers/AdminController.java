package controllers;

import constants.AdminOption;
import dataBase.MovieRoom;
import repos.MovieRoomRepository;

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
    }






    private void print(String text) {
        System.out.println(text);
    }
}
