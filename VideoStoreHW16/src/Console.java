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
    public String getPasswordFromUser() {
        print("Enter password: ");
        return scanner.nextLine();
    }

    public void print(String text) {
        System.out.println(text);
    }
}
