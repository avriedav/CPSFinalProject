import java.util.*;
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Welcome to Time Conversion Calcuator!");
		Scanner input = new Scanner(System.in);
		System.out.print("Please select your continent from the following options: "
				+ "\n1 for North America, 2 for South America, 3 for Asia, 4 for Europe, 5 for Africa, and 6 for Australia\n");
		int userContinent = input.nextInt();
		
		switch (userContinent) {
		case 1: 
			System.out.println("Your continent is North America! (:");
			Scanner input1 = new Scanner(System.in);
			System.out.print("Please select your friend's continent from the following options: "
					+ "\n1 for North America, 2 for South America, 3 for Asia, 4 for Europe, 5 for Africa, and 6 for Australia\n");
			int friendContinent = input.nextInt();
			
			switch (friendContinent) {
			case 1: 
				System.out.println("Your friend's continent is North America! (:");
				System.out.println("Your local time will be based on military time.");
				Scanner input2 = new Scanner(System.in);
				System.out.print("Please enter the hour for your local time: ");
				int hour = input.nextInt();
				
				Scanner input3 = new Scanner(System.in);
				System.out.print("Please enter the minute: ");
				int minute = input.nextInt();
				
				System.out.println("What day of the week is it?");
				Scanner input4 = new Scanner(System.in);
				System.out.print("Enter 1 for Monday, 2 for Tuesday, 3 for Wednesday, and so on...");
				int day = input. nextInt();
				
				switch (day) {
				case 1:
					
					System.out.print("You said your local time is " + hour + ":"  + minute + " on Monday");	
				}
		
			}
		}
	}
}
