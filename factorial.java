import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int no=sc.nextInt();
		
		int fact=1;
		for(int i=no;i>0;i--) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of number:"+fact);
	}

}
