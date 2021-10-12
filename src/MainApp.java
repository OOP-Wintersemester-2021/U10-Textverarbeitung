import numberdelimiter.NumberDelimiter;
import remover.Remover;
import scrabble.ScoreChecker;

import java.util.Scanner;


public class MainApp {
    private static void testDelimiterApp() {
        System.out.println("Testing NumberDelimiter");
        NumberDelimiter delimiter = new NumberDelimiter(NumberDelimiter.SEPARATOR_COMMA);
        while (true) {
            String input = MainApp.readString("Enter a numeric string: ");
            if (input.length() == 0) {
                break;
            }
            String result = delimiter.addSeparatorToNumericString(input);
            System.out.println(result);
        }
    }

    private static void testRemover() {
        System.out.println("Testing Remover");
        while (true) {
            String input = MainApp.readString("Enter String:");
            String characterString = MainApp.readString("Enter Character to be removed: ");
            if (input.length() == 0 || characterString.length() == 0) {
                break;
            }
            char character = characterString.charAt(0);
            String result = Remover.removeOccurrences(input, character);
            System.out.println(result);
        }
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void testScoreChecker() {
        System.out.println("Testing ScoreChecker");
        while (true) {
            String input = MainApp.readString("Enter word:");
            if (input.length() == 0) {
                break;
            }
            int result = ScoreChecker.getScore(input.toUpperCase());
            System.out.println(input + " [" + result + " points]");
        }
    }

    public static void main(String[] args) {
        MainApp.testDelimiterApp();
        MainApp.testRemover();
        MainApp.testScoreChecker();
    }
}
