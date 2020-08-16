import DataBase.Admin;
import DataBase.User;
import DataBase.UserRepository;

public class LoginService {


    private UserRepository userRepository;
    private User loggedUser;


    public LoginService () {
        this.userRepository = UserRepository.getInstance();
    }

    /**
     * Checks if user with such eMail exists and compare its password with the one provided.
     * Logged user is assigned to the variable loggedUser.
     * @param loginEMail provided eMail.
     * @param password password for the provided eMail.
     * @return true if user exists and password matches and false otherwise.
     */

    public boolean requestLogin(String loginEMail, String password) {
        boolean result = false;

        if (isValid(loginEMail) && isValid(password)) {
            User currentUser = userRepository.getUserByEMail(loginEMail);
            if (currentUser != null && currentUser.getPassword().equals(password)) {
                loggedUser = currentUser;
                result = true;
            }
        }
        return result;
    }

    public boolean isUserLogged() {
        return loggedUser != null;
    }

    public boolean isUserAdmin() {
        return isUserLogged() && loggedUser instanceof Admin;
    }

    public void logout() {
        loggedUser = null;
    }

    private boolean isValid (String text) {
        return text != null && !text.isEmpty();
    }
}
