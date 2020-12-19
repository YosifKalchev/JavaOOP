package controllers;

import constants.CustomerOption;
import dataBase.CurrentUser;
import repos.UserRepository;
import users.Hairdresser;
import users.User;

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
                case CHOOSE_HAIRDRESSER -> choseHairdresserOptionChosen();
                case RATE_HAIRDRESSER -> rateHairdresserOptionChosen();
                //todo case SHOW_ALL_INCORRECT_HAIRDRESSERS ->
                // their personal rating is lower than rating earned by customers
            }
        }
    }



    private void rateHairdresserOptionChosen() {
        //todo create this method
    }

    private void choseHairdresserOptionChosen() {
        print("Enter the name of the hairdresser: ");
        User loggedUser = CurrentUser.getLoggedUser();
        String hairdresserName = input.getStringFromUser();
        Hairdresser chosen = (Hairdresser) UserRepository.getInstance().getUserByUsername(hairdresserName);
        if (hairdresserName != null && UserRepository.getInstance().isValid(hairdresserName)) {
            loggedUser.setHairdresser(chosen);
            //todo create new hairstyle with this Customer and Hairdresser.
            //todo add it to HairstyleRepository
        } else {
            print("Invalid hairdresser's name. Enter a valid name:");
        }
    }

    private void showAllHairStylersOptionChosen() {
        UserRepository.getInstance().printAllHairdressers();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}

