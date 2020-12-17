package dataBase;

public class User {

    private final String username;
    private final String eMail;
    private final String password;


    public User(String username, String eMail, String password) {
        this.username = username;
        this.eMail = eMail;
        this.password = password;
    }

    public User() {
        this.username = "currentUser";
        this.eMail = "currentEmail";
        this.password = "currentPassword";
    }

    public String getUsername() {
        return username;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPassword() { return password; }
}
