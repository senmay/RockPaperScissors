import java.util.*;
import java.util.regex.Pattern;

public class InputCheck {
    public User user = new User();
    public Sign sign = new Sign();
    private Scanner sc = new Scanner(System.in);
    int howManyTimes;

    void readingName() {
        Pattern checkIfWord = Pattern.compile("[a-zA-Z]+");
        System.out.println("Enter your name: (It must have less than 10 characters and contain only letters)");
        user.setUsername(sc.nextLine());
        while (! checkIfWord.matcher(user.getUsername()).matches() && user.getUsername().length() < 10) {
            System.out.println("Please enter correct name: ");
            user.setUsername(sc.nextLine());
        }
    }

    void readingNumberOfRounds() {
        do {
            System.out.println("How many rounds do you want to play?: (More than 0, less than 10)");
            while (! sc.hasNextInt()) {
                System.out.println("That's not a number");
                sc.next();
            }
            howManyTimes = sc.nextInt();
        } while (howManyTimes < 0 || howManyTimes > 10);
        System.out.println("Thanks!");
    }

    void checkIfValueIsCorrect() {

        System.out.println("Choose option: ");
        System.out.println("Press 1 for picking ROCK");
        System.out.println("Press 2 for picking PAPER");
        System.out.println("Press 3 for picking SCISSORS");
        System.out.println("Press x to quit the game");
        System.out.println("Press n to start new game");
        sign.setSign(sc.next());
        while (! sign.getSign().matches("[123xyn]")) {
            System.out.println("Please enter correct option: ");
            sign.setSign(sc.next());
        }
        if (sign.getSign().equals("n")) {
            System.out.println("Do you want to start new game? (y for yes)");
            if (sc.next().equals("y")) {
                RpsRunner.isNewGame = true;
            }
        }
        if (sign.getSign().equals("x")) {
            System.out.println("Do you want to quit game? (y for quit)");
            if (sc.next().equals("y")) {
                RpsRunner.gameFinished = true;
            }
        }
    }

    public Possibilites randomizeOpoonentChoice() {
        List<Possibilites> values = new ArrayList<>(Arrays.asList(Possibilites.values()));
        final int size = values.size();
        final Random random = new Random();
        return values.get(random.nextInt(size));
    }
}


