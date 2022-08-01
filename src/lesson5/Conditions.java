package lesson5;

public class Conditions {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 5);
        System.out.println(a);

        if(a == 2) {
            System.out.println("We got lucky");
        }else {
            System.out.println("Try again");
        }
    }
}
