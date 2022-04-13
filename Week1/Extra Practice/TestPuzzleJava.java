import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava{

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> rollDice =generator.getTenRolls();
        System.out.println(rollDice);

        System.out.println(generator.getRandomLetter());

        System.out.println(generator.generatePassword());

        System.out.println(generator.getNewPasswordSet(7));
    }
}
