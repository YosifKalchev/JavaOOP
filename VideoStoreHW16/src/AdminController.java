import constants.AdminOption;
import dataBase.Customer;
import dataBase.TapesTakenRepository;
import dataBase.UserRepository;
import dataBase.TapeRepository;

public class AdminController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public AdminController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an ADMIN. Choose an option:\n");
        AdminOption chosenOption = null;
        while (chosenOption != AdminOption.LOGOUT) {
            input.showAdminOptions();
            chosenOption = input.getAdminOptionFromUser();
            switch (chosenOption) {
                case LOGOUT : logoutOptionChosen(); break;
                case SHOW_ALL_TAPES: showAllTapesOptionChosen(); break;
                case SHOW_ALL_CUSTOMERS: showAllCustomersOptionChosen(); break;
                case CREATE_NEW_CUSTOMER: createCustomerOptionChosen(); break;
            }
        }
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void createCustomerOptionChosen() {
        String newCustomerUsername = input.getNewCustomerUsernameFromUser();
        String newCustomerEMailAddress = input.getNewCustomerEMailAddressFromUser();
        String newCustomerPassword = input.getNewCustomerPasswordFromUser();
        Customer customer = new Customer(newCustomerUsername, newCustomerEMailAddress,newCustomerPassword);
        UserRepository.getInstance().createCustomer(customer);
    }

    private void showAllCustomersOptionChosen() {

        UserRepository.getInstance().showAllCustomers();
    }

    private void showAllTapesOptionChosen() {
        TapeRepository.getInstance().showAllTapes();
        TapesTakenRepository.getInstance().showAllTapesTaken();
    }
}
