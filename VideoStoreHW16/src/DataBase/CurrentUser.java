package dataBase;

public class CurrentUser{

    private static User loggedUser = new User();

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
       CurrentUser.loggedUser = loggedUser;
    }
}
