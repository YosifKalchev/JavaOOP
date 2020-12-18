package users;

import constants.Specialisations;

public class Hairdresser extends User {

    private final Specialisations specialisation;
    private final int rating;

    public Hairdresser(String username, String eMail, String password, Specialisations specialisation, int rating) {
        super(username, eMail, password);
        this.specialisation = specialisation;
        if (rating > 5) {
            this.rating = 5;
        } else this.rating = Math.max(rating, 1);
    }
}

