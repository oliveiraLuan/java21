import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicateNot {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dexter", "Debra", "Angel", "LaGuerta","Vince Masuka", "", "     ");
        List<String> filteredNames = names
                .stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(STR."FilteredNames = \{filteredNames}");
    }
}
