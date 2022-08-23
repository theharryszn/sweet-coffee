package lesson10.james;

public class Nested {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner =  outer.new Inner();
    }
}

class Outer {
    int x = 20;

    class Inner {
        int y = 40;

        public int add() {
            return x + y;
        }
    }
}



