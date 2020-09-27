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
        if (loginService.isUserWaiter()) {
            SuperController.getInstance(input).startWaiter();
        } else {
            SuperController.getInstance(input).startChef();
        }
    }

    private void login() {

        while (!loginService.isUserLogged()) {
            input.showLoginMessage();
            String username = input.getUsernameFromUser();
            String password = input.getPasswordFromUser();
            if (!loginService.requestLogin(username, password)) {
                input.showErrorLoginInput();
            }
        }
    }
}
