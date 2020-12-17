package dataBase;

public class HairStyler extends dataBase.User {

    private final String specialisation;
    private final int rating;
    public HairStyler(String username, String eMail, String password, String specialisation, int rating) {
        super(username, eMail, password);
        this.specialisation = specialisation;
        this.rating = rating;
    }
}
