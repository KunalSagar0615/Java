import java.util.Scanner;
public class Palindrome{

	public static boolean checkPalindrome(String s){
		String str="";
		for(int i=s.length()-1 ; i>=0 ; i--){
			str=str+s.charAt(i);
		}
		return str.equalsIgnoreCase(s);
	}

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		if(checkPalindrome(str))		
			System.out.println("String is palindrome");
		else
			System.out.println("Not Palindrome");
		}
}
