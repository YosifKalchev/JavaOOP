package repos;

import dataBase.MovieRoom;

import java.util.ArrayList;
import java.util.List;

public class MovieRoomRepository {
    private static final MovieRoomRepository instance = new MovieRoomRepository();

    public static MovieRoomRepository getInstance() {
        return instance;
    }

    private final List<MovieRoom> rooms;

    private MovieRoomRepository() {

        rooms = new ArrayList<>();
    }

    public void addMovieRoom(MovieRoom movieRoom) {
        rooms.add(movieRoom);
    }

     public MovieRoom getMovieRoomByName(String name) {
        for (MovieRoom movieRoom : rooms) {
            if (movieRoom.getName().equals(name)) {
                return movieRoom;
            }
        } return null;
    }

    public List<MovieRoom> getRooms() {
        return rooms;
    }

    public boolean isIdentical(String name) {
        for (MovieRoom room : rooms) {
            if (room.getName().contains(name) || name.contains(room.getName())) {
                return true;
            }
        } return false;
    }

    public boolean isEqual(String name) {
        for (MovieRoom room : rooms) {
            if (room.getName().equals(name)) {
                return true;
            }
        } return false;
    }

    public void printAllMovieRooms() {

        if (!rooms.isEmpty()) {
            for (MovieRoom room : rooms) {
                System.out.println("Venue name: " + room.getName() +
                        ", Capacity: " + room.getSeats() * room.getRows() + " seats.");
            }
        } else System.out.println("There are no movie rooms created.\n");

    }
}
