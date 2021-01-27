import constants.WaiterOptions;
import constants.WaiterSubOptions;

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

        startAdminMenu();


            }

    public void startAdminMenu() {
        WaiterOptions chosenOption = null;
        while (chosenOption != WaiterOptions.LOGOUT) {
            input.showWaiterOptions();
            chosenOption = input.getWaiterOptionFromUser();

            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case CREATE_ORDER -> createOrderOptionChosen();
                case CHANGE_ORDER_STATUS -> changeOrderStatusOptionChosen();
                case SEE_ALL_ACTIVE_ORDERS -> seeAllActiveOrdersOptionChosen();
                case SEE_ORDER_HISTORY -> seeOrderHistoryOptionChosen();
                case SEE_THE_MENU -> seeTheMenuOptionChosen();
                case CHANGE_THE_MENU -> changeTheMenuOptionChosen();
            }
}
    }


    private void changeTheMenuOptionChosen() {
        WaiterSubOptions chosenOption = null;
        while (chosenOption != WaiterSubOptions.BACK_TO_MAIN_WAITER_MENU) {
            input.showWaiterOptionsForTheMenu();
            chosenOption = input.getWaiterSubOptionFromUSer();
            switch (chosenOption) {
                case ADD_CONSUMABLE-> addConsumableOptionChosen();
                case REMOVE_CONSUMABLE -> removeConsumableOptionChosen();
                case BACK_TO_MAIN_WAITER_MENU -> startAdminMenu();
            }
        }
    }


    private void removeConsumableOptionChosen() {
        System.out.println("Consumable removed.");
    }

    private void addConsumableOptionChosen() {
        System.out.println("Consumable added.");
    }

    private void seeTheMenuOptionChosen() {
    }

    private void seeOrderHistoryOptionChosen() {
    }

    private void seeAllActiveOrdersOptionChosen() {

    }

    private void changeOrderStatusOptionChosen() {
    }

    private void createOrderOptionChosen() {
    }

}
