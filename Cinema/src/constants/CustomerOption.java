package constants;

public enum CustomerOption {

    LOGOUT(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6);

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
