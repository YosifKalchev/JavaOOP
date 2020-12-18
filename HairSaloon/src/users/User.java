package users;

public class User {

    private final String username;
    private final String eMail;
    private final String password;
    private final Hairdresser hairdresser;


    public User(String username, String eMail, String password) {
        this.username = username;
        this.eMail = eMail;
        this.password = password;
        this.hairdresser = null;
    }


    public String getUsername() {
        return username;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPassword() { return password; }
}

