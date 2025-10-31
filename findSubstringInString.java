//30

import java.util.Scanner;

public class findSubstringInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		System.out.println("Enter a string: ");
		String subStr=sc.nextLine();
		 
		if(str.contains(subStr))
			System.out.println("Substring found");
		else
			System.out.println("Substring not found!");
	}

}
