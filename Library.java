import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();
      // Calculate fine
        int fine = 0;
        if (daysLate <= 7) {
            fine = daysLate * 50; // 50 paise per day
        } else if (daysLate <= 14) {
            fine = 7 * 50 + (daysLate - 7) * 100; // 50 paise for first 7 days, 1 rupee per day after
        } else if (daysLate <= 21) {
            fine = 7 * 50 + 7 * 100 + (daysLate - 14) * 500; // 50 paise for first 7 days, 1 rupee for next 7 days, 5 rupees per day after
        } else {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
            scanner.close();
            return;
        }
        // Output fine information
        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine / 100.0);
        scanner.close();
    }
}
