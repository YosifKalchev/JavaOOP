import constants.ChefOption;
import constants.WaiterOption;

public interface Input {

    String getUsernameFromUser();
    String getPasswordFromUser();
    String getStringFromUser();
    int getIntFromUser();
    int getNumberFromUser();

    void showErrorLoginInput();
    void showWaiterOptions();
    void showChefOptions();
    void showLoginMessage();


    WaiterOption getWaiterOptionFromUser();
    ChefOption getChefOptionFromUser();
}
