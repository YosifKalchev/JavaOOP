package constants;

public enum WaiterOptions {

    LOGOUT(1),
    CREATE_ORDER (2),
    CHANGE_ORDER_STATUS(3),
    SEE_ALL_ACTIVE_ORDERS (4),
    SEE_ORDER_HISTORY (5),
    SEE_THE_MENU (6),
    CHANGE_THE_MENU (7),
    ADD_CONSUMABLE (11),
    REMOVE_CONSUMABLE (12),
    BACK_TO_MAIN_WAITER_MENU (13);

    public int value;

    WaiterOptions(int value) {
        this.value = value;
    }

    public static WaiterOptions convertToWaiterOption(int option) {
        WaiterOptions[] values = values();
        for (WaiterOptions waiterOption : values) {
            if (option == waiterOption.value) {
                return waiterOption;
            }
        }
        return null;
    }
}
