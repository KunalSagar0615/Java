import java.util.Scanner;

public class countVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		
		int vcnt=0,ccnt=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vcnt++;
				else
					ccnt++;
			}
		}
		
		System.out.println("Vovel count is :"+vcnt);
		System.out.println("Consonent count is :"+ccnt);
	}

}
