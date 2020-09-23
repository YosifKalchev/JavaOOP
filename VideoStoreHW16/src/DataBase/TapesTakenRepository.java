package dataBase;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TapesTakenRepository {



    private static final TapesTakenRepository instance = new TapesTakenRepository();

    public static boolean isReturnOptionValid(Tape tape) {
        return tape.getTapeTaker().equals(CurrentUser.getLoggedUser().getUsername());
    }

    public static TapesTakenRepository getInstance() {
        return instance;
    }

    private final List<Tape> tapesTaken;

    private TapesTakenRepository() {
        tapesTaken = new ArrayList<>();
    }

    public boolean isValid(String tapeName) {
        boolean check = false;
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getName().equals(tapeName)) {
                check = true;
                break;
            }
        }
        return check;
    }


    public Tape getTapeByName(String name) {

            for (int i = 0; i < tapesTaken.size(); i++) {
                if (tapesTaken.get(i).getName().equals(name)) {
                return tapesTaken.get(i);
                }
            }
            return null;
    }


    public void showAllTapesTaken() {
        for (int i = 0; i < tapesTaken.size(); i++) {
                print("Tape: " + tapesTaken.get(i).getName()  +
                        ". Taken by: " + tapesTaken.get(i).getTapeTaker());
        } print("");
    }

    public void showAllTapesTakenByCurrentUser() {
        print("The list of all tapes taken by the current user:\n");
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getTapeTaker().equals(CurrentUser.getLoggedUser().getUsername()))
            print("Tape: " + tapesTaken.get(i).getName() + ".\n");
        }
    }

    private void print(String text) {
        System.out.println(text);
    }



    public void returnTape(Tape tape) {
        for (int i = 0; i < tapesTaken.size(); i++) {
                if (tapesTaken.get(i).getTapeTaker().equals(CurrentUser.getLoggedUser().toString())) {
                    tape.setIsTaken(false);
                    break;
                }
        }
    }

    public void addTape (Tape tape) {
        tapesTaken.add(tape);
        tape.setIsTaken(true);
        tape.setTapeTaker(CurrentUser.getLoggedUser());
    }

    public void removeTape (Tape tape) {
        tape.setTapeTaker(UserRepository.getInstance().getUserByEMail("adm@"));
        tapesTaken.remove(tape);
    }

}
