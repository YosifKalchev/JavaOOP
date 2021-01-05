import controllers.Console;
import controllers.SwitchController;

public class Start {

    public static void main(String[] args) {

        SwitchController.getInstance(new Console()).startLogin();

        /* todo
            check: movie cannot be created in the past time
            check: ticket cannot be bought if the movie is not available
            check: delete movie after the projection time past
            -
            create Streams
            create unit tests




        * */

    }
}
