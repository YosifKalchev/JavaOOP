import Constants.AdminOption;
import Constants.CustomerOption;
import DataBase.Customer;
import DataBase.UserRepository;

public class CustomerController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public CustomerController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }



    @Override
    public void startProgram() {
        System.out.print("You are now logged as an CUSTOMER. Choose an option:\n");
        CustomerOption chosenOption = null;
        while (chosenOption != CustomerOption.LOGOUT) {
            input.showCustomerOptions();
            chosenOption = input.getCustomerOptionFromUser();
            switch (chosenOption) {
                case LOGOUT : logoutOptionChosen(); break;
            }
        }
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void login() {

    }
}
