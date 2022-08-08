package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while(i <= 10){
            System.out.println("i- " + i);

            while (j < i) {
                System.out.println("j-" + j);
                j++;
            }

            i++;
        }

    }
}
