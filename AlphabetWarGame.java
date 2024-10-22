import java.util.HashMap;
import java.util.Map;

public class AlphabetWarGame {
    private Map<Character, Integer> leftSideStrengths;
    private Map<Character, Integer> rightSideStrengths;

    // Constructor with default strengths
    public AlphabetWarGame() {
        leftSideStrengths = new HashMap<>();
        rightSideStrengths = new HashMap<>();

        // Default strengths for left-side letters
        leftSideStrengths.put('w', 4);
        leftSideStrengths.put('p', 3);
        leftSideStrengths.put('b', 2);
        leftSideStrengths.put('s', 1);

        // Default strengths for right-side letters
        rightSideStrengths.put('m', 4);
        rightSideStrengths.put('q', 3);
        rightSideStrengths.put('d', 2);
        rightSideStrengths.put('z', 1);
    }

    // Constructor with custom strengths
    public AlphabetWarGame(Map<Character, Integer> leftSideStrengths, Map<Character, Integer> rightSideStrengths) {
        this.leftSideStrengths = leftSideStrengths;
        this.rightSideStrengths = rightSideStrengths;
    }

    // Method overloading: fight with one word
    public String alphabetWar(String word) {
        int leftScore = 0;
        int rightScore = 0;

        // Calculate the total score for both sides
        for (char ch : word.toCharArray()) {
            if (leftSideStrengths.containsKey(ch)) {
                leftScore += leftSideStrengths.get(ch);
            } else if (rightSideStrengths.containsKey(ch)) {
                rightScore += rightSideStrengths.get(ch);
            }
        }

        // Determine the winner
        if (leftScore > rightScore) {
            return "Left side wins!";
        } else if (rightScore > leftScore) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    // Method overloading: fight with two separate words for left and right sides
    public String alphabetWar(String leftWord, String rightWord) {
        int leftScore = 0;
        int rightScore = 0;

        // Calculate the score for the left side
        for (char ch : leftWord.toCharArray()) {
            if (leftSideStrengths.containsKey(ch)) {
                leftScore += leftSideStrengths.get(ch);
            }
        }

        // Calculate the score for the right side
        for (char ch : rightWord.toCharArray()) {
            if (rightSideStrengths.containsKey(ch)) {
                rightScore += rightSideStrengths.get(ch);
            }
        }

        // Determine the winner
        if (leftScore > rightScore) {
            return "Left side wins!";
        } else if (rightScore > leftScore) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    // Main method to test the game
    public static void main(String[] args) {
        // Test cases with default strengths
        AlphabetWarGame game = new AlphabetWarGame();

        System.out.println(game.alphabetWar("z")); // Right side wins!
        System.out.println(game.alphabetWar("zdqmwpbs")); // Let's fight again!
        System.out.println(game.alphabetWar("wwwwwwz")); // Left side wins!

        // Test case with custom strengths
        Map<Character, Integer> customLeft = new HashMap<>();
        customLeft.put('a', 5);
        customLeft.put('b', 3);
        customLeft.put('c', 2);

        Map<Character, Integer> customRight = new HashMap<>();
        customRight.put('x', 4);
        customRight.put('y', 3);
        customRight.put('z', 2);

        AlphabetWarGame customGame = new AlphabetWarGame(customLeft, customRight);
        System.out.println(customGame.alphabetWar("abc", "xyz")); // Let's fight again!
    }
}
