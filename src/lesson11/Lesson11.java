package lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        enum Color {
            RED,
            GREEN,
            BLUE
        }

        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }

        Color favoriteColor = Color.RED;

        System.out.println(favoriteColor);

    }
}

interface Carnivore {
    void eatMeat();
}

interface Herbivore {
    void eatHerbs();
}

interface Bivore {
    void eatWhatEver();
}

class Lion implements Carnivore {

    @Override
    public void eatMeat() {
        System.out.println("This Lion is eating meat");
    }
}

class Human implements Carnivore, Herbivore {

    @Override
    public void eatMeat() {
        System.out.println("This human is eating meat");
    }

    @Override
    public void eatHerbs() {
        System.out.println("This human is eating herbs");
    }
}

class Girl extends Human implements Bivore {

    @Override
    public void eatWhatEver() {
        System.out.println("This girl is eating whatever");
    }
}
