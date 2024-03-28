import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
      //Input year of joining
        System.out.print("Enter the year of joining: ");
        int yearJoined = scanner.nextInt();
      // Calculate years of service
        int yearsOfService = currentYear - yearJoined;
      // Calculate bonus
        int bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = 5000;
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            bonusAmount = 3000;
        }
        // Output bonus information
        if (bonusAmount > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonusAmount + "/-");
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }

        scanner.close();
    }
}
