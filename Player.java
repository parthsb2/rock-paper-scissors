package rockpaperscissors;

public class Player {

    private Choice choice;
    public Player() {
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(String playerChoice){

        try {
            Choice choice = Choice.valueOf(playerChoice.toUpperCase());
            this.choice = choice;
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input");
        }
    }

}
