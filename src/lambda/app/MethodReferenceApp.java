package lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import lambda.util.StringUtil;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Predicate<String> predicateIsLowerCase = value ->
        // StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // Static Method Ref

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));

        // Method Reference di Parameter

        // Function<String, String> functionUpper = (String value) ->
        // value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Eko"));

        MethodReferenceApp app = new MethodReferenceApp();

        app.run();
        app.run2();

    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase; // Non Static Method Ref

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase; // Object Method Ref

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
