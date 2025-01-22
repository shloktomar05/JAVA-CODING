package JavaMaths;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiffeInDate {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format: yyyy-MM-dd
        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();

        // Parse the input dates
        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Calculate the difference in days
        long daysDifference = ChronoUnit.DAYS.between(firstDate, secondDate);

        System.out.println("Difference in days: " + Math.abs(daysDifference));
    }
}

    

