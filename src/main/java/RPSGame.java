
import java.util.*;
import java.util.regex.Pattern;

class RPSGame {
    private Scanner sc = new Scanner(System.in);
    int howManyTimes;
    Possibilites player1Choice;

    public Possibilites getPlayer1Choice() {
        return player1Choice;
    }

    public int getCountPlayer1Winds() {
        return countPlayer1Winds;
    }

    public int getCountPlayer2Winds() {
        return countPlayer2Winds;
    }

    public Possibilites getPlayer2Choice() {
        return player2Choice;
    }

    Possibilites player2Choice;
    int countPlayer1Winds = 0;
    int countPlayer2Winds = 0;
    RpsRunner confirm = new RpsRunner();
    private Pattern checkIfWord = Pattern.compile("[a-zA-Z]+");

    void readingName() {
        boolean isNameCorrect = false;
        while (!isNameCorrect) {
            Messages.ShowingNameMessage();
            String username = sc.nextLine();
            if (checkIfWord.matcher(username).matches() && username.length() < 10) {
                isNameCorrect = true;
            }
        }
    }

    void readingNumberOfRounds() {
        boolean isNumberOfRoundsCorrect = false;
        while (!isNumberOfRoundsCorrect) {
            Messages.ShowingHowManyRounds();
            howManyTimes = sc.nextInt();
            if (howManyTimes > 0 && howManyTimes < 20) {
                isNumberOfRoundsCorrect = true;
            }
        }
    }

    void choosingOption() {
        boolean isSignCorrect = false;
        boolean isQuitConfirmed = false;

        while (!isSignCorrect) {
            System.out.println("Choose option: ");
            System.out.println("Press 1 for picking ROCK");
            System.out.println("Press 2 for picking PAPER");
            System.out.println("Press 3 for picking SCISSORS");
            System.out.println("Press x to quit the game");
            System.out.println("Press n to start new game");
            switch (sc.next()) {
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

    private void quitConfirmation() {
        System.out.println("Do you really want to quit game? (y for quit)");
        if (sc.next().equals("y"))   {
            RpsRunner.gameFinished = true;
        }
    }

    void resolvingGame() {
        List<Possibilites> values = new ArrayList<>(Arrays.asList(Possibilites.values()));
        final int size = values.size();
        final Random random = new Random();
        player2Choice = values.get(random.nextInt(size));
        Messages message = new Messages();

        if (player1Choice == player2Choice) {
            countPlayer1Winds++;
            countPlayer2Winds++;
            Messages.ShowingResultDraw();
        }

        if (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.PAPER) {
            countPlayer1Winds++;
            Messages.ShowingResultScissorsPaper();
        }

        if (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.SCISSORS) {
            countPlayer2Winds++;
            Messages.ShowingPaperScissors();
        }

        if (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.SCISSORS) {
            countPlayer1Winds++;
            Messages.ShowingResultRockScissors();
        }

        if (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.ROCK) {
            countPlayer2Winds++;
            Messages.ShowingResultScissorsRock();
        }

        if (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.ROCK) {
            countPlayer1Winds++;
            Messages.ShowingResultPaperRock();
        }

        if (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.PAPER) {
            countPlayer2Winds++;
            Messages.ShowingResultRockPaper();
        }

    }
}
