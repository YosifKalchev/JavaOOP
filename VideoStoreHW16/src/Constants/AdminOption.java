package constants;

public enum AdminOption {

    LOGOUT (1),
    SHOW_ALL_FILMS(2),
    SHOW_ALL_CUSTOMERS(3),
    CREATE_NEW_CUSTOMER(4);

    private int value;
    AdminOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static AdminOption convertToAdminOption(int option) {
        for (AdminOption adminOption : values()) {
            if(option == adminOption.value) return adminOption;
        }
        return null;
    }
}
