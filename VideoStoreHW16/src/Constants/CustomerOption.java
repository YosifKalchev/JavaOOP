package constants;

public enum CustomerOption {

    LOGOUT (1),
    SHOW_ALL_AVAILABLE_TAPES(2),
    RETURN_TAPE(3),
    TAKE_TAPE(4),
    SHOW_ALL_TAPES_TAKEN(5);

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
