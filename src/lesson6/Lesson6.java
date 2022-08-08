package lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        int age = 12;
        String greeting = age >= 18 ? "Hello Old One" : "Hello youngers ";

//        if(age >= 18) {
//            greeting = "Hello Old One";
//        }else {
//            greeting = "Hello youngers";
//        }

        int hour = 6;

        greeting = hour >= 12 ? "Good Afternoon" : "Good Morning";

        System.out.println(greeting);
    }
}
