import constants.AdminOption;
import constants.CustomerOption;

public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAddressFromUser();
    String getNewCustomerPasswordFromUser();
    String getStringFromUser();


    void showErrorWrongLoginInput();

    void showAdminOptions();

    void showCustomerOptions();

    void showLoginMessage();

    AdminOption getAdminOptionFromUser();

    CustomerOption getCustomerOptionFromUser();
}
