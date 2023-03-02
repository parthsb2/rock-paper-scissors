package rockpaperscissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        // Create Instances of all the needed classes and start the game
        Player player = new Player();
        Computer computer = new Computer();
        Output output = new Output();

        boolean continuePLaying = true;
        while (continuePLaying) {
            // Get User input
            Scanner scanner = new Scanner(System.in);
            String playerChoice = scanner.nextLine();

            // First check if the player input is exit
            if (playerChoice.equals("!exit")) {
                output.sayBye();
                break;
            }

            // Set input as player choice
            player.setChoice(playerChoice);

            // Invoke Game class and start playing the game
            Game game = new Game(player, computer);
            game.play();



        }


    }
}
