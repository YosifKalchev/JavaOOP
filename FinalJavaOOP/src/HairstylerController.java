import dataBase.Customer;
import dataBase.finishedHairstyleRepo;
import dataBase.UserRepository;
import dataBase.hairstyleRepository;

public class HairstylerController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public HairstylerController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an Hairstyler. Choose an option:\n");
        constants.HairstylerOption chosenOption = null;
        while (chosenOption != constants.HairstylerOption.LOGOUT) {
            input.showHairstylerOptions();
            chosenOption = input.getHairstylerOptionFromUser();
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
        hairstyleRepository.getInstance().showAllTapes();
        finishedHairstyleRepo.getInstance().showAllTapesTaken();
    }
}
