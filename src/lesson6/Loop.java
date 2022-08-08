package lesson6;

public class Loop {
    public static void main(String[] args) {
        int i = 200;
        while(i < 200) {
            System.out.println("Hello World");
            i++;
        }

        do {
            System.out.println("Hello World");
            i++;
        }while (i < 200);
    }
}
