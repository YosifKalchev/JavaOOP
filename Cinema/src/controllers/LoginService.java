package controllers;

import repos.UserRepository;
import users.Admin;
import users.User;

public class LoginService {


    private final UserRepository userRepository;
    public static User loggedUser;

    public LoginService () {

        this.userRepository = UserRepository.getInstance();
    }

    public static void setLoggedUser(User loggedUser) {
        LoginService.loggedUser = loggedUser;
        dataBase.CurrentUser.setLoggedUser(loggedUser);
    }

    public User getLoggedUser() {
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
            User currentUser = userRepository.getUserByEMail(eMail);
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

        return isUserLogged() && getLoggedUser() instanceof Admin;
    }

    public void logout() {
        setLoggedUser(null);
    }

    private boolean isValid (String text) {

        return (text != null && !text.isEmpty());
    }
}

