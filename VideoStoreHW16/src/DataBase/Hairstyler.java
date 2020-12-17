package dataBase;

public class Hairstyler extends User {

    private final int rating;
    private final String specialisation;
    public Hairstyler(String username, String eMail, String password, int rating, String specialisation) {
        super(username, eMail, password);
        this.rating = rating;
        this.specialisation = specialisation;
    }
}
