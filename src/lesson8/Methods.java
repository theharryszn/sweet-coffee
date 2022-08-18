package lesson8;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Methods"); // Methods

        sayName("Harry"); // My name is Harry
        System.out.println(square(4)); // 16
        desc("James", 20); // My name is James and my age is 20
        String result = concat("Flo","wer"); // Flower

        System.out.println(result); // Flower

        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();

        checkAge(age);
        checkAge(10); // 8 year(s) later
    }

    public static void sayName(String name) {
        System.out.println("My name is " + name);
    }

    public static int square(int a) {
        return a * a;
    }

    public static int diff(int a, int b) {
        return b - a;
    }

    public static void desc(String name, int age) {
        System.out.println("My name is " + name + " and my aga is " + age);
    }

    public static String concat(String a, String b) {
        return a + b;
    }

    public static void checkAge(int age) {
        if(age >= 18) {
            System.out.println("You're eligible");
        }else {
            System.out.println("Try again in " + (18 - age) + " year(s) time");
        }
    }
}