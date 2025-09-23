import java.util.Scanner;
public class TestStudent{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int  roll;
		String name;
		float marks;
		System.out.println("Enter student details :");
		System.out.println("Enter roll :");
		roll=sc.nextInt();
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("marks :");
		marks=sc.nextFloat();
	
		Student s=new Student(roll,name,marks);
		System.out.println(s);
	}
}