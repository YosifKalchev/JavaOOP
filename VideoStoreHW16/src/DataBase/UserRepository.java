package DataBase;

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
        users.add(new Admin("adm", "adm1", "adm"));
        users.add(new Customer("cus", "cus1", "cus"));

    }

    public User getUserByUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return users.get(i);
            }
        }
        return null;
    }

    public User getUserByEMail(String eMail) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEMail().equals(eMail)) {
                return users.get(i);
            }
        }
        return null;
    }


    public void createCustomer(Customer customer) {
        users.add(customer);
    }
}
