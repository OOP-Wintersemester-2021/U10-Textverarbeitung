import java.util.Scanner;


public class MainApp {

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

    public static void main(String[] args) {
        MainApp.testRemover();
    }
}
