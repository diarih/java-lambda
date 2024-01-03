package lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isBlank();

        boolean isBlank = predicate.test("   ");

        System.out.println(isBlank);
    }
}
