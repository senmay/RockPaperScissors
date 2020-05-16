public class RpsRunner {
    static boolean gameFinished = false;
    static boolean isNewGame = false;

    public static void main(String[] args) {

        while (! gameFinished) {
            RPSGame theGame = new RPSGame();
            gameFinished = false;
            isNewGame = false;
            theGame.readingName();
            theGame.readingNumberOfRounds();
            for (int i = 0; i < theGame.howManyTimes; i++) {
                theGame.choosingOption();
                if (isNewGame) {
                    i = theGame.howManyTimes;
                    break;
                }
                if (gameFinished) break;
                theGame.resolvingGame();
                    if (i == theGame.howManyTimes-1) {
                        theGame.quitConfirmation();
                    }
            }
        }
    }
}