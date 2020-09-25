package constants;

public enum ChefOption {

    OPTION_1 (1),
    OPTION_2 (2);

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
