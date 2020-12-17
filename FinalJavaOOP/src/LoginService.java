import dataBase.*;

public class LoginService {


    private final dataBase.UserRepository userRepository;
    public static dataBase.User loggedUser;

    public LoginService () {

        this.userRepository = dataBase.UserRepository.getInstance();
    }

    public static void setLoggedUser(dataBase.User loggedUser) {
        LoginService.loggedUser = loggedUser;
        dataBase.CurrentUser.setLoggedUser(loggedUser);
    }

    public dataBase.User getLoggedUser() {
        return loggedUser;
    }

    /**
     * Checks if user with such eMail exists and compare its password with the one provided.
     * Logged user is assigned to the variable loggedUser.
     * @param eMail provided eMail.
     * @param password password for the provided eMail.
     * @return true if user exists and password matches and false otherwise.
     */

    public boolean requestLogin(String eMail, String password) {
        boolean result = false;

        if (isValid(eMail) && isValid(password)) {
            dataBase.User currentUser = userRepository.getUserByEMail(eMail);
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


    public boolean isUserAdmin() {

        return isUserLogged() && getLoggedUser() instanceof HairStyler;
    }

    public void logout() {
        setLoggedUser(null);
    }

    private boolean isValid (String text) {

        return (text != null && !text.isEmpty());
    }
}

