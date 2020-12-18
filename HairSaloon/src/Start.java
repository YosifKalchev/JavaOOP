import controllers.Console;
import controllers.SwitchController;

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

    }
}
