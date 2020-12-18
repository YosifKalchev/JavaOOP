package repos;
import constants.Specialisations;
import users.Customer;
import users.Hairdresser;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private final List<User> users;


    private UserRepository() {
        users = new ArrayList<>();
        users.add(new Hairdresser("hs1", "hs1@", "hs1", Specialisations.WET, 7));
        users.add(new Hairdresser("hs2", "hs2@", "hs2", Specialisations.WET, 0));
        users.add(new Hairdresser("hs3", "hs3@", "hs3", Specialisations.DRY, 4));
        users.add(new Customer("cus1", "cus1@", "cus1"));
        users.add(new Customer("cus2", "cus2@", "cus2"));
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByEMail(String eMail) {
        for (User user : users) {
            if (user.getEMail().equals(eMail)) {
                return user;
            }
        }
        return null;
    }



    private void print(String text) {
        System.out.println(text);
    }

    public String getUsername (User user) {
        for (User value : users) {
            if (value.equals(user)) {
                return user.getUsername();
            }
        }
        return null;
    }
}

