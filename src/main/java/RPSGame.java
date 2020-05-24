import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class RPSGame {
    InputCheck input = new InputCheck();
    int howManyTimes;
    private Possibilites player1Choice;
    private int countPlayer1Winds = 0;
    private int countPlayer2Winds = 0;
    boolean isNewGame = false;

    void choosingOption() {
        boolean isSignCorrect = false;
        boolean isQuitConfirmed = false;

        while (! isSignCorrect) {
            System.out.println("Choose option: ");
            System.out.println("Press 1 for picking ROCK");
            System.out.println("Press 2 for picking PAPER");
            System.out.println("Press 3 for picking SCISSORS");
            System.out.println("Press x to quit the game");
            System.out.println("Press n to start new game");
            switch (readInputOption()) {
                case "1":
                    player1Choice = Possibilites.ROCK;
                    isSignCorrect = true;
                    break;
                case "2":
                    player1Choice = Possibilites.PAPER;
                    isSignCorrect = true;
                    break;
                case "3":
                    player1Choice = Possibilites.SCISSORS;
                    isSignCorrect = true;
                    break;
                case "x":
                    isSignCorrect = true;
                    isQuitConfirmed = true;
                    break;
                case "n":
                    isSignCorrect = true;
                    RpsRunner.isNewGame = true;
                    break;
                default:
                    System.out.println("Enter correct option: ");
            }
            if (isQuitConfirmed) {
                quitConfirmation();
                break;
            }

        }
    }

    void quitConfirmation() {
        System.out.println("Do you want to quit game? (y for quit)");
        if (sc.next().equals("y")) {
            RpsRunner.gameFinished = true;
        }
    }

    public Possibilites randomizeOpoonentChoice() { //todo wyjebac to w pizdu do innej klasy
        List<Possibilites> values = new ArrayList<>(Arrays.asList(Possibilites.values()));
        final int size = values.size();
        final Random random = new Random();
        return values.get(random.nextInt(size));
    }

    void resolvingGame() {
        Possibilites player2Choice = randomizeOpoonentChoice();

        if (player1Choice == player2Choice) { //todo set user HopwManyRTounds to correct values
            countPlayer1Winds++;
            countPlayer2Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n DRAW");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds + "\n");
        }

        if ((player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.PAPER) || (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.SCISSORS) || (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.ROCK))  {
            countPlayer1Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 2 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds + "\n");
        }

        if ((player1Choice == Possibilites.PAPER && player2Choice == Possibilites.SCISSORS) || (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.ROCK) || (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.PAPER)) {
            countPlayer2Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 1 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds + "\n");
        }
    }
}
