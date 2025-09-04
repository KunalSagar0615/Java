import java.util.Scanner;
public class countWordsAndLines{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr para : ");
		String str=sc.nextLine();
		int wcnt=0,lcnt=0;
		while(!str.equalsIgnoreCase("stop")){
			
		str=str.trim();
			for(int i=0;i<str.length();i++){
				if(Character.isSpaceChar(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i-1)))
					wcnt++;
			}
			wcnt++;
			lcnt++;
			str=sc.nextLine();
		}
	System.out.println("word count :"+wcnt);
	System.out.println("line count :"+lcnt);
	}
}