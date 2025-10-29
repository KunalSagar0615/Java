import java.util.Scanner;

public class fabonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a=0,b=1,c,d;
		System.out.println("Enter number:");
		c=sc.nextInt();
		
		for(int i=1;i<=c;i++) { 
			System.out.println(a);
			d=a+b; 
			a=b; 
			b=d; 
		}
	}

}
