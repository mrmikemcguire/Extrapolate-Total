import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExtrapolateTotal
	{
    public static void main(String[] args) 
    	{
    	Scanner userIntInput = new Scanner(System.in);
    	System.out.println("What is your total up to now?");
    	int inputInteger = userIntInput.nextInt();
    	
        LocalDate currentDate = LocalDate.now();
       
        // Extrapolate the integer value for the remaining days of the year
        LocalDate endOfYear = LocalDate.of(currentDate.getYear(), 12, 31);
        long remainingDays = ChronoUnit.DAYS.between(currentDate, endOfYear) + 1; // Adding 1 to include the current date
        double extrapolatedValue = (inputInteger * 1.0 / currentDate.getDayOfYear()) * remainingDays;
        
        System.out.println("At this pace, your year-end total will be " + extrapolatedValue);
    	}
	}
