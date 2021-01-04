import controllers.Console;
import controllers.SwitchController;

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

        /* todo
            create movie option
            add date and time for movie
            create ticket buying option
            create streams for in and out
            !NB room of a current movie projection should be instance and print the seats left -
            if there isn't any print message to the user.

        * */

    }
}
