import java.util.Random;

public class Player {
    private String name;
    private VARIANTS choice;

    public Player() {
        this.name = "Bot";
        this.choice = getChoice();
    }

    public Player(VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    private VARIANTS getChoice() {
        Random random = new Random();
        return VARIANTS.values()[random.nextInt(VARIANTS.values().length)];
    }

    public String whoWins(Player player1, Player player2) {
        if (player1.choice == player2.choice) {
            return "Ничья";
        } else if (
                (player1.choice == VARIANTS.ROCK && player2.choice == VARIANTS.SCISSORS) ||
                        (player1.choice == VARIANTS.SCISSORS && player2.choice == VARIANTS.PAPER) ||
                        (player1.choice == VARIANTS.PAPER && player2.choice == VARIANTS.ROCK)
        ) {
            return "Победил игрок с именем: " + player1.name;
        } else {
            return "Победил игрок с именем: " + player2.name;
        }
    }
}