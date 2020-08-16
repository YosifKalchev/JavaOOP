public class CustomerController {

    private final LoginService loginService;
    private final Input input;

    public CustomerController(Input input) {
        this.input = input;
        this.loginService = new LoginService();
        startProgram();
    }

    private void startProgram() {
        input.showCustomerOptions();
    }

    private void login() {

    }
}
