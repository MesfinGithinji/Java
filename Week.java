// A Java program to demonstrate working on enum in switch case

import java.util.Scanner;

// An Enum class
enum Day {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}

// Driver class that contains an object of "day" and main().
public class Week {

	Day dayName;

	// Constructor
	public Week(Day dayName) { 
		this.dayName = dayName; 
	}

	// Prints a line about Day using switch
	public void dayIsLike()
	{
		switch (dayName) {
		case MONDAY:
			System.out.println("\nMondays are interesting.");
			break;
		case FRIDAY:
			System.out.println("\nFridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("\nWeekends are best.");
			break;
		default:
			System.out.println("\nMidweek days are so-so.");
			break;
		}
	}

	// Driver method
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String inputStr;

		do {
			System.out.println("Enter any day of the week: ");
			inputStr = scanner.nextLine();
			
			if (!inputStr.equals(inputStr.toUpperCase())){
				System.out.println("\nPlease enter the text in uppercase.");
			}

		} while (!inputStr.equals(inputStr.toUpperCase()));

		Week day1 = new Week(Day.valueOf(inputStr));
		day1.dayIsLike();

		scanner.close();
	}
}

