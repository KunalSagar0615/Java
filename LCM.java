import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, gcd = 1,lcm;
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		
		lcm=(a*b)/gcd;
		
		System.out.println("LCM is "+lcm);
	}

}
