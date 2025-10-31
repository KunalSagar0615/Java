//35

import java.util.Scanner;

public class compairStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter a string: ");
		String str2 = sc.nextLine();
		
		str1=str1.trim();
		str2=str2.trim();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Both strings are not equal..");
			System.exit(0);
		}
		
		boolean flag=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Both strings are not equal");
		else
			System.out.println("Both strings are equal");
	}

}
