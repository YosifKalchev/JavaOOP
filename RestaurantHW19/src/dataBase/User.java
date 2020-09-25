package dataBase;

public class User {

    private final String username;
    private final String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        this.username = "currentUser";
        this.password = "currentPassword";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() { return password; }
}
