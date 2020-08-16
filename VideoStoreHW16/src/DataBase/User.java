package DataBase;

public class User {

    private String username;
    private String eMail;
    private String password;



    public User(String username, String eMail, String password) {
        this.username = username;
        this.eMail = eMail;
        this.password = password;

    }

    public String getUsername() {

        return username;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPassword() {

        return password;
    }
}
