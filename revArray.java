//36

import java.util.Scanner;

public class revArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Reversed array:");
		for(int  i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		
	}

}
