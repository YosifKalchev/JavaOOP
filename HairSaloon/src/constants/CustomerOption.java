package constants;

public enum CustomerOption {

    LOGOUT (1),
    SHOW_ALL_HAIRDRESSERS(2),
    CHOOSE_HAIRDRESSER(3),
    RATE_HAIRDRESSER(4);

    private final int value;
    CustomerOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static CustomerOption convertToHairdresserOption(int option) {
        for (CustomerOption hairdresserOption : values()) {
            if(option == hairdresserOption.value) return hairdresserOption;
        }
        return null;
    }
}
