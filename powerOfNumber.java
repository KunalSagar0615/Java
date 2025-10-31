import java.util.Scanner;

public class powerOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		System.out.println("Enter power:");
		int pow=sc.nextInt();
		
		int result=1;
		for(int i=1;i<=pow;i++) {
			result=result*no;
		}
		
		System.out.println("Power is "+result);
	}

}
