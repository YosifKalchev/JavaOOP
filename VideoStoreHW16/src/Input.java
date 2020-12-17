import constants.HairstylerOption;
import constants.CustomerOption;

public interface Input {

    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAddressFromUser();
    String getNewCustomerPasswordFromUser();
    String getStringFromUser();

    void showErrorWrongLoginInput();

    void showHairStylerOption();

    void showCustomerOptions();

    void showLoginMessage();

    HairstylerOption getHairstylerOptionFromUser();

    CustomerOption getCustomerOptionFromUser();
}
