import java.util.Scanner;

public class MaxIn3Nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("First Way");
		System.out.println("Enter first no:");
		a=sc.nextInt();
		System.out.println("Enter second no:");
		b=sc.nextInt();
		System.out.println("Enter third no:");
		c=sc.nextInt();
		if(a>b)
			b=a;
		if(c>b)
			b=c;
		System.out.println("Largest no is:"+b);
		
		
		System.out.println("\n Second Way \nEnter first no:");
		a=sc.nextInt();
		System.out.println("Enter second no:");
		b=sc.nextInt();
		System.out.println("Enter third no:");
		c=sc.nextInt();
		
		b=(a>b)?a:b;
		b=(c>b)?c:b;
		System.out.println("Largest no is:"+b);
		
	}

}
