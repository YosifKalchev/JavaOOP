package constants;

public enum WaiterOption {

    LOGOUT(1),
    OPTION_2 (2);

    public int value;

    WaiterOption (int value) {
        this.value = value;
    }

    public static WaiterOption convertToWaiterOption(int option) {
        WaiterOption[] values = values();
        for (int i = 0; i < values.length; i++) {
            WaiterOption waiterOption = values[i];
            if (option == waiterOption.value) {
                return waiterOption;
            };
        }
        return null;
    }
}
