package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        String sentence = "I can't see it!";
        String name = "Zge";
        String anotherName = "Zge ";

        System.out.println(name.contentEquals(anotherName));
        char[] str2 = {'h', 'e', 'v', 'e', 'n'};
        String copy = String.copyValueOf(str2, 1, 4);
        System.out.println(copy);
        System.out.println(copy.endsWith("en"));
        System.out.println(copy.startsWith("ev"));
        char[] chars = new char[10];
        // { , , , , , , , , ,}
        System.out.println(chars);
        copy.getChars(0, 4, chars, 2);
        // copy- even
        // chars - {}
        // {e, v, e, n}
        System.out.println(chars);

    }
}
