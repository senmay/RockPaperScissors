public class RpsRunner {
    static boolean gameFinished;
    private boolean quitConfirm;

    public static void main(String[] args) {

        while (!gameFinished) {
            RPSGame theGame = new RPSGame();
//            theGame.readingName();
            theGame.readingNumberOfRounds();
            for (int i = 0; i < theGame.howManyTimes; i++) {
                theGame.choosingOption();
                if (gameFinished) break;
                theGame.resolvingGame();

            }
        }
    }
}
//}
