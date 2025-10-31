//33
import java.util.Scanner;
public class lengthOfStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		int cnt=0;
		
		try {
			while(true) {
				str.charAt(cnt);
				cnt++;
			}
		}
		catch(Exception e){
			System.out.println("String length is : "+cnt);
		}
	}

}
