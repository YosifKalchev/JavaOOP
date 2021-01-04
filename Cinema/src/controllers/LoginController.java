package controllers;

public class LoginController implements Controller {

    private final LoginService loginService;
    private final Input input;

    public LoginController(Input input, LoginService loginService) {
        this.input = input;
        this.loginService = loginService;
    }

    @Override
    public void startProgram() {

        login();
        if (loginService.isUserAdmin()) {
            SwitchController.getInstance(input).startAdmin();
        } else {
            SwitchController.getInstance(input).startCustomer();
        }
    }

    private void login() {

        while (!loginService.isUserLogged()) {
            input.showLoginMessage();
            String eMail = input.getEMailFromUser();
            String password = input.getPasswordFromUser();
            if (!loginService.requestLogin(eMail, password)) {
                input.showErrorWrongLoginInput();
            }
        }
    }
}

