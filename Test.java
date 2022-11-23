import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please select your friend's continent from the following options: "
				+ "North America, South America, Asia, Europe, Africa, and Australia\n");
		String Continent = input.nextLine();
		
		while (Continent == "North America") {
			//print graph of the continent
			Scanner input2 = new Scanner(System.in);
			System.out.print("Please enter your local time! What is the hour?");
			int Hour = input.nextInt();
			
			Scanner input3 = new Scanner(System.in);
			System.out.print("Please enter the minute: ");
			int Minute = input.nextInt();
			
			Scanner input4 = new Scanner(System.in);
			System.out.print("Please enter the day: ");
			String Day = input.nextLine();
			
			System.out.println("Your local time is " + Hour + ":" + Minute + " " + "on " + Day);
		}
	}
}
