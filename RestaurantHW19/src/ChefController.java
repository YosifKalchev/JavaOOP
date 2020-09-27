import constants.ChefOption;

import java.util.function.Supplier;

public class ChefController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public ChefController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {

        print("You are now logged as an CUSTOMER. Choose an option:\n");
        ChefOption chosenOption = null;
        while (chosenOption != ChefOption.LOGOUT) {
            input.showChefOptions();
            chosenOption = input.getChefOptionFromUser();
            switch (chosenOption) {
                case LOGOUT : logoutOptionChosen(); break;
                case OPTION_2: print("option2"); break;
            }
        }
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SuperController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}
