package constants;

public enum HairdresserOption {

    LOGOUT (1),
    SHOW_YOUR_RATING(2),
    SET_THE_HAIRSTYLE_PRICE(3);

    private final int value;
    HairdresserOption(int value) {
        this.value = value;
    }


    public int value() {
        return value;
    }

    public static HairdresserOption convertToHairdresserOption(int option) {
        for (HairdresserOption hairdresserOption : values()) {
            if(option == hairdresserOption.value) return hairdresserOption;
        }
        return null;
    }
}

