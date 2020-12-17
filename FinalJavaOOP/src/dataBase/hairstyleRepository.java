package dataBase;

import java.util.ArrayList;
import java.util.List;

public class hairstyleRepository {

    private static final hairstyleRepository instance = new hairstyleRepository();

    public static hairstyleRepository getInstance() {
        return instance;
    }

    private static List<dataBase.Tape> hairstyles;

    private hairstyleRepository() {
        hairstyles = new ArrayList<>();
    // here we add customs

    }

    public boolean isValid(String tapeName) {
        boolean check = false;
        for (int i = 0; i < hairstyles.size(); i++) {
            if (hairstyles.get(i).getName().equals(tapeName)) {
                check = true;
                break;
            }
        }
        return check;
    }


    public dataBase.Tape getTapeByName(String name) {

        for (int i = 0; i < hairstyles.size(); i++) {
            if (hairstyles.get(i).getName().equals(name)) {
                return hairstyles.get(i);
            }
        }
        return null;
    }

    public void showAllTapes() {
        System.out.print("The list of all tapes:\n");
        for (int i = 0; i < hairstyles.size(); i++) {
            print("Tape: " + hairstyles.get(i).getName() + " - available");
        }
    }

    public void showAllAvailableTapes() {
        print("The list of all available tapes:\n");
        for (int i = 0; i < hairstyles.size(); i++) {
            print("Tape: " + hairstyles.get(i).getName());
        }
        print("");
    }


    public void addTape (dataBase.Tape tape) {
        hairstyles.add(tape);
        tape.setIsTaken(false);
        tape.setCustomer(dataBase.UserRepository.getInstance().getUserByUsername("admin"));
    }

    public void removeTape (dataBase.Tape tape) {
        hairstyles.remove(tape);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
