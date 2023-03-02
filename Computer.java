package rockpaperscissors;

import java.util.Random;
public class Computer {

    Choice choice;

    public Choice getChoice() {
        return choice;
    }

    public Computer(){
    }

    public void generateRandomChoice() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0 -> this.choice = Choice.ROCK;
            case 1 -> this.choice = Choice.PAPER;
            case 2 -> this.choice = Choice.SCISSORS;
        }
    }

    public void computeWinningChoice(Choice playerChoice){
        switch (playerChoice) {
            case ROCK -> this.choice = Choice.PAPER;
            case PAPER -> this.choice = Choice.SCISSORS;
            case SCISSORS -> this.choice = Choice.ROCK;
        }
    }
}
