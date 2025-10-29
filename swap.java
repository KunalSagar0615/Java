import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter first no:");
		a=sc.nextInt();
		System.out.println("Enter second no:");
		b=sc.nextInt();
		
		a=(a+b-(b=a));
		System.out.println("value of first no is "+a+"\nvalue of second no is "+b);
	}

}
