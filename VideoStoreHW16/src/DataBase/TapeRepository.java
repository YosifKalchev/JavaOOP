package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapeRepository {

    public static User tapeTakerUser;

    private static final TapeRepository instance = new TapeRepository();

    public static TapeRepository getInstance() {
        return instance;
    }

    private static List<Tape> tapes;

    private TapeRepository() {
        tapes = new ArrayList<>();
        tapes.add(new Tape("monk"));
        tapes.add(new Tape("rambo"));
        tapes.add(new Tape("troy"));
    }

    public boolean isValid(String tapeName) {
        boolean check = false;
        for (int i = 0; i < tapes.size(); i++) {
            if (tapes.get(i).getName().equals(tapeName)) {
                check = true;
                break;
            }
        }
        return check;
    }


    public Tape getTapeByName(String name) {

        for (int i = 0; i < tapes.size(); i++) {
            if (tapes.get(i).getName().equals(name)) {
                return tapes.get(i);
            }
        }
        return null;
    }

    public void showAllTapes() {
            System.out.print("The list of all tapes:\n");
        for (int i = 0; i < tapes.size(); i++) {
            print("Tape: " + tapes.get(i).getName() + " - available");
        }
    }

    public void showAllAvailableTapes() {
        print("The list of all available tapes:\n");
        for (int i = 0; i < tapes.size(); i++) {
            print("Tape: " + tapes.get(i).getName());
        }
        print("");
    }


    public void addTape (Tape tape) {
        tapes.add(tape);
        tape.setIsTaken(false);
        tape.setTapeTaker(UserRepository.getInstance().getUserByUsername("admin"));
    }

    public void removeTape (Tape tape) {
        tapes.remove(tape);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
