package lesson8;

public class Overloading {
    static int blah = 0;

    public static void main(String[] args) {
        add(5.3f, 6.4f); // 11
        count("James"); // 5
    }

    public static int add(int a, int b) {
        int blah= 0;
        System.out.println(blah);
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b+ c;
    }

    public static int count(String name) {
        return name.toCharArray().length;
    }
}
