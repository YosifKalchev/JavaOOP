import dataBase.Tape;
import dataBase.TapeRepository;
import dataBase.UserRepository;

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

    }
}
