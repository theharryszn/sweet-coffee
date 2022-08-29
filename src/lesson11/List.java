package lesson11;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList();
//
//        names.add("Wisdom");
//        names.add("Eniola");
//        names.add("Ifeoma");
//        names.add("Sixtus");
//        names.add("Vera");
//        names.add("Onome");
//        names.add("Tochukwu");
//
//        for (String name: names) {
//            System.out.println(name);
//        }
        int num = 12;
        Box<Integer, String> box = new Box(12);
        Box<String, String> box1 = new Box("hello");

        Box<LionClass, Integer> box2 = new Box(new LionClass());

    }
}

class LionClass {
    String name = "James";
}

class Box<T, U> {
    private T value;
    private U anotherValue;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
