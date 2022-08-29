package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Lesson12 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList();

        scores.add(3000);
        scores.add(234);
        scores.add(567);

//        System.out.println(scores.get(0)); // 3
////        scores.set(3, 234);
//        scores.remove(1);
//        System.out.println(scores.size());
//        System.out.println(scores);

        ArrayList<String> countries = new ArrayList<String>();

        countries.add("Japan");
        countries.add("Congo");
        countries.add("New Zealand");
        countries.add("South Africa");
        countries.add("Nigeria");
        countries.add("Zimbabwe");
        countries.add("America");
        countries.add("China");

        Collections.sort(scores);

        Collections.sort(countries);

        Collections.swap(countries, 2, 4);

        System.out.println(countries);

        for (int score: scores) {
            System.out.println(score);
        }

        LinkedList<String> names = new LinkedList<String>();

        names.add("Emmanuella");
        names.add("Lisa");
        names.add("Kira");
        names.add("Cinda");
        names.add("Nkechi");
        names.add("Hope");
        names.add("Beyonce");
        names.add("Ariana");
        names.add("Nelson");
        names.add("Zendaya");

        names.addFirst("Anastasia");
        names.addLast("Martins");

        Collections.sort(names);

        System.out.println(names.size());

        HashMap<String, Integer> employees = new HashMap<>();

        employees.put("Wisdom", 200);
        employees.put("Sixtus", 20);
        employees.put("Vera", 10);
        employees.put("Ifeoma", 5);
        employees.put("Eniola", 2);
        employees.put("Emmanuel", 1);

        employees.get("Wisdom");
        employees.remove("Eniola");
        employees.replace("Vera", 100);

        for (String name: employees.keySet()) {
            System.out.println(name);
        }
    }
}
