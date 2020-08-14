package DataBase;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private List<User> users;

    private UserRepository() {
        users = new ArrayList<>();
    }

    public User getUserByUsername(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return users.get(i);
            }
        }
        return null;
    }


}
