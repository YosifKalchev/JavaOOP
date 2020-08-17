import Constants.AdminOption;

public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAdressFromUser();
    String getNewCustomerPasswordFromUser();


    void showErrorWrongLoginCredentials();

    void showAdminOptions();

    void showCustomerOptions();

    void showLoginMessage();

    AdminOption getAdminOptionFromUser();
}
