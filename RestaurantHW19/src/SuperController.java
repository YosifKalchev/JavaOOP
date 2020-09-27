public class SuperController {

    private static SuperController instance;
    private final Controller loginController;
    private final Controller waiterController;
    private final Controller chefController;

    private SuperController(Input input) {
        LoginService loginService = new LoginService();
        loginController = new LoginController(input, loginService);
        waiterController = new WaiterController(input, loginService);
        chefController = new ChefController(input, loginService);
    }

    public static SuperController getInstance(Input input) {
        if (instance == null) {
            instance = new SuperController(input);
        } return instance;
    }

    public void startLogin() { loginController.startProgram(); }
    public void startWaiter() { waiterController.startProgram(); }
    public void startChef() { chefController.startProgram(); }
}
