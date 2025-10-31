//34
import java.util.Scanner;

public class replaceCharInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Enter a character you want to replace: ");
		char ch=sc.next().charAt(0);
		
		System.out.println("Enter character you want to add insted:");
		char ch1=sc.next().charAt(0);
		
		System.out.println("Updated string:"+str.replace(ch, ch1));	
	}

}
