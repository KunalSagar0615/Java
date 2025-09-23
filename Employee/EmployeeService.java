public class EmployeeService{
	private int id;
	private String name;
	private float da,hra,tax,totalSalary,bs;
	Scanner sc=new Scanner(System.in);

	public void accept(Employee emp){
		System.out.println("Enter emp data :");
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter id : ");
		id=sc.nextInt();
		System.out.println("Enter basic salary : ");
		bs=sc.nextFloat();
		System.out.println("Enter DA(%) : ");
		da=sc.nextFloat();
		System.out.println("Enter hra(%) : ");
		hra=sc.nextFloat();
		System.out.println("Enter tax(%) :");
		tax=sc.nextFloat();

		totalSalary=bs+((bs*(da+hra-tax))/100);

		emp.setId(id);
		emp.setName(name);
		emp.setBasicSalary(bs);
		emp.setDa(da);
		emp.setHra(hra);
		emp.setTax(tax);
		emp.setTotalSalary(totalSalary);
		
	}

	public void display(Employee ...emp){
		for(Employee x:emp){
			System.out.println(x);
		}
	}

	public void searchById(Employee emp[],int id){
		for(Employee x:emp){
			if(x.getId()==id)
				display(x);
		}
	}
	
	public void searchByName(Employee emp[],String name){
		for(Employee x:emp){
			if(x.getName()==name)
				display(x);
		}
	}

	public void maxByTotalSalary(Employee emp[]){
		float max=emp[0].getTotalSalary();
		for(Employee x:emp){
			if(max < x.getTotalSalary())
				max=x.getTotalSalary();
		}
		for(Employee x:emp){
			if(max==x.getTotalSalary())
				display(x);
		}
	}
}