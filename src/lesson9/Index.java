package lesson9;


public class Index {
    public static void main(String[] args) {
        Girl ifeoma = new Girl("Ifeoma");
        ifeoma.complexion = "fair";
        ifeoma.height = 5;
        ifeoma.sizeOfBreast = 20;


        Girl vera = new Girl("Vera", 19);
        vera.complexion = "fair";
        vera.height = 6;

        ifeoma.talk();
        vera.walk();
        ifeoma.fight(vera);

        Girl.meth(); // Called

        System.out.println(vera.complexion);

        Girl onome = new Girl();

        System.out.println(Girl.noOfRibs);
    }
}

//class Car {
//    String name;
//    String color;
//    int noOfWheels;
//
//    void brake() {
//        System.out.println("The car is braking");
//    }
//}

class Girl {
    final int age = 20;
    String name;
    int sizeOfBreast;
    String complexion;
    int height;
    final static int noOfRibs = 7;

    static void meth() {
        System.out.println("Called");
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
        System.out.println("Created");
    }

    public Girl(String name, int sizeOfBreast) {
        this.name = name;
        this.sizeOfBreast = sizeOfBreast;
    }

    void talk() {
        System.out.println(this.name + " is talking");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }

    void fight(Girl girl) {
        System.out.println(this.name + " is fighting with " + girl.name);
    }
}
