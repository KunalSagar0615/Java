import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		int cnt=0;
		str=str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				cnt++;
		}
		
		System.out.println("Word count is : "+(cnt+1));
	}

}
