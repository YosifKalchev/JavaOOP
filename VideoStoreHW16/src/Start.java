import dataBase.Tape;
import dataBase.TapeRepository;
import dataBase.UserRepository;

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

    }


    //todo modify "return tape" option to return only the tapes, taken by the current user
    //todo catch all exceptions when the customer enters the wrong tape-name
    //todo multiple returning !!! no return option

}
