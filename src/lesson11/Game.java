package lesson11;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Wisdom");

        player1.changeLevel(Level.EASY);

        switch (player1.level) {
            case EASY -> System.out.println("This is so easy");
            case MEDIUM -> System.out.println("This is so medium shit");
            case HARD -> System.out.println("Hardcore shit");
        }

        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
}

enum Level {
    EASY,
    MEDIUM,
    HARD
}

class Player {
    public Level level = Level.EASY;
    public String username;

    public Player(String username) {
        this.username = username;
    }

    public void changeLevel(Level level) {
        this.level = level;
    }
}
