package dataBase;

public class CurrentUser{

    private static dataBase.User loggedUser = new dataBase.User();

    public static dataBase.User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(dataBase.User loggedUser) {
        CurrentUser.loggedUser = loggedUser;
    }
}
