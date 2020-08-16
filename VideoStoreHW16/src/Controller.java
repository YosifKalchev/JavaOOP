public class Controller {

    private final LoginService loginService;
    private final Input input;

    public Controller(Input input) {
        this.input = input;
        this.loginService = new LoginService();
        startProgram();
    }

    private void startProgram() {
        login();
        if (loginService.isUserAdmin()) {
            input.showAdminOptions();
        } else {
            //if the user is a Customer
        }
    }

    private void login() {

        while (loginService.isUserLogged()) {
            String eMail = input.getEMailFromUser();
            String password = input.getPasswordFromUser();
            if (!loginService.requestLogin(eMail, password)) {
                input.showErrorWrongLoginCredentials();
            }

        }
    }
}
