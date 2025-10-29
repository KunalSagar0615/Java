import java.util.Scanner;

public class AdditionOf2Nos {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	System.out.println("Enter first no:");
	a=sc.nextInt();
	System.out.println("Enter second no:");
	b=sc.nextInt();
	
	System.out.println("Addition is :"+(a+b));
}
}
