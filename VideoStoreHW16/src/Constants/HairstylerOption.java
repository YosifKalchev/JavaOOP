package constants;

public enum HairstylerOption {

    LOGOUT (1),
    SHOW_ALL_TAPES(2),
    SHOW_ALL_CUSTOMERS(3),
    CREATE_NEW_CUSTOMER(4);

    private final int value;
    HairstylerOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static HairstylerOption convertToAdminOption(int option) {
        for (HairstylerOption hairstylerOption : values()) {
            if(option == hairstylerOption.value) return hairstylerOption;
        }
        return null;
    }
}
