//37
import java.util.Scanner;

public class maxNoInArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int no=arr[0];
		for(int i=0;i<arr.length;i++) {
			no=(no<arr[i])?arr[i]:no;
		}
		System.out.println("Max no form array is: "+no);
		
	}

}
