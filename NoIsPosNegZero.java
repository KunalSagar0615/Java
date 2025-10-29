import java.util.Scanner;

public class NoIsPosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no=sc.nextInt();
		if(no<0)
			System.out.println("No is negative");
		else if(no>0)
			System.out.println("No is positive");
		else
			System.out.println("No is zero");
	}

}
