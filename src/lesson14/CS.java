package lesson14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

interface RandomFn {
    void run(int seconds);
}

public class CS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of seconds: ");
        int secs = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yy : hh mm ss");
        System.out.println(dateTime.format(formatter));
        System.out.println("Starting");

        RandomFn randomFn = (seconds) -> new Thread(() -> {
            try {
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDateTime dateTime2 = LocalDateTime.now();
            System.out.println(dateTime2.format(formatter));
            System.out.println("Ended");
        }).start();

        randomFn.run(secs);
    }
}
