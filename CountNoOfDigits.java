import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		int cnt=0;
		
		while(no>0) {
			cnt++;
			no=no/10;
		}
		
		System.out.println("Number of digits in number:"+cnt);

	}

}
