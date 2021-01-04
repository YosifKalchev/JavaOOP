package dataBase;

import users.User;

public class CurrentUser{

    private static User loggedUser;

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        CurrentUser.loggedUser = loggedUser;
    }
}

