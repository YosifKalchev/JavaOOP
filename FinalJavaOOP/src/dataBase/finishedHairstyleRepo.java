package dataBase;

import java.util.ArrayList;
import java.util.List;

public class finishedHairstyleRepo {



    private static final finishedHairstyleRepo instance = new finishedHairstyleRepo();

    public static boolean isReturnOptionValid(dataBase.Tape tape) {
        return tape.getCustomer().equals(dataBase.CurrentUser.getLoggedUser().getUsername());
    }

    public static finishedHairstyleRepo getInstance() {
        return instance;
    }

    private final List<dataBase.Tape> tapesTaken;

    private finishedHairstyleRepo() {
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


    public dataBase.Tape getTapeByName(String name) {

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
                    ". Taken by: " + tapesTaken.get(i).getCustomer());
        } print("");
    }

    public void showAllTapesTakenByCurrentUser() {
        print("The list of all tapes taken by the current user:\n");
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getCustomer().equals(dataBase.CurrentUser.getLoggedUser().getUsername()))
                print("Tape: " + tapesTaken.get(i).getName() + ".\n");
        }
    }

    private void print(String text) {
        System.out.println(text);
    }



    public void returnTape(dataBase.Tape tape) {
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getCustomer().equals(dataBase.CurrentUser.getLoggedUser().toString())) {
                tape.setIsTaken(false);
                break;
            }
        }
    }

    public void addTape (dataBase.Tape tape) {
        tapesTaken.add(tape);
        tape.setIsTaken(true);
        tape.setCustomer(dataBase.CurrentUser.getLoggedUser());
    }

    public void removeTape (dataBase.Tape tape) {
        tape.setCustomer(dataBase.UserRepository.getInstance().getUserByEMail("adm@"));
        tapesTaken.remove(tape);
    }

}
