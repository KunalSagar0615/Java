import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		int r,sum=0;
		while(no>0) {
			r=no%10;
			sum=sum+r;
			no/=10;
		}
		
		System.out.println("Sum of digits:"+sum);
	}

}
