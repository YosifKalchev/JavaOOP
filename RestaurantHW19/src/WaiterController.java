import constants.WaiterOption;
import dataBase.Repositories.OrderRepository;

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
        WaiterOption chosenOption = null;
        while (chosenOption != WaiterOption.LOGOUT) {
            input.showWaiterOptions();
            chosenOption = input.getWaiterOptionFromUser();
            switch (chosenOption) {
                case LOGOUT:
                    System.out.println("Option 1");logoutOptionChosen(); break;
                case CREATE_ORDER:
                    System.out.println("Option 2");createOrderOptionChosen(); break;
                case CHANGE_ORDER_STATUS:
                    System.out.println("Option 3");changeOrderStatusOptionChosen(); break;
                case SEE_ALL_ACTIVE_ORDERS: seeAllActiveOrdersOptionChosen(); break;
                case SEE_ORDER_HISTORY: seeOrderHistoryOptionChosen(); break;
                case SEE_THE_MENU: seeTheMenuOptionChosen(); break;
                case CHANGE_THE_MENU: changeTheMenuOptionChosen(); break;
    }
}
    }

    private void changeTheMenuOptionChosen() {
        WaiterOption chosenOption = null;
        while (chosenOption != WaiterOption.BACK_TO_MAIN_WAITER_MENU) {
            input.showWaiterOptionsForTheMenu();
            chosenOption = input.getWaiterOptionFromUser();
            switch (chosenOption) {
                case ADD_CONSUMABLE: addConsumableOptionChosen(); break;
                case REMOVE_CONSUMABLE: ;removeConsumableOptionChosen(); break;
                case BACK_TO_MAIN_WAITER_MENU: startProgram(); break;
            }
        }
    }


    private void removeConsumableOptionChosen() {

    }

    private void addConsumableOptionChosen() {

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
