package lesson9;

public class Modifiers {
    public static void main(String[] args) {
        Lion lion = new Lion();

        lion.move();

        Animal animal2 = new Person();

        lion.sound();

    }
}

abstract class Animal {
    int age;
    public abstract void eat();
    public abstract void move();

    public void sound(){
        System.out.println("Sounding");
    }
}

class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    @Override
    public void move() {
        System.out.println("Walking with four legs");
    }
}


class Person extends Animal {

    @Override
    public void eat() {
        System.out.println("Eating plant and meat");
    }

    @Override
    public void move() {
        System.out.println("Walking with two legs");
    }
}