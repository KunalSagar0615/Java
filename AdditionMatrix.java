import java.util.Scanner;
public class AdditionMatrix{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row of 1st matrix :");
	int r1=sc.nextInt();

	System.out.println("Enter column of 1st matrix :");
	int c1=sc.nextInt();

	System.out.println("Enter row of 2nd matrix :");
	int r2=sc.nextInt();

	System.out.println("Enter column of 2nd matrix :");
	int c2=sc.nextInt();

	if(!(r1==r2 && c1==c2)){
		System.out.println("Invalid input");
		System.exit(0);
	}

	int[][] a=new int[r1][c1];
	System.out.println("Enter "+(r1*c1)+" elements :");
	accept(a,r1,c1);

	int[][] b=new int[r2][c2];
	System.out.println("Enter "+(r2*c2)+" elements :");
	accept(b,r2,c2);

	int[][] add=new int[r1][c1];
	for(int i=0;i<r1;i++){
		for(int j=0;j<c1;j++){
			add[i][j]=a[i][j]+b[i][j];
		}
	}
	display(add,r1,c1);
  }
	public static void accept(int[][] a,int r,int c){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void display(int[][] a,int r,int c){
		for(int[] x: a){
			for(int i:x){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}