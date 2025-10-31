import java.util.Scanner;

public class LeapYrOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int yr=sc.nextInt();
		
		if((yr%400==0)||yr%4==0 && yr%100!=0)
			System.out.println("Year is Leap");
		else 
			System.out.println("year is not leap");
	}

}
