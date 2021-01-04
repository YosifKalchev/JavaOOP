package repos;
import users.Admin;
import users.Customer;
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
        users.add(new Admin("admin", "admin@", "admin"));
        users.add(new Customer("user", "user@", "user"));
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

    public String getUsername (User user) {
        for (User value : users) {
            if (value.equals(user)) {
                return user.getUsername();
            }
        }
        return null;
    }


    private void print(String text) {
        System.out.println(text);
    }


}

