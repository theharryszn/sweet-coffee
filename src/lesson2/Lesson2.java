package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String name = "3";
        String a = "A", b = "B", c = "C";
        int x, y, z;
        x = y = z = 50;
        int minutes_per_hour = 60;
        int minutesPerHour = 70;
        int MinutesPerHour = 80;
        System.out.println(a + b + c);

        double PI = 3.142;
        byte age = 126;
        short age2 = 32_767;
        long salary = 100_000_000;

        double myNum = 20.0;

        float myNum2 = (float) myNum;

        double x2 = 20e4;
        System.out.println(x2);
        char j = 42;

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt); // Outputs 9
    }
}
