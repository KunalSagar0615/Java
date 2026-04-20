package demo;

import java.util.Scanner;

public class Calculator {
	
	public static void calculate(int op,double num1,double num2) {
		
		switch(op) {
		case 1:
			System.out.println("Addition is: "+ (num1+num2));
				break;
				
		case 2:
			System.out.println("Substraction is: "+ (num1-num2));
				break;
				
		case 3:
				try {
					if(num2==0)
						throw new ArithmeticException("Cannot divide by zero!");
					
					double result=num1/num2;
					System.out.println("Division is: "+result);
					
				} catch (ArithmeticException e) {
					System.out.println("Error : "+ e.getMessage());
				}
				break;
				
		case 4:
			System.out.println("Multiplication is: "+ (num1*num2));
			break;
			
		case 5:
			System.out.println("Modulus: "+(num1%num2));
			break;

		default:
			System.out.println("Your choice/operator is not found please enter valid choice!");
		}
		
	}
	

	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter choice: "
					+ "\n1.Addition"
					+ "\n2.Substraction"
					+ "\n3.Division"
					+ "\n4.Multiplication"
					+ "\n5.Modulus"
					+ "\n6.Exit\n");
			
			int ch=sc.nextInt();
			if(ch==6)
				System.exit(0);
			
			System.out.println("Enter first number: ");
			double num1=sc.nextDouble();
			
			System.out.println("Enter second number: ");
			double num2=sc.nextDouble();
			
			calculate(ch,num1,num2);
		}
		
		
	}
}
