package lesson8;

public class Recursion {
    public static void main(String[] args) {
        int result = fib(-8, 5);
        System.out.println(result);
    }

    //    public static int sum(int k) {
    //        if (k > 0) {
    //
    //            return k + sum(k - 1);
    //        } else {
    //            return 0;
    //        }
    //    }

    public static int fib(int prev, int current) {
        if(current <= 100){
            int next = prev + current;
            System.out.println(current);
            return fib(current, next);
        }else  {
            return 0;
        }
    }
}
