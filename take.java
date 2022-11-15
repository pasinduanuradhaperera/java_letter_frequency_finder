//take input from user
import java.util.Scanner;

public class take{

	public static String input(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please give a input : ");
		String text = input.nextLine();
		
		return text;
	
	}
}
