import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {


        System.out.println(getTextValue());
        System.out.println(getTextValueSupplier.get());
        System.out.println(getTextValuesSupplier.get());
    }

    static String getTextValue() {
        return "text value";
    }

    static Supplier<String> getTextValueSupplier = () -> "text value";

    static Supplier<List<String>> getTextValuesSupplier = () ->
            List.of("text value 1", "text value 2");
}
