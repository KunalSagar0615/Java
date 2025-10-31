import java.util.Scanner;

public class freqCntOfChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		int i,cnt;
		char ch;
		for(ch='a';ch<='z';ch++) {
			cnt=0;
			for(i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
					cnt++;
				}
			}
			if(cnt>0) {
				System.out.println("Count of "+ch+" is "+cnt);
			}
		}
	}

}
