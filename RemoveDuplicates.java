import java.util.Scanner;

public class RemoveDuplicates {

    // Custom function to remove duplicate characters
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Add the character only if it's not already in result
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        String output = removeDuplicates(input);

        System.out.println("Output (duplicates removed): " + output);

        scanner.close();
    }
}
