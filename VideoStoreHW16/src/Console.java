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
    public String getNewCustomerEMailAdressFromUser() {
        print("Enter eMail adress for the new customer: ");
        return getStringFromUser();
    }

    @Override
    public String getNewCustomerPasswordFromUser() {
        print("Enter password for the new customer: ");
        return getStringFromUser();
    }

    @Override
    public int getAdminOptionFromUser() {
        return Integer.parseInt(getStringFromUser());
    }

    @Override
    public void showErrorWrongLoginCredentials() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showAdminOptions() {
        System.out.println(
                "Press 1 for logout\n" +
                "Press 2 to show all films\n" +
                "Press 3 to show all customers\n" +
                "Press 4 to create new customer\n");
    }

    @Override
    public void showCustomerOptions() {
        System.out.println(
                "Press 1 for logout\n" +
                "Press 2 to show all available films\n" +
                "Press 3 to return film\n" +
                "Press 4 to take film\n" +
                "Press 5 to show all films taken by me\n");
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }

    private String getStringFromUser() {
        return scanner.nextLine();
    }
    public void print(String text) {
        System.out.println(text);
    }
}
