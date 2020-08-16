public class LoginController {

    private final LoginService loginService;
    private final Input input;

    public LoginController(Input input) {
        this.input = input;
        this.loginService = new LoginService();
        startProgram();
    }

    private void startProgram() {

        login();
        if (loginService.isUserAdmin()) {
            input.showAdminOptions();
        } else {
            input.showCustomerOptions();
        }
    }

    private void login() {

//        while (!loginService.isUserLogged()) {
//            String username = input.getUsernameFromUser();
//            String password = input.getPasswordFromUser();
//            if (!loginService.requestLogin(username, password)) {
//                input.showErrorWrongLoginCredentials();
//            }
//
//        }
        while (!loginService.isUserLogged()) {
            String eMail = input.getEMailFromUser();
            String password = input.getPasswordFromUser();
            if (!loginService.requestLogin(eMail, password)) {
                input.showErrorWrongLoginCredentials();
            }

        }
    }
}
