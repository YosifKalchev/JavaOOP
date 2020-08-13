import Users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        User entry1 = new User("Stancho", "sss@abv.bg", "4321");
        User entry2 = new User("Valio", "vvv@abv.bg", "2233");

        users.add(entry1);
        users.add(entry2);


        for (int i = 0; i < users.toArray().length; i++) {
            System.out.println(users.get(i).getName());
        }

    }

}
