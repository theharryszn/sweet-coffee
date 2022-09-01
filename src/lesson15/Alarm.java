package lesson15;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    public static void main(String[] args) {
        Timer timer = new Timer();

        final int[] i = {0};

        while(i[0] < 5) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    i[0]++;
                    System.out.println(i[0]);
                }
            }, 1000);
        }

    }
}
