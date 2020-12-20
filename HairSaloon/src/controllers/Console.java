package controllers;

import constants.CustomerOption;
import constants.HairdresserOption;

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
    public HairdresserOption getHairdresserOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid hairdresser option:");
            userInput = getNumberFromUser();
        }  while (HairdresserOption.convertToHairdresserOption(userInput) == null);
        return HairdresserOption.convertToHairdresserOption(userInput);
    }

    @Override
    public CustomerOption getCustomerOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid customer option:");
            userInput = getNumberFromUser();
        }  while (CustomerOption.convertToHairdresserOption(userInput) == null);
        return CustomerOption.convertToHairdresserOption(userInput);
    }


    @Override
    public void showErrorWrongLoginInput() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showHairdresserOptions() {
        System.out.println(
                "Press "+ HairdresserOption.LOGOUT.value() + " for logout.\n" +
                "Press "+ HairdresserOption.SHOW_YOUR_RATING.value() + " to show your rating\n");
    }

    @Override
    public void showCustomerOptions() {
        System.out.println(
                "Press "+ CustomerOption.LOGOUT.value() + " for logout\n" +
                "Press "+ CustomerOption.SHOW_ALL_HAIRDRESSERS.value() +
                                                " to show all hairdressers.\n" +
                "Press "+ CustomerOption.CHOOSE_HAIRDRESSER.value() +
                                                " to choose a hairdresser.\n" +
                "Press "+ CustomerOption.RATE_HAIRDRESSER.value() +
                                                " to rate a hairdresser.\n" +
                "Press "+ CustomerOption.SHOW_ALL_INCORRECT_HAIRDRESSERS.value() +
                                                " to show all incorrect hairdressers.\n" +
                "press "+ CustomerOption.SHOW_ALL_HAIRSTYLES.value() +
                                                " to show all hairstyles.\n");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }


    private int getNumberFromUser() {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
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
