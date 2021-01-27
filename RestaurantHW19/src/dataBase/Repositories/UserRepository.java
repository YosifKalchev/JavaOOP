package dataBase.Repositories;

import dataBase.Chef;
import dataBase.User;
import dataBase.Waiter;

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
        users.add(new Waiter("waiter", "waiter"));
        users.add(new Chef("chef1", "chef1"));
        users.add(new Chef ("chef2", "chef2"));
    }

    public User getUserByUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return users.get(i);
            }
        }
        return null;
    }



    private void print(String text) {
        System.out.println(text);
    }

    public String getUsername (User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                return user.getUsername();
            }
        }
        return null;
    }
}
