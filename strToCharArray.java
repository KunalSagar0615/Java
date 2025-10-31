//32
import java.util.Scanner;

public class strToCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.println("Character array is: ");
		for (char c : arr) {
			System.out.print(c+" ");
		}
	}

}
