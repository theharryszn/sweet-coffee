package lesson10;

public class Inheritance {
    public static void main(String[] args) {
        Vehicle ford = new Car("Ford");
        Car lexus = new Car("Lexus");



        Bike honda = new Bike("Honda");

        System.out.println(honda.model);
        honda.honk();

        System.out.println(lexus.noOfWheels);
    }
}

class Vehicle {
    int noOfWheels;
    String model;
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Bike extends Vehicle {
    int noOfWheels = 2;

    @Override
    public void honk() {
        System.out.println("Light pim pim");
    }

    public Bike(String model) {
        this.model = model;
    }
}

class Car extends Vehicle {
    int noOfWheels = 4;

    int jame = 20;

    @Override
    public void honk() {
        System.out.println("Pim Pimm");
    }

    public Car(String model) {
        this.model =  model;
    }
}


