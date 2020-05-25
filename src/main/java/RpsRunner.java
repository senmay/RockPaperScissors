public class RpsRunner {
    static boolean gameFinished = false;
    static boolean isNewGame = false;

    public static void main(String[] args) {

        while (! gameFinished) {
            RPSGame theGame = new RPSGame();
            InputCheck inputCheck = new InputCheck();
            gameFinished = false;
            isNewGame = false;
            inputCheck.readingName();
            inputCheck.readingNumberOfRounds();
            for (int i = 0; i < inputCheck.howManyTimes; i++) {
                inputCheck.checkIfValueIsCorrect();
                theGame.choosingOption(inputCheck.sign);
                if (isNewGame) {
                    i = inputCheck.howManyTimes;
                    break;
                }
                if (gameFinished) break;
                theGame.resolvingGame(inputCheck.user);
            }
        }
    }
}