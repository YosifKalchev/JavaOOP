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
        users.add(new Hairdresser("hs1", "hs1@", "hs1",
                Specialisations.WET, 7, 5.5));
        users.add(new Hairdresser("hs2", "hs2@", "hs2",
                Specialisations.CURLS, 0, 5));
        users.add(new Hairdresser("hs3", "hs3@", "hs3",
                Specialisations.CURLS, 4, 6));
        users.add(new Customer("1", "1", "1"));
        users.add(new Customer("cus1", "cus1@", "cus1"));
        users.add(new Customer("cus2", "cus2@", "cus2"));
        //todo fill "users" with 5 Hairdressers and 10 Customers
    }
        //todo create a method to compare the rating earn by customers and the personal rating

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

    public void printAllHairdressers() {
        print("The list of all hairdressers: \n");
        for (User user : users) {
            if (user instanceof Hairdresser) {
                System.out.println(
                      "Hairdresser: " + user.getUsername() +
                      ", Spec: " + ((Hairdresser) user).getSpecialisation() +
                      ", Rating: " + ((Hairdresser) user).getRating() +
                      ", Price: " + ((Hairdresser) user).getHairstylePrice());
            }
        }
        print("");
        }

    public boolean isValid(String hairdresserName) {
        boolean check = false;
        for (User user : users) {
            if (user.getUsername().equals(hairdresserName)) {
                check = true;
                break;
            }
        }
        return check;
    }

    private void print(String text) {
        System.out.println(text);
    }


}

