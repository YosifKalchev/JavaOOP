import constants.ChefOption;
import constants.WaiterOptions;
import constants.WaiterSubOptions;

public interface Input {

    String getUsernameFromUser();
    String getPasswordFromUser();
    String getStringFromUser();
    int getNumberFromUser();

    void showErrorLoginInput();
    void showWaiterOptions();
    void showWaiterOptionsForTheMenu();
    void showChefOptions();
    void showLoginMessage();


    WaiterSubOptions getWaiterSubOptionFromUSer();
    WaiterOptions getWaiterOptionFromUser();
    ChefOption getChefOptionFromUser();
}
