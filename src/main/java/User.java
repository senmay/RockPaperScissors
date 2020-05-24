public class User {
    String username;
    int howManyRoundsWon;

    public User(String username, int howManyRoundsWon, int howManyGamesWon) {
        this.username = username;
        this.howManyRoundsWon = howManyRoundsWon;
        this.howManyGamesWon = howManyGamesWon;
    }
    public User() {
    }

    int howManyGamesWon;

    public int getHowManyRoundsWon() {
        return howManyRoundsWon;
    }

    public void setHowManyRoundsWon(int howManyRoundsWon) {
        this.howManyRoundsWon = howManyRoundsWon;
    }

    public int getHowManyGamesWon() {
        return howManyGamesWon;
    }

    public void setHowManyGamesWon(int howManyGamesWon) {
        this.howManyGamesWon = howManyGamesWon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
