import constants.ChefOption;
import constants.WaiterOption;
import dataBase.Order;

public class Start {
    public static void main(String[] args) {

        SuperController.getInstance(new Console()).startLogin();
    }
}
