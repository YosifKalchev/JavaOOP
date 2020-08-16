import java.util.Scanner;

public class Console implements Input {


    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getUsernameFromUser() {
        print("Enter username: ");
        return scanner.nextLine();
    }

    @Override
    public String getEMailFromUser() {
        print("Enter eMail: ");
        return scanner.nextLine();
    }

    @Override
    public String getPasswordFromUser() {
        print("Enter password: ");
        return scanner.nextLine();
    }

    @Override
    public void showErrorWrongLoginCredentials() {
        System.out.println("Wrong eMail or password.");
    }

    @Override
    public void showAdminOptions() {
        System.out.println("You are now admin");

    }

    @Override
    public void showCustomerOptions() {
        System.out.println("You are a customer");
    }

    public void print(String text) {
        System.out.println(text);
    }
}
