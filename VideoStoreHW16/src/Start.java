

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

    }

    //todo add TakenByUser functionality
    //todo modify "return tape" option to return only the tapes, taken by the current user
    //todo catch all exceptions when the customer enters the wrong tape-name

}
