import java.util.Scanner;
public class TestEmployee{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n,id;
	String name;
	System.out.rpintln("Enter size :");
	n=sc.nextInt();
	Employee emp=new Employee();

	Employee[] e=new Employee[n];
	for(int i=0;i<n;i++)
		e[i]=accept();

	EmployeeService es=new EmployeeService();

	while(true){
	System.out.println("""
		1.Display
		2.searchById
		3.searchByName
		4.maxByTotalSalary
		5.sort
		6.Exit
		Enter your choice :
		""");
		int ch=sc.nextInt();
		switch(ch){
		case 1:display(emp);
			break;
		case 2:System.out.println("Enter id :");
			id=sc.nextInt();
			searchById(emp,id);
			break;
		cse 3:System.out.println("Enter name :");
			name=sc.next();
			searchByName(emp,name);
			break;
		case 4:maxByTotalSalary(emp);
			break;
		case 6:System.EXIT(0);
		default :
			System.out.println("Invalid choice");
			break;

		}
	}
	}
}