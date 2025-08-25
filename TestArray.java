import java.util.Scanner;
public class TestArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter aray Size:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter array elemnts :");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();

	System.out.println("\nArray elements : ");
	for(int x : a)
		System.out.println(x);
  }

}