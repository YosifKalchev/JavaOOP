package Users;

public class User {

    private String name;
    private String eMailAdres;
    private String password;
    private boolean isAdmin = false;

    public User(String name, String eMailAdres, String password) {
        this.name = name;
        this.eMailAdres = eMailAdres;
        this.password = password;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String geteMailAdres() {
        return eMailAdres;
    }

    public String getPassword() {
        return password;
    }
}
