package lesson13;

import java.util.*;

public class Index {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        List<Character> letters = new ArrayList<>();

        Character gender = 'm';
        char favletter = 'j';

        System.out.println(gender.toString());
        names.add("Onome");
        names.add("Ebuka");
        names.add("Wisdom");
        names.add("Eniola");
        names.add("Vera");
        names.add("Ifeoma");

        names.removeIf(val -> val.contains("e"));

        System.out.println(names);
    }
}
