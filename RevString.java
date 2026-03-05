import java.util.Scanner;
public class RevString{

	public static String stringRev(String s){
		String str="";
		for(int i=s.length()-1 ; i>=0 ; i--){
			str=str+s.charAt(i);
		}
		return str;
	}

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		String result= stringRev(str);		
		System.out.println(result);
		}
}
