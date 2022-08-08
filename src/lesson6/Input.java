package lesson6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter a number [1-7]");
        int day = i.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println("Sunday");
                System.out.println("James Bond");
            }
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Day not found");
        }
    }
}
