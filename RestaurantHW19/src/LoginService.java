import dataBase.CurrentUser;
import dataBase.User;
import dataBase.UserRepository;
import dataBase.Waiter;

public class LoginService {

    private final UserRepository userRepository;
    public static User loggedUser;

    public LoginService () {

        this.userRepository = UserRepository.getInstance();
    }

    public static void setLoggedUser(User loggedUser) {
        LoginService.loggedUser = loggedUser;
        CurrentUser.setLoggedUser(loggedUser);
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    /**
     * Checks if user with such username exists and compare its password with the one provided.
     * Logged username is assigned to the variable loggedUser.
     * @param password password for the provided eMail.
     * @return true if user exists and password matches and false otherwise.
     */

    public boolean requestLogin(String username, String password) {
        boolean result = false;

        if (isValid(username) && isValid(password)) {
            User currentUser = userRepository.getUserByUsername(username);
            if (currentUser != null && currentUser.getPassword().equals(password)) {
                setLoggedUser(currentUser);
                result = true;
            }
        }
        return result;
    }

    public boolean isUserLogged() {
        return getLoggedUser() != null;
    }


    public boolean isUserWaiter() {

        return isUserLogged() && getLoggedUser() instanceof Waiter;
    }

    public void logout() {
        setLoggedUser(null);
    }

    private boolean isValid (String text) {

        return (text != null && !text.isEmpty());
    }
}
