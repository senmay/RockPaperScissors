class RPSGame {
    InputCheck input = new InputCheck();
    private Possibilites player2Choice;
    private Possibilites player1Choice;
    private User user = new User();
    private User userAi = new User();
    private Sign sign = input.sign;
    boolean isNewGame = false;

    void choosingOption(Sign sign) {
        //System.out.println(input.sign.getSign());

        switch (sign.getSign()) {
            case "1":
                player1Choice = Possibilites.ROCK;
                break;
            case "2":
                player1Choice = Possibilites.PAPER;
                break;
            case "3":
                player1Choice = Possibilites.SCISSORS;
                break;
        }
    }

    void resolvingGame(User user) {
        player2Choice = input.randomizeOpoonentChoice();

        if (player1Choice == player2Choice) {
            user.setHowManyRoundsWon(user.getHowManyRoundsWon() + 1);
            userAi.setHowManyRoundsWon(userAi.getHowManyRoundsWon() + 1);
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n DRAW");
            System.out.println("RESULT : " + user.getHowManyRoundsWon() + " " + userAi.getHowManyRoundsWon() + "\n");
        }

        if ((player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.PAPER) || (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.SCISSORS) || (player1Choice == Possibilites.PAPER && player2Choice == Possibilites.ROCK)) {
            user.setHowManyRoundsWon(user.getHowManyRoundsWon() + 1);
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 2 wins\n");
            System.out.println("RESULT : " + user.getHowManyRoundsWon() + " " + userAi.getHowManyRoundsWon() + "\n");
        }

        if ((player1Choice == Possibilites.PAPER && player2Choice == Possibilites.SCISSORS) || (player1Choice == Possibilites.SCISSORS && player2Choice == Possibilites.ROCK) || (player1Choice == Possibilites.ROCK && player2Choice == Possibilites.PAPER)) {
            userAi.setHowManyRoundsWon(userAi.getHowManyRoundsWon() + 1);
            System.out.println("Player 1 : " + player1Choice + " / Player 2 : " + player2Choice + "\n Player 1 wins\n");
            System.out.println("RESULT : " + user.getHowManyRoundsWon() + " " + userAi.getHowManyRoundsWon() + "\n");
        }
    }
}
