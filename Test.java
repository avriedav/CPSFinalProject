import java.util.*;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImage {
	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Welcome to Time Conversion Calcuator!");
		
		DisplayImage abc = new DisplayImage();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Time Zone in reference to UTC (i.e. if UTC -8, enter -8) : " );
		int timezone1 = input.nextInt();
		
		System.out.println("Now please enter your local time! Time will be calculated using military time. ");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the hour: ");
		int hour = input.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Please enter the minute: ");
		int minute = input.nextInt();
		
		System.out.println("You said your local time is " + hour + ":" + minute);
		Scanner input4 = new Scanner(System.in);
		System.out.println("Please enter your friend's Time Zone: ");
		int timezone2 = input.nextInt();
		
		int fhour = timeZoneCalculator(timezone1, timezone2, hour);
		System.out.println("Your friend's local time is " + fhour + ":" + minute);
		
			}
	
	public DisplayImage() throws IOException {
		BufferedImage img = ImageIO.read(new File("/Users/avriedavis/Downloads/TimeZone Map.jpg"));
		ImageIcon icon = new ImageIcon(img);
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 300);
		JLabel lbl = new JLabel();
		lbl.setIcon(icon);
		frame.add(lbl);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static int timeZoneCalculator(int timezone_1, int timezone_2, int yourhour) {
		int timeDifference = timezone_1 - timezone_2;
		int fhour = yourhour - timeDifference;
		return fhour;
		}
}
