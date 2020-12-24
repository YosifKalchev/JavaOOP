package cart;

public enum ItemValues {

    MILK_CHOCOLATE ("milk"),
    DARK_CHOCOLATE ("dark"),
    COUVERTURE_CHOCOLATE ("couverture"),
    COMPOUND_CHOCOLATE ("compoud"),
    WHITE_CHOCOLATE ("white"),
    RUBY_CHOCOLATE ("ruby"),
    FUJI_APPLE ("fuji"),
    HONEYCRISP_APPLE ("honeycrisp"),
    ENVY_APPLE ("envy"),
    GALA_APPLE ("gala"),
    PAZAZZ_APPLE ("pazazz"),
    BRAEBURN_APPLE ("braeburn");

    private String readableName;

    ItemValues(String readableName) {
        this.readableName = readableName;
    }
}
