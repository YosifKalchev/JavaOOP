import constants.ChefOption;
import constants.WaiterOptions;
import constants.WaiterSubOptions;

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
    public void showErrorLoginInput() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showWaiterOptions() {
        print(
                "Press " + WaiterOptions.LOGOUT.value + " for logout.\n" +
                "Press " + WaiterOptions.CREATE_ORDER.value + " to create an order.\n" +
                "Press " + WaiterOptions.CHANGE_ORDER_STATUS.value + " to change the order status.\n" +
                "Press " + WaiterOptions.SEE_ALL_ACTIVE_ORDERS.value + " to see all active orders.\n" +
                "Press " + WaiterOptions.SEE_ORDER_HISTORY.value + " to see the order history.\n" +
                "Press " + WaiterOptions.SEE_THE_MENU.value + " to create an order.\n" +
                "Press " + WaiterOptions.CHANGE_THE_MENU.value + " to change the menu.\n");
    }

    @Override
    public void showWaiterOptionsForTheMenu() {
        print(
              "Press " + WaiterSubOptions.ADD_CONSUMABLE.value + " to add a consumable to the menu.\n" +
              "Press " + WaiterSubOptions.REMOVE_CONSUMABLE.value + " to remove a consumable from the menu.\n" +
              "Press " + WaiterSubOptions.BACK_TO_MAIN_WAITER_MENU.value + " to return to the main menu."
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
    public WaiterSubOptions getWaiterSubOptionFromUSer() {
        int userInput;
        do {
            print("Enter a valid waiter option:");
            userInput = getNumberFromUser();
        }  while (WaiterSubOptions.convertToWaiterOption(userInput) == null);
        return WaiterSubOptions.convertToWaiterOption(userInput);
    }





    @Override
    public WaiterOptions getWaiterOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid waiter option:");
            userInput = getNumberFromUser();
        }  while (WaiterOptions.convertToWaiterOption(userInput) == null);
        return WaiterOptions.convertToWaiterOption(userInput);
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
