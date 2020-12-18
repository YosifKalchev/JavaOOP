package controllers;

import constants.CustomerOption;

public class CustomerController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public CustomerController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {

        print("You are now logged as an CUSTOMER. Choose an option:\n");
        CustomerOption chosenOption = null;
        while (chosenOption != CustomerOption.LOGOUT) {
            input.showCustomerOptions();
            chosenOption = input.getCustomerOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case SHOW_ALL_HAIRDRESSERS -> showAllHairStylersOptionChosen();
            }
        }
    }

    private void showAllHairStylersOptionChosen() {
    }

//    private void showAllHairStylersOptionChosen() {
//        for (ss)
//    }




    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}

