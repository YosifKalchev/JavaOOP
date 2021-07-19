import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println(increment(2));
        System.out.println(increment(3));
        System.out.println(incrementByOneFunction.apply(2));
        System.out.println(incrementByOneFunction.apply(3));

        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction).apply(3));
        System.out.println(incrementsAndMultiplyFunction.apply(2, 3));
    }

    static int increment(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementsAndMultiplyFunction =
            (number1, number2) -> (5 + number1) * number2;
}
