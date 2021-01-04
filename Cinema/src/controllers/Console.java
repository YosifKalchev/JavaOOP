package controllers;

import constants.CustomerOption;
import constants.AdminOption;

import java.util.Scanner;

public class Console implements Input {


    private final Scanner scanner;

    public Console() {

        this.scanner = new Scanner(System.in);
    }


    @Override
    public String getEMailFromUser() {
        print("Enter eMail: ");
        return getStringFromUser();
    }

    @Override
    public String getPasswordFromUser() {
        print("Enter password: ");
        return getStringFromUser();
    }


    @Override
    public AdminOption getAdminOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid admin option:");
            userInput = getNumberFromUser();
        }  while (AdminOption.convertToAdminOption(userInput) == null);
        return AdminOption.convertToAdminOption(userInput);
    }

    @Override
    public CustomerOption getCustomerOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid customer option:");
            userInput = getNumberFromUser();
        }  while (CustomerOption.convertToAdminOption(userInput) == null);
        return CustomerOption.convertToAdminOption(userInput);
    }


    @Override
    public void showErrorWrongLoginInput() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showAdminOptions() {
        System.out.println(
                "Press "+ AdminOption.LOGOUT.value() + " for logout.\n" +
                "Press "+ AdminOption.SHOW_ALL_MOVIE_ROOMS.value() + " to show all movie rooms.\n" +
                "Press "+ AdminOption.CREATE_MOVIE_ROOM.value() + " to create a movie room.\n" +
                "Press "+ AdminOption.SHOW_ALL_ACTIVE_MOVIES.value() + " to show all active movies.\n" +
                "Press "+ AdminOption.CREATE_MOVIE.value() + " to create a movie.\n");
    }

    @Override
    public void showCustomerOptions() {
        System.out.println(
                "Press "+ CustomerOption.LOGOUT.value() + " for logout\n" +
                "Press "+ CustomerOption.B.value() +
                                                " B.\n" +
                "Press "+ CustomerOption.C.value() +
                                                " C.\n" +
                "Press "+ CustomerOption.D.value() +
                                                " D.\n" +
                "Press "+ CustomerOption.E.value() +
                                                " E.\n" +
                "press "+ CustomerOption.F.value() +
                                                " F.\n");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.\n" +
                "If you are a customer, use the base account\n" +
                "eMail: user@, password: user");
    }

    @Override
    public int getNumberFromUser() {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 1) {
                print("Enter a positive number.");
                return getNumberFromUser();
            }
        } catch (NumberFormatException e) {
            print("The digit you have entered is not a number. Try again.");
            return getNumberFromUser();
        }
        return number;
    }

    public String getStringFromUser() {
        return scanner.nextLine();
    }

    public void print(String text) {
        System.out.println(text);
    }
}
