public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();
    String getNewCustomerUsernameFromUser();
    String getNewCustomerEMailAdressFromUser();
    String getNewCustomerPasswordFromUser();
    int getAdminOptionFromUser();

    void showErrorWrongLoginCredentials();

    void showAdminOptions();

    void showCustomerOptions();

    void showLoginMessage();
}
