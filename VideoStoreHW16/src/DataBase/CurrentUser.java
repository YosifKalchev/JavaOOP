package dataBase;

public class CurrentUser{

    public static User loggedUser = new User();

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
       CurrentUser.loggedUser = loggedUser;
    }
}
