package users;

import constants.Specialisations;

public class Hairdresser extends User {

    private final Specialisations specialisation;
    private final int rating;


    private final double hairstylePrice;

    public Hairdresser(String username, String eMail, String password,
                       Specialisations specialisation, int rating, double hairstylePrice) {
        super(username, eMail, password);
        this.specialisation = specialisation;
        this.hairstylePrice = hairstylePrice;
        if (rating > 5) {
            this.rating = 5;
        } else this.rating = Math.max(rating, 1);
    }

    public Specialisations getSpecialisation() {
        return specialisation;
    }

    public int getRating() {
        return rating;
    }

    public double getHairstylePrice() {
        return hairstylePrice;
    }
}

