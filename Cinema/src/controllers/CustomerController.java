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

        print("You are now logged as a CUSTOMER. Choose an option:\n");
        CustomerOption chosenOption = null;
        while (chosenOption != CustomerOption.LOGOUT) {
            input.showCustomerOptions();
            chosenOption = input.getCustomerOptionFromUser();
            switch (chosenOption) {
                case LOGOUT -> logoutOptionChosen();
                case B -> showOptionChosenB();
                case C -> showOptionChosenC();
                case D -> showOptionChosenD();
                case E -> showOptionChosenE();
                case F -> showOptionChosenF();

            }
        }
    }

    private void showOptionChosenF() {
    }

    private void showOptionChosenE() {
    }

    private void showOptionChosenD() {
    }

    private void showOptionChosenC() {

    }

    private void showOptionChosenB() {

    }


    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }



//    private void showAllHairstylesOptionChosen() {
//        HairstyleRepository.getInstance().showAllHairstyles();
//    }
//
//    private void showAllIncorrectHairdressersOptionChosen() {
//        UserRepository.getInstance().showAllIncorrectHairdressers();
//    }
//
//    private void rateHairdresserOptionChosen() {
//        if (chosenHairdresser == null) {
//            print("You haven't chosen a hairdresser.\n");
//        } else {
//            print("Enter a number from 1 to 5 to rate the hairdresser: ");
//            String entry = input.getStringFromUser();
//            try {
//                int chosenOption = Integer.parseInt(entry);
//                if (chosenOption > 5 || chosenOption < 1) {
//                    print("The entered number is not from 1 to 5. Try again.");
//                } else {
//                    Hairstyle hairstyle = new Hairstyle((Customer) CurrentUser.getLoggedUser(), chosenHairdresser,
//                            chosenOption, chosenHairdresser.getHairstylePrice());
//                    HairstyleRepository.getInstance().addHairstyle(hairstyle);
//                    chosenHairdresser = null;
//                }
//            }
//
//            catch(NumberFormatException ex) {
//                rateHairdresserOptionChosen();
//            }
//
//            catch (Exception exception) {
//                System.out.println("Unspecified error (not a NumberFormatException).");
//            }
//        }
//    }
//
//    private void choseHairdresserOptionChosen() {
//
//        print("Enter the name of the hairdresser: ");
//        String hairdresserName = input.getStringFromUser();
//        Hairdresser chosen = (Hairdresser) UserRepository.getInstance().getUserByUsername(hairdresserName);
//        this.chosenHairdresser = chosen;
//
//        if (hairdresserName != null && UserRepository.getInstance().isValid(hairdresserName)) {
//            CurrentUser.getLoggedUser().setHairdresser(chosen);
//            print ("The hairdresser you have chosen is: " + chosen.getUsername() + "\n");
//        } else {
//            print("Invalid hairdresser's name.");
//            choseHairdresserOptionChosen();
//
//        }
//    }
//
//    private void showAllHairdressersOptionChosen() {
//        UserRepository.getInstance().printAllHairdressers();
//    }
}

