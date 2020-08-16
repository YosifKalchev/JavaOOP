public class SwitchController {

    private static SwitchController instance;

    public static SwitchController getInstance(Input input) {
        if (instance ==null) instance = new SwitchController(input);

        return instance;
    }

    private final Controller loginController;
    private final Controller adminController;

    private SwitchController (Input input) {
        loginController = new LoginController(input);
        adminController = new AdminController(input);
    }

    public void startLogin() {
        loginController.startProgram();
    }

    public void startAdmin() {
        adminController.startProgram();
    }
}
