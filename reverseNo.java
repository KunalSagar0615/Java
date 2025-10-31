import java.util.Scanner;

public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		
		int rem,sum=0;
		while(no>0) {
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		System.out.println("Reverse no is "+sum);
	}

}
