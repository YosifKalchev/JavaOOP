import constants.CustomerOption;
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
    public constants.HairstylerOption getHairstylerOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid admin option:");
            userInput = getNumberFromUser();
        }  while (constants.HairstylerOption.convertToAdminOption(userInput) == null);
        return constants.HairstylerOption.convertToAdminOption(userInput);
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
    public void showHairstylerOptions() {
        System.out.println(
                "Press "+ constants.HairstylerOption.LOGOUT.value() + " for logout\n" +
                        "Press "+ constants.HairstylerOption.SHOW_ALL_TAPES.value() + " to show all tapes\n" +
                        "Press "+ constants.HairstylerOption.SHOW_ALL_CUSTOMERS.value() + " to show all customers\n" +
                        "Press "+ constants.HairstylerOption.CREATE_NEW_CUSTOMER.value() + " to create new customer\n");
    }

    @Override
    public void showCustomerOptions() {
        System.out.println(
                "Press "+ CustomerOption.LOGOUT.value() + " for logout\n" +
                        "Press "+ CustomerOption.SHOW_ALL_AVAILABLE_TAPES.value() +
                        " to show all available films\n" +
                        "Press "+ CustomerOption.RETURN_TAPE.value() + " to return film\n" +
                        "Press "+ CustomerOption.TAKE_TAPE.value() + " to take film\n" +
                        "Press "+ CustomerOption.SHOW_ALL_TAPES_TAKEN.value() +
                        " to show all films taken\n");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }


    public String getStringFromUser() {
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
