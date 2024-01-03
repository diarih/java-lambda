package lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        
        Function<String, Integer> function = value -> value.length();

        Integer length = function.apply("Ihza Diar Putra");

        System.out.println(length);

    }
}
