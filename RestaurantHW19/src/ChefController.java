import constants.ChefOption;
import dataBase.Repositories.OrderRepository;

public class ChefController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public ChefController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {

        print("You are now logged as an CHEF. Choose an option:\n");
        ChefOption chosenOption = null;
        while (chosenOption != ChefOption.LOGOUT) {
            input.showChefOptions();
            chosenOption = input.getChefOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case SEE_NEW_ORDERS -> seeNewOrdersOptionChosen();
                case CHANGE_ORDER_STATUS -> changeOrderStatusOptionChosen();
            }
        }
    }

    private void changeOrderStatusOptionChosen() {

    }

    private void seeNewOrdersOptionChosen() {
        OrderRepository.getInstance().showAllOrders();
        /// TODO: 27.9.2020 г. check if the order is ACTIVE
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SuperController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}
