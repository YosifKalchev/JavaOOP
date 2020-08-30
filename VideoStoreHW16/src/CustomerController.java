import constants.CustomerOption;
import dataBase.TapeRepository;
import dataBase.TapesTakenRepository;
import dataBase.User;

public class CustomerController implements Controller {

    protected final LoginService loginService;
    private final Input input;
    User loggedUser;

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
                case SHOW_ALL_AVAILABLE_TAPES: showAllAvailableTapesOptionChosen(); break;
                case RETURN_TAPE: returnTapeOptionChosen(); break;
                case TAKE_TAPE: takeTapeOptionChosen(); break;
                case SHOW_ALL_TAPES_TAKEN: showAllTapesTakenOptionChosen(); break;
            }
        }
    }

    private void showAllTapesTakenOptionChosen() {
    }

    private void takeTapeOptionChosen() {
        String tapeName = input.getStringFromUser();
        TapesTakenRepository.setTapeTakerUser(loginService.getLoggedUser());
        TapeRepository.getInstance().getTapeByName(tapeName).setTapeTaker(loginService.getLoggedUser());
        TapesTakenRepository.getInstance().addToTakenTapes(TapeRepository.getInstance().getTapeByName(tapeName));
        TapeRepository.getInstance().takeTape(TapeRepository.getInstance().getTapeByName(tapeName));

    }

    private void returnTapeOptionChosen() {
        String tapeName = input.getStringFromUser();
        TapeRepository.getInstance().returnTape(TapesTakenRepository.getInstance().getTapeByName(tapeName));
        TapesTakenRepository.getInstance().returnTape(TapesTakenRepository.getInstance().getTapeByName(tapeName));
    }

    private void showAllAvailableTapesOptionChosen() {
        TapeRepository.getInstance().showAllAvailableTapes();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    public User getLoggedUser() {
        return loggedUser;
    }
}
