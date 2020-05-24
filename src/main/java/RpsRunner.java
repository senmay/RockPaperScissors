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
            inputCheck.checkIfValueIsCorrect();
//            for (int i = 0; i < theGame.howManyTimes; i++) {
//                theGame.choosingOption();
//                if (isNewGame) {
//                    i = theGame.howManyTimes;
//                    break;
//                }
//                if (gameFinished) break;
//                theGame.resolvingGame();
//                    if (i == theGame.howManyTimes-1) {
//                        theGame.quitConfirmation();
//                    }
//            }
        }
    }
}