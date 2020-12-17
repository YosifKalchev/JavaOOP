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
        dataBase.Tape currentTape = hairstyleRepository.getInstance().getTapeByName(tapeName);
        dataBase.Tape currentTapeTaken = finishedHairstyleRepo.getInstance().getTapeByName(tapeName);
        if (hairstyleRepository.getInstance().isValid(tapeName)
                || finishedHairstyleRepo.getInstance().isValid(tapeName)) {
            dataBase.Tape checkTape = (currentTape != null) ? currentTape : currentTapeTaken;
            if (!checkTape.isTaken()) {
                finishedHairstyleRepo.getInstance().addTape(checkTape);
                hairstyleRepository.getInstance().removeTape(checkTape);
            } else print("This tape is already taken.\n");
        } else print("Enter a valid tape name.\n");
    }

    private void returnTapeOptionChosen() {
        print("Enter the name of the tape: ");
        String tapeName = input.getStringFromUser();
        dataBase.Tape currentTape = finishedHairstyleRepo.getInstance().getTapeByName(tapeName);
        dataBase.Tape currentTapeReturned = hairstyleRepository.getInstance().getTapeByName(tapeName);
        if (hairstyleRepository.getInstance().isValid(tapeName)
                || finishedHairstyleRepo.getInstance().isValid(tapeName)) {
            dataBase.Tape checkTape = (currentTape != null) ? currentTape : currentTapeReturned;
            if (checkTape.isTaken()) {
                if (finishedHairstyleRepo.isReturnOptionValid(checkTape)) {
                    finishedHairstyleRepo.getInstance().returnTape(currentTape);
                    hairstyleRepository.getInstance().addTape(currentTape);
                    finishedHairstyleRepo.getInstance().removeTape(checkTape);
                }
                else print("You haven't take the tape you are trying to return.\n");
            } else print("This tape is already returned.\n");
        } else print("Enter a valid tape name.\n");

    }

    private void showAllAvailableTapesOptionChosen() {
        hairstyleRepository.getInstance().showAllAvailableTapes();
    }

    private void showAllTapesTakenOptionChosen() {
        finishedHairstyleRepo.getInstance().showAllTapesTakenByCurrentUser();
    }

    private void logoutOptionChosen() {
        loginService.logout();
        SwitchController.getInstance(input).startLogin();
    }

    private void print(String text) {
        System.out.println(text);
    }
}

