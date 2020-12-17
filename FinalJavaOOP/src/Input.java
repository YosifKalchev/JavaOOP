import constants.CustomerOption;

public interface Input {

    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAddressFromUser();
    String getNewCustomerPasswordFromUser();
    String getStringFromUser();

    void showErrorWrongLoginInput();

    void showHairstylerOptions();

    void showCustomerOptions();

    void showLoginMessage();

    constants.HairstylerOption getHairstylerOptionFromUser();

    CustomerOption getCustomerOptionFromUser();
}

