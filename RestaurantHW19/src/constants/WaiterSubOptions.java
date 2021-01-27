package constants;

 public enum WaiterSubOptions {


    ADD_CONSUMABLE (1),
    REMOVE_CONSUMABLE (2),
    BACK_TO_MAIN_WAITER_MENU (3);

    public int value;

    WaiterSubOptions(int value) {
        this.value = value;
    }

    public static WaiterSubOptions convertToWaiterOption(int option) {
        WaiterSubOptions[] values = values();
        for (WaiterSubOptions waiterOption : values) {
            if (option == waiterOption.value) {
                return waiterOption;
            }
        }
        return null;
    }
}
