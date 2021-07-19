import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000032"));
        System.out.println(isPhoneNumberValid("09000000000"));


        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000032"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        System.out.println("Chained predicates");
        System.out.println(isPhoneNumberValidPredicate.and(contains2).and(contains3).test("07000000032"));
        System.out.println(isPhoneNumberValidPredicate.and(contains2).and(contains3).test("07000000033"));
        System.out.println(isPhoneNumberValidPredicate.and(contains2).and(contains3).test("07000000022"));
        System.out.println(isPhoneNumberValidPredicate.and(contains2).and(contains3).test("09000000000"));

    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> contains3 =
            phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> contains2 =
            phoneNumber -> phoneNumber.contains("2");
}
