package constants;

public enum CustomerOption {

    LOGOUT(1),
    SEE_ALL_MOVIES(2),
    BUY_TICKETS(3);

    private final int value;
    CustomerOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static CustomerOption convertToAdminOption(int option) {
        for (CustomerOption hairdresserOption : values()) {
            if(option == hairdresserOption.value) return hairdresserOption;
        }
        return null;
    }
}
