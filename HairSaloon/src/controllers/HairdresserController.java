package controllers;

import constants.HairdresserOption;

public class HairdresserController implements Controller {

    protected final LoginService loginService;
    private final Input input;

    public HairdresserController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {
        System.out.print("You are now logged as an Hairdresser. Choose an option:\n");
        HairdresserOption chosenOption = null;
        while (chosenOption != HairdresserOption.LOGOUT) {
            input.showHairdresserOptions();
            chosenOption = input.getHairdresserOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case SHOW_YOUR_RATING -> showYourRatingOptionChosen();
                case SET_THE_HAIRSTYLE_PRICE -> setTheHairstylePriceOptionChosen();
            }
        }
    }


    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void showYourRatingOptionChosen() {
    }

    private void setTheHairstylePriceOptionChosen() {
    }
}
