package lesson7;

import java.time.LocalDate;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] names = {"Emmanuel", "Ifeoma", "Sixtus", "Eniola", "Vera", "Wisdom", "Onome", "Tochukwu"};

        String[] subjects = new String[30];

        int[] scores = {2, 4, 6, 7};


        System.out.println(names[names.length - 1]);

        names[1] = "Harry";

        System.out.println(names[names.length - 1]);


        System.out.println("Enter your name: ");

        Scanner collect = new Scanner(System.in);
        String getValue = collect.nextLine();

        System.out.println("Enter your age: ");
        int getAge = collect.nextInt();

        int year = LocalDate.now().minusYears(getAge).getYear();
        System.out.println("Your name is " + getValue + " and you were born in the year " + year);
    }
}
