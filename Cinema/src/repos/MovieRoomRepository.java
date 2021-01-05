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
        rooms.add(new MovieRoom("test", 5,5));
    }

    public void addMovieRoom(MovieRoom movieRoom) {
        rooms.add(movieRoom);
    }

     public MovieRoom getMovieRoomByNumber(int choice) {
         for (int i = 0; i < rooms.size(); i++) {
             if (i == choice-1) {
                 return rooms.get(i);
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
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println(
                        (i + 1) + ". Venue name: " + rooms.get(i).getName() +
                                ", Capacity: " + rooms.get(i).getSeats() * rooms.get(i).getRows()
                                + " seats.");
            }
        } else System.out.println("There are no movie rooms created.\n");

    }



    public boolean isValid(int choice) {
        for (int i = 0; i < rooms.size(); i++) {
            if (i == choice-1) {
                return true;
            }
        } return false;
    }

    public MovieRoom getMovieRoomByName(String roomName) {
        for (MovieRoom room : rooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        } return null;
    }
}
