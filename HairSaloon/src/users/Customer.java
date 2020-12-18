package users;

public class Customer extends User {

    private static Hairdresser hairdresser;
    private Hairdresser chosenHairdresser;
    public Customer(String username, String eMail, String password) {
        super(username, eMail, password);
        this.chosenHairdresser = null;
    }

    public void setChosenHairstyler(Hairdresser chosenHairdresser) {
        this.chosenHairdresser = chosenHairdresser;
    }
}
