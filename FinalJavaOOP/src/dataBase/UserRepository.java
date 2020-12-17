package dataBase;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private final List<dataBase.User> users;


    private UserRepository() {
        users = new ArrayList<>();
        users.add(new HairStyler("admin", "admin@", "admin", "WET", 4));
        users.add(new dataBase.Customer("cus", "cus@", "cus"));
        users.add(new dataBase.Customer("cus2", "cus2@", "cus2"));
    }

    public dataBase.User getUserByUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return users.get(i);
            }
        }
        return null;
    }

    public dataBase.User getUserByEMail(String eMail) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEMail().equals(eMail)) {
                return users.get(i);
            }
        }
        return null;
    }

    public void showAllCustomers() {
        print("All customers:\n");
        for (int i = 1; i < users.size(); i++) {
            print("Customer"+i+": " + users.get(i).getUsername() + " "
                    + ";  eMail: " + users.get(i).getEMail());
        }
        print("");
    }


    public void createCustomer(dataBase.Customer customer) {
        users.add(customer);
    }

    private void print(String text) {
        System.out.println(text);
    }

    public String getUsername (dataBase.User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                return user.getUsername();
            }
        }
        return null;
    }
}

