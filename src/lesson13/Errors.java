package lesson13;

import java.util.ArrayList;

public class Errors {
    public static void main(String[] args) {
//        ArrayList<Integer> scores = new ArrayList<>();

//        try {
//            System.out.println(scores.get(0));
//        } catch (Exception e) {
//            System.out.println("nothing was found");
//            scores.add(2);
//            System.out.println("new item added");
//        }

        try {
            throw new NoNameException();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello World");
        }
    }
}

class NoNameException extends Exception {

    @Override
    public String getMessage() {
        return "Please specify a name";
    }
}
