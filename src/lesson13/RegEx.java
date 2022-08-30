package lesson13;

import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\u1F35");

        Matcher matcher = pattern.matcher("harry@gmail.com?");

        boolean found = matcher.find();

        System.out.println(found);

    }
}
