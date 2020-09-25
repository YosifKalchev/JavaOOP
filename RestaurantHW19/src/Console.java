import constants.ChefOption;
import constants.WaiterOption;

import java.util.Scanner;

public class Console implements Input {

    private final Scanner scanner;

    public Console() {

        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getUsernameFromUser() {
        print("Enter username: ");
        return getStringFromUser();
    }

    @Override
    public String getPasswordFromUser() {
        print("Enter password: ");
        return getStringFromUser();
    }

    @Override
    public String getStringFromUser() {
        return scanner.nextLine();
    }

    @Override
    public int getIntFromUser() {
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void showErrorLoginInput() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showWaiterOptions() {
        print(
                "Press " + WaiterOption.OPTION_1.value + "for ...\n" +
                "Press " + WaiterOption.OPTION_1.value + "for ...");
    }

    @Override
    public void showChefOptions() {
        print(
                "Press " + ChefOption.OPTION_1.value + "for ...\n" +
                "Press " + ChefOption.OPTION_1.value + "for ...");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }

    @Override
    public WaiterOption getWaiterOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid chef option:");
            userInput = getNumberFromUser();
        }  while (ChefOption.convertToChefOption(userInput) == null);
        return WaiterOption.convertToWaiterOption(userInput);
    }

    @Override
    public ChefOption getChefOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid chef option:");
            userInput = getNumberFromUser();
        }  while (ChefOption.convertToChefOption(userInput) == null);
        return ChefOption.convertToChefOption(userInput);
    }

    @Override
    public int getNumberFromUser() {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getNumberFromUser();
        }
        return number;
    }

    public void print(String text) {
        System.out.println(text);
    }
}
