public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();


    void showErrorWrongLoginCredentials();

    void showAdminOptions();
}
