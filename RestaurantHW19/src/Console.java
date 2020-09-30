import constants.ChefOption;
import constants.WaiterOption;
import dataBase.Waiter;

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
                "Press " + WaiterOption.LOGOUT.value + " for logout.\n" +
                "Press " + WaiterOption.CREATE_ORDER.value + " to create an order.\n" +
                "Press " + WaiterOption.CHANGE_ORDER_STATUS.value + " to change the order status.\n" +
                "Press " + WaiterOption.SEE_ALL_ACTIVE_ORDERS.value + " to see all active orders.\n" +
                "Press " + WaiterOption.SEE_ORDER_HISTORY.value + " to see the order history.\n" +
                "Press " + WaiterOption.SEE_THE_MENU.value + " to create an order.\n" +
                "Press " + WaiterOption.CHANGE_THE_MENU.value + " to change the menu.\n");
    }

    @Override
    public void showWaiterOptionsForTheMenu() {
        print(
              "Press " + WaiterOption.ADD_CONSUMABLE.value + " to add a consumable to the menu.\n" +
              "Press " + WaiterOption.REMOVE_CONSUMABLE.value + " to remove a consumable from the menu.\n" +
              "Press " + WaiterOption.BACK_TO_MAIN_WAITER_MENU.value + " to return to the main menu."
        );
    }


    @Override
    public void showChefOptions() {
        print(
                "Press " + ChefOption.LOGOUT.value + " for logout.\n" +
                "Press " + ChefOption.SEE_NEW_ORDERS.value + " to see all new orders.\n" +
                "Press " + ChefOption.CHANGE_ORDER_STATUS.value + " to change order status.");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }

    @Override
    public WaiterOption getWaiterOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid waiter option:");
            userInput = getNumberFromUser();
        }  while (WaiterOption.convertToWaiterOption(userInput) == null);
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
