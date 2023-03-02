package rockpaperscissors;

public enum Choice {
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    private final String choice;
    Choice(String choice) {
        this.choice = choice;
    }

    public String getChoiceString(){
        return this.choice;
    }
}
