import Constants.AdminOption;
import Constants.CustomerOption;

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
    public String getNewCustomerUsernameFromUser() {
        print("Enter username for the new customer: ");
        return getStringFromUser();
    }

    @Override
    public String getNewCustomerEMailAddressFromUser() {
        print("Enter eMail address for the new customer: ");
        return getStringFromUser();
    }

    @Override
    public String getNewCustomerPasswordFromUser() {
        print("Enter password for the new customer: ");
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
    public void showErrorWrongLoginInput() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showAdminOptions() {
        System.out.println(
                "Press "+ AdminOption.LOGOUT.value() + " for logout\n" +
                "Press "+ AdminOption.SHOW_ALL_FILMS.value() + " to show all films\n" +
                "Press "+ AdminOption.SHOW_ALL_CUSTOMERS.value() + " to show all customers\n" +
                "Press "+ AdminOption.CREATE_NEW_CUSTOMER.value() + " to create new customer\n");
    }

    @Override
    public void showCustomerOptions() {
        System.out.println(
                "Press "+ CustomerOption.LOGOUT.value() + " for logout\n" +
                "Press "+ CustomerOption.SHOW_ALL_AVAILABLE_FILMS.value() + " to show all available films\n" +
                "Press "+ CustomerOption.RETURN_THE_FILM.value() + " to return film\n" +
                "Press "+ CustomerOption.TAKE_THE_FILM.value() + " to take film\n" +
                "Press "+ CustomerOption.SHOW_ALL_FILMS_TAKEN.value() + " to show all films taken\n");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }

    private String getStringFromUser() {
        return scanner.nextLine();
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
    public void print(String text) {
        System.out.println(text);
    }
}
