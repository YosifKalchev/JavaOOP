package constants;

public enum CustomerOption {

    LOGOUT (1),
    SHOW_ALL_AVAILABLE_FILMS(2),
    RETURN_THE_FILM(3),
    TAKE_THE_FILM(4),
    SHOW_ALL_FILMS_TAKEN (5);

    private int value;
    CustomerOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static CustomerOption convertToAdminOption(int option) {
        for (CustomerOption adminOption : values()) {
            if(option == adminOption.value) return adminOption;
        }
        return null;
    }
}
