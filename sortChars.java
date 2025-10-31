//31

import java.util.Scanner;

public class sortChars {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a string: ");
		 String str=sc.nextLine();
		 String result="";
		 
		 for(char ch='a';ch<='z';ch++) { 
		 
			 for(int i=0;i<str.length();i++) {
		 
				 char c=str.charAt(i);
				 if(c==ch)
					 result+=c;
				 
			 } 	 
		 }	
		 System.out.println("Sorted order:"+result);
	}
}
