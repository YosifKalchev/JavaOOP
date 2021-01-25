package repos;
import constants.Specialisations;
import users.Customer;
import users.Hairdresser;
import users.User;

import java.text.DecimalFormat;
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
        users.add(new Hairdresser("John", "John@", "John",
                Specialisations.WET, 1, 4));
        users.add(new Hairdresser("Simon", "Simon@", "Simon",
                Specialisations.CURLS, 2, 7));
        users.add(new Hairdresser("Patrick", "Patrick@", "Patrick",
                Specialisations.MAN, 3, 6.5));
        users.add(new Hairdresser("Joshua", "Joshua@", "Joshua",
                Specialisations.DRY, 4, 9));
        users.add(new Hairdresser("Ivar", "Ivar@", "Ivar",
                Specialisations.MAN, 5, 6));
        users.add(new Customer("client1", "client1@", "client1"));
        users.add(new Customer("client2", "client2@", "client2"));
        users.add(new Customer("client3", "client3@", "client3"));
        users.add(new Customer("client4", "client4@", "client4"));
        users.add(new Customer("client5", "client5@", "client5"));
        users.add(new Customer("client6", "client6@", "client6"));
        users.add(new Customer("client7", "client7@", "client7"));
        users.add(new Customer("client8", "client8@", "client8"));
        users.add(new Customer("client9", "client9@", "client9"));
        users.add(new Customer("client10", "client10@", "client10"));


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

    public void printAllHairdressers() {
        print("The list of all hairdressers: \n");
        for (User user : users) {
            if (user instanceof Hairdresser) {
                System.out.println(
                      "Hairdresser: " + user.getUsername() +
                      ", Specialisation: " + ((Hairdresser) user).getSpecialisation() +
                      ", Rating: " + ((Hairdresser) user).getRating() +
                      ", Price: " + ((Hairdresser) user).getHairstylePrice());
            }
        }
        print("");
        }

    public void showAllIncorrectHairdressers() {
//todo make it with stream!!!
        for (User user : users) {
           if (user instanceof Hairdresser) {
               double rating = HairstyleRepository.getInstance().getHairdresserRealRating((Hairdresser) user);
               String realRating = String.format("%.2f", rating);

               if (((Hairdresser) user).getRating() >
                       HairstyleRepository.getInstance().getHairdresserRealRating((Hairdresser) user)) {
                   print(user.getUsername() + " is a cheater. He declare a rating of: " +
                           ((Hairdresser) user).getRating() + " but his real rating is: " +
                           realRating);
               }
           }
        } print ("");
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

