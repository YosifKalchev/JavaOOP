package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames {

    public void sortNames() {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        Comparator<String> comparator = (o1, o2) -> o1.charAt(o1.length() - 1) > o2.charAt(o2.length() - 1) ? 1 : -1;

        Collections.sort(names, comparator);
        System.out.println(names.toString());
    }
}
