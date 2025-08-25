
import java.util.Scanner;
public class ArrayMethods{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a);
	System.out.println("\narray elements are:");
	display(a);
  }
	public static void accept(int a[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
	}
	public static void display(int a[]){
		for(int i:a)
			System.out.println(i);
	}
}