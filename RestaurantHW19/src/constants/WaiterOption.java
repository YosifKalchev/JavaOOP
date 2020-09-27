package constants;

public enum WaiterOption {

    LOGOUT(1),
    CREATE_ORDER (2),
    CHANGE_ORDER_STATUS(3),
    SEE_ALL_ACTIVE_ORDERS (4),
    SEE_ORDER_HISTORY (5),
    SEE_THE_MENU (6),
    CHANGE_THE_MENU (7),
    ADD_CONSUMABLE (1),
    REMOVE_CONSUMABLE (2);

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
