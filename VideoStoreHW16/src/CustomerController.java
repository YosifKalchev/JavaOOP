import constants.CustomerOption;
import videoStore.Tape;
import videoStore.TapeRepository;

public class CustomerController implements Controller {

    protected final LoginService loginService;
    private final Input input;

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
        TapeRepository.getInstance().takeTape(TapeRepository.getInstance().getTapeByName(tapeName));
    }

    private void returnTapeOptionChosen() {
    }

    private void showAllAvailableTapesOptionChosen() {
        TapeRepository.getTapesTaken().showAllAvailableTapes();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }


}
