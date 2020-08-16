public interface Input {



    String getUsernameFromUser();
    String getEMailFromUser();
    String getPasswordFromUser();

    static void showErrorWrongLoginCredentials() {
    }
}
