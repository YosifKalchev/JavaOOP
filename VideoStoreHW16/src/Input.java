import Constants.AdminOption;

public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAddressFromUser();
    String getNewCustomerPasswordFromUser();


    void showErrorWrongLoginInput();

    void showAdminOptions();

    void showCustomerOptions();

    void showLoginMessage();

    AdminOption getAdminOptionFromUser();
}
