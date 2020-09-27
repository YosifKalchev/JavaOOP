import constants.ChefOption;
import constants.WaiterOption;

public class Start {
    public static void main(String[] args) {
        SuperController.getInstance(new Console()).startLogin();
    }
}
