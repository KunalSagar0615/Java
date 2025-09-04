import java.util.Scanner;
public class CheckChar{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str;
		int ccnt=0,dcnt=0,scnt=0;
		System.out.println("Enter input : ");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(Character.isAlphabetic(str.charAt(i)))
				ccnt++;
			else if(Character.isDigit(str.charAt(i)))
				dcnt++;
			else
				scnt++;
		}
	
	System.out.println("character count is:"+ccnt);
	System.out.println("Digit count is:"+dcnt);
	System.out.println("Special Symbol count is:"+scnt);
	}

}