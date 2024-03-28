import java.util.Scanner;
public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        // Convert the string to lowercase for easier comparison
        inputString = inputString.toLowerCase();
        // Variables to store vowel count and presence flag
        int vowelCount = 0;
        boolean vowelPresent = false;
        // Check each character of the string for vowels
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                vowelPresent = true;
            }
        }
        // Output results
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
        scanner.close();
    }
}
