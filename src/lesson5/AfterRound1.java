package lesson5;

public class AfterRound1 {
    public static void main(String[] args) {
        int gb = 17;
        int eb = 9;
        int ws = 20;
        int ife = 15;
        int ve = 16;
        int on = 5;
        int em = 18;
        int to = 27;

        int gbR = (int) (Math.random() * 5);
        int ebR = (int) (Math.random() * 5);
        int wsR = (int) (Math.random() * 5);
        int ifeR = (int) (Math.random() * 5);
        int veR = (int) (Math.random() * 5);
        int onR = (int) (Math.random() * 5);
        int emR = (int) (Math.random() * 5);
        int toR = (int) (Math.random() * 5);

        int sum = gbR + ebR + wsR + ifeR + veR + onR + emR + toR;

        System.out.println(sum);
        if(sum == gb) {
            System.out.println("Gboyin wins");
        }else if(sum == eb) {
            System.out.println("Ebuka wins");
        }else if(sum == ws) {
            System.out.println("Wisdom Wins");
        }else  if(sum == ife) {
            System.out.println("Ifeoma Wins");
        }else if(sum == ve) {
            System.out.println("Vera wins");
        }else  if(sum == on) {
            System.out.println("Onome Wins");
        }else if(sum == to) {
            System.out.println("Tochukwu Wins");
        }else if(sum == em) {
            System.out.println("Emmanuel Wins");
        }else {
            System.out.println("This game na scam");
        }
    }
}
