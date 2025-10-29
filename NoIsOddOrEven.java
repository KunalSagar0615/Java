import java.util.Scanner;

public class NoIsOddOrEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any no : ");
		int no=sc.nextInt();
		
		if((no&1)==1)
			System.out.println("No is odd");
		else
			System.out.println("No is Even");
	}
}
