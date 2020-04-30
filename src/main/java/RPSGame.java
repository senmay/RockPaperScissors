import java.util.*;
import java.util.regex.Pattern;

class RPSGame {
    private Scanner sc = new Scanner(System.in);
    boolean isEnding = false;
    boolean isNewGame = true;
    int howManyTimes;
    protected Possibilites player1Choice;
    protected Possibilites player2Choice;
    int countPlayer1Winds = 0;
    int countPlayer2Winds = 0;

    Pattern checkIfWord = Pattern.compile("[a-zA-Z]+");

    void readingName() { //reading name - rozbicie metod
        boolean isCorrect = false;
        while (!isCorrect) {
            String username = sc.nextLine();
            if (checkIfWord.matcher(username).matches() && username.length() < 10) {
                isCorrect = true;
            }
        }
    }

    void readingNumberOfRounds() { // reading number of rounds
        boolean isCorrect = false;
        while (!isCorrect) {
            howManyTimes = sc.nextInt();
            if (howManyTimes > 0 && howManyTimes < 20) {
                isCorrect = true;
            }
        }
    }

    void choosingOption() {
        boolean isCorrect = false;
        while (!isCorrect) {
            String whichSign = sc.nextLine();
            switch (whichSign) {
                case "1":
                    player1Choice = Possibilites.ROCK;
                    isCorrect = true;
                    break;
                case "2":
                    player1Choice = Possibilites.PAPER;
                    isCorrect = true;
                    break;
                case "3":
                    player1Choice = Possibilites.SCISSORS;
                    isCorrect = true;
                    break;
                case "x":
                    isEnding = true;
                    isCorrect = true;
                    break;
                case "n":
                    isNewGame = true;
                    isCorrect = true;
                    break;
                default:
                    isCorrect = false;
            }
            System.out.println(whichSign);
        }
    }

    void resolvingGame() {
        List<Possibilites> values = new ArrayList<>(Arrays.asList(Possibilites.values()));
        Messages message = new Messages();
        final int size = values.size();
        final Random random = new Random();
        player2Choice = values.get(random.nextInt(size));

        if (player1Choice == player2Choice) {
            countPlayer1Winds++;
            countPlayer2Winds++;
        }
        message.ShowingResultDraw();
        if (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.PAPER) {
            countPlayer1Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 1 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

        if (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.SCISSORS) {
            countPlayer2Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 2 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

        if (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.SCISSORS) {
            countPlayer1Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 1 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

        if (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.ROCK) {
            countPlayer2Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 2 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

        if (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.ROCK) {
            countPlayer1Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 1 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

        if (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.PAPER) {
            countPlayer2Winds++;
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 2 wins\n");
            System.out.println("RESULT : " + countPlayer1Winds + " " + countPlayer2Winds);
        }

    }
}
