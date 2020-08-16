import DataBase.Customer;
import DataBase.UserRepository;

public class AdminController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public AdminController(Input input) {
        this.input = input;
        this.loginService = new LoginService();
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an ADMIN. Choose an option:\n");
        int chosenOption = -1;
        while (chosenOption != 0) {
            input.showAdminOptions();
            chosenOption = input.getAdminOptionFromUser();
            switch (chosenOption) {
                case 4:
                    createCustomerOptionChosen();
            }
        }
    }

    private void createCustomerOptionChosen() {
        String newCustomerUsername = input.getNewCustomerUsernameFromUser();
        String newCustomerEMailAdress = input.getNewCustomerEMailAdressFromUser();
        String newCustomerPassword = input.getNewCustomerPasswordFromUser();

        Customer customer = new Customer(newCustomerUsername, newCustomerEMailAdress,newCustomerPassword);
        UserRepository.getInstance().createCustomer(customer);
    }

    private void login() {

    }
}
