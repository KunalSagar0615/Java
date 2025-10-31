import java.util.Scanner;

public class sumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		int sum=0,i;
		for(i=1;i<=no;i++) {
			sum+=i;
		}
		
		System.out.println("Sum of first "+no+" natural numbers is "+sum);
	}

}
