class Messages {
    private static RPSGame game;    

    static void ShowingNameMessage() {
        System.out.println("Enter your name: (It must have less than 10 characters and contain only letters)");
    }
    static void ShowingHowManyRounds() {
        System.out.println("How many rounds do you want to play?: (More than 0, less than 10)");
    }
    static void ShowingResultDraw() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n DRAW");
        System.out.println("RESULT : " +game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingResultScissorsPaper() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 2 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingPaperScissors() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 1 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingResultRockScissors() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 2 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingResultScissorsRock() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 1 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingResultPaperRock() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 2 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
    static void ShowingResultRockPaper() {
        System.out.println("Player 1 : " + game.getPlayer1Choice() + " / Player 2 : " + game.getPlayer2Choice() + "\n Player 2 wins\n");
        System.out.println("RESULT : " + game.getCountPlayer1Winds() + " " + game.getCountPlayer2Winds());
    }
}
