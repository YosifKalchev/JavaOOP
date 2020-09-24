import constants.CustomerOption;
import dataBase.*;

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
                case LOGOUT : logoutOptionChosen(); break;
                case SHOW_ALL_AVAILABLE_TAPES: showAllAvailableTapesOptionChosen(); break;
                case RETURN_TAPE: returnTapeOptionChosen(); break;
                case TAKE_TAPE: takeTapeOptionChosen(); break;
                case SHOW_ALL_TAPES_TAKEN: showAllTapesTakenOptionChosen(); break;
            }
        }
    }

    private void takeTapeOptionChosen() {
            print("Enter the name of the tape: ");
            String tapeName = input.getStringFromUser();
            Tape currentTape = TapeRepository.getInstance().getTapeByName(tapeName);
            Tape currentTapeTaken = TapesTakenRepository.getInstance().getTapeByName(tapeName);
            if (TapeRepository.getInstance().isValid(tapeName)
                    || TapesTakenRepository.getInstance().isValid(tapeName)) {
                Tape checkTape = (currentTape != null) ? currentTape : currentTapeTaken;
                if (!checkTape.isTaken()) {
                    TapesTakenRepository.getInstance().addTape(checkTape);
                    TapeRepository.getInstance().removeTape(checkTape);
                } else print("This tape is already taken.\n");
            } else print("Enter a valid tape name.\n");
    }

    private void returnTapeOptionChosen() {
        print("Enter the name of the tape: ");
        String tapeName = input.getStringFromUser();
        Tape currentTape = TapesTakenRepository.getInstance().getTapeByName(tapeName);
        Tape currentTapeReturned = TapeRepository.getInstance().getTapeByName(tapeName);
        if (TapeRepository.getInstance().isValid(tapeName)
                || TapesTakenRepository.getInstance().isValid(tapeName)) {
            Tape checkTape = (currentTape != null) ? currentTape : currentTapeReturned;
            if (checkTape.isTaken()) {
                if (TapesTakenRepository.isReturnOptionValid(checkTape)) {
                    TapesTakenRepository.getInstance().returnTape(currentTape);
                    TapeRepository.getInstance().addTape(currentTape);
                    TapesTakenRepository.getInstance().removeTape(checkTape);
                }
                else print("You haven't take the tape you are trying to return.\n");
            } else print("This tape is already returned.\n");
        } else print("Enter a valid tape name.\n");

    }

    private void showAllAvailableTapesOptionChosen() {
        TapeRepository.getInstance().showAllAvailableTapes();
    }

    private void showAllTapesTakenOptionChosen() {
        TapesTakenRepository.getInstance().showAllTapesTakenByCurrentUser();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}
