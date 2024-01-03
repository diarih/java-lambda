package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Diar";
            }
        };

        System.out.println(simpleAction1.action("ihza"));

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String name) -> {
            return "Hello my " + name;
        };

        SimpleAction simpleAction4 = (name) -> "Hello my " + name;

        System.out.println(simpleAction2.action("ihza"));
        System.out.println(simpleAction3.action("putra"));
        System.out.println(simpleAction4.action("Most Simple"));
    }
}
