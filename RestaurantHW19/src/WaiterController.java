import constants.WaiterOption;

public class WaiterController implements Controller {
    protected final LoginService loginService;
    private final Input input;

    public WaiterController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }




    private void logoutOptionChosen() {
        loginService.logout();
        SuperController.getInstance(input).startLogin();
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an WAITER. Choose an option:\n");
        WaiterOption chosenOption = null;
        while (chosenOption != WaiterOption.LOGOUT) {
            input.showWaiterOptions();
            chosenOption = input.getWaiterOptionFromUser();
            switch (chosenOption) {
                case LOGOUT: logoutOptionChosen(); break;
                case OPTION_2:
                    System.out.println("option 2"); break;
//                case SHOW_ALL_TAPES: showAllTapesOptionChosen(); break;
//                case SHOW_ALL_CUSTOMERS: showAllCustomersOptionChosen(); break;
//                case CREATE_NEW_CUSTOMER: createCustomerOptionChosen(); break;
            }
        }
    }
}
