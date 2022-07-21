package lesson2;

public class Operators {
    public static void main(String[] args) {
        int x = 20, y = 30, z = 50;

        // Addition
        System.out.println(x + y); // 50
        System.out.println(x + z); // 70

        // Subtraction
        System.out.println(y - z); // -20
        System.out.println(y - z + (x - y)); // -30

        // Multiplication
        System.out.println(x * y); // 600
        System.out.println(x - z * (-y + (x * 2) - y) + z);

        // Division
        System.out.println(x / z);

        // Modulus
        System.out.println(x % 3); // 2

        System.out.println(x--);
        System.out.println(x);
    }
}
