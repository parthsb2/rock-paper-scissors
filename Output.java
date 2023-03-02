package rockpaperscissors;

import java.sql.SQLOutput;

public class Output {
    Choice playerChoice;
    Choice compChoice;
    Result result;

    public Output() {
    }

    public Output(Choice playerChoice, Choice compChoice, Result result) {
        this.playerChoice = playerChoice;
        this.compChoice = compChoice;
        this.result = result;
    }

    public void displayResult(){
        switch (result) {
            case TIE -> System.out.println("There is a draw (" + compChoice.getChoiceString() + ")");
            case WIN -> System.out.println("Well done. The computer chose " + compChoice.getChoiceString() + " and failed");
            case LOSE -> System.out.println("Sorry, but the computer chose " + compChoice.getChoiceString());
        }
    }

    public void sayBye(){
        System.out.println("Bye");
    }

}
