package lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("ihza");
        sayHello(null);
    }

    public static void sayHello(String name) {
        // Optional.ofNullable(name)
        // .map(String::toUpperCase)
        // .ifPresentOrElse(
        // value -> System.out.println("HELLO " + value),
        // () -> System.out.println("HELLO")
        // );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalNameUpper = optionalName.map(value ->
        // value.toUpperCase());
        // optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

        // if check null
        // if(name != null){
        // String upperName = name.toUpperCase();
        // System.out.println("HELLO " + upperName);
        // }

    }
}
