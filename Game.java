package rockpaperscissors;


public class Game {
    Choice playerChoice;
    Choice compChoice;

    Player player;
    Computer computer;
    Result result;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void play(){
        // Get player choice
        playerChoice = player.getChoice();

        // Generate computer choice
        computer.generateRandomChoice();
        compChoice = computer.getChoice();

        // Check the result based on the choices
        checkResult(playerChoice, compChoice);

        // Display result
        Output output = new Output(playerChoice, compChoice, getResult());
        output.displayResult();


    }

    public Result getResult() {
        return result;
    }

    public void checkResult(Choice playerChoice, Choice compChoice) {
        if (playerChoice.equals(compChoice)) {
            this.result = Result.TIE;
        } else if (playerChoice.equals(Choice.ROCK) && compChoice.equals(Choice.SCISSORS)
        || playerChoice.equals(Choice.PAPER) && compChoice.equals(Choice.ROCK)
        || playerChoice.equals(Choice.SCISSORS) && compChoice.equals(Choice.PAPER)) {
            this.result = Result.WIN;
        } else {
            this.result = Result.LOSE;
        }
    }

}
