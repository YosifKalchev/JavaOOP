package constants;

public enum ChefOption {

    LOGOUT(1),
    SEE_NEW_ORDERS (2),
    CHANGE_ORDER_STATUS (3);


    public int value;

    ChefOption(int value) {
        this.value = value;
    }

    public static ChefOption convertToChefOption(int option) {
        ChefOption[] values = values();
        for (int i = 0; i < values.length; i++) {
            ChefOption chefOption = values[i];
            if (option == chefOption.value) {
                return chefOption;
            };
        }
        return null;
    }
}
