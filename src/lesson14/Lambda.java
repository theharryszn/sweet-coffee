package lesson14;

import java.util.ArrayList;
import java.util.function.Consumer;

interface NameFn {
    String run(String fName, String sName);
}

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(5);
        scores.add(6);
        scores.add(8);
        scores.add(10);

        Consumer<Integer> filter = (v) -> {
            if (v >= 10) {
                System.out.println(v);
            }
        };

        scores.forEach(filter);

        NameFn joinNames = ((fName, sName) ->  fName + " " + sName );

        String fullName = joinNames.run("James", "Bond");

        System.out.println(fullName);

        Thread thread = new Thread(() -> System.out.println("Hello"));
        thread.start();

        new Thread(() -> System.out.println("Hello")).start();
    }
}
