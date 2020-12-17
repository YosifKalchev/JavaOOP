public class SwitchController {

    private static SwitchController instance;
    private final Controller loginController;
    private final Controller adminController;
    private final Controller customerController;


    private SwitchController (Input input) {
        LoginService loginService = new LoginService();
        loginController = new LoginController(input, loginService);
        adminController = new HairstyleController(input, loginService);
        customerController = new CustomerController(input, loginService);
    }

    public static SwitchController getInstance(Input input) {
        if (instance == null) instance = new SwitchController(input);
        return instance;
    }

    public void startLogin() {
        loginController.startProgram();
    }

    public void startAdmin() {
        adminController.startProgram();
    }

    public void startCustomer() { customerController.startProgram();}
}
