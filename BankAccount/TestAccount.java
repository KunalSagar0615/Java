import java.util.Scanner;

public class TestAccount{

public static void main(String args[]){

	int n,ch,loc,result,amt;
	String holderName,mob,accNo,address;
	float balance;

	Scanner sc=new Scanner(System.in);

	Account account[]=new Account[100];
	AccountService accserv=new AccountService();

	n=0;

	while(true){
	System.out.println("""
		1. Create Account
		2. Display All Account Details
		3. Deposite
		4. Withdrow
		5. Search By Account Number
		6. Check Balance
		7. Close Account
		8. Update Account
		9. EXIT
		Enter a Choice :
	""");
	ch=sc.nextInt();
	switch(ch){
	case 1:
		accserv.accept(account,n);
		n++;
		break;

	case 2:
		accserv.display(account,n);
		break;

	case 3:
		System.out.println("Enter amount :");
		amt=sc.nextInt();
		System.out.println("Enter account number");
		int accno=sc.nextInt();
		result=accserv.deposit(account,n,accno,amt);
		loc=accserv.search(account,n,accno);
		if(result==1)
			System.out.println("Invalid account number");
		else if(result==2){
			System.out.println("Amount exeeds limit");
			System.out.println("Amount must be less than"+(Account.limit-account[loc].getBalance()));
		}
		else
			System.out.println("Deposited successfully");
		break;

	case 4:
		System.out.println("Enter account number");
		accno=sc.nextInt();
		System.out.println("Enter amount :");
		amt=sc.nextInt();
		result=accserv.withdraw(account,n,accno,amt);
		loc = accserv.search(account,n,accno);
		if(result==1)
			System.out.println("Invalid amount");
		else if(result==2)
			System.out.println("Invalid account number");
		else if(result==3){
			System.out.println("Minimum balance must be required in account");
			System.out.println("you can withdraw only  "+(account[loc].getBalance()-Account.minBalance));
		}
		else
			System.out.println("cash withdraw sucessfull");
		break;

	case 5:
		System.out.println("Enter account no :");
		accno=sc.nextInt();
		loc = accserv.search(account,n,accno);
		if(loc<0)
			System.out.println("Account not found");
		else
			accserv.display(account,loc);
		break;

	case 6:
		System.out.println("Enter account number");
		accno=sc.nextInt();
		loc = accserv.search(account,n,accno);
		if(loc<0)
			System.out.println("Account found");
		else
			System.out.println("Current balance :"+account[loc].getBalance());
		break;

	case 7:
		System.out.println("Enter account number");
		accno=sc.nextInt();
		loc = accserv.search(account,n,accno);
		if(loc<0)
			System.out.println("Account found");
		else{
			accserv.closeAccount(account,n,loc);
			n--;
			System.out.println("account closed successfully");
			}
		break;

	case 8:
		while(true){
		System.out.println("""
		1.Name
		2.Number
		3.Address
		Enter your choice :
		""");
		ch=sc.nextInt();
		
		System.out.println("Enter your account number :");
		accno=sc.nextInt();
		loc = accserv.search(account,n,accno);
		if(loc<0){
			System.out.println("Account not found");
			continue;
		}
		boolean isUpdate=false;
		switch(ch){
		case 1:
			System.out.println("Enter new name :");
			holderName=sc.next();
			account[loc].setHolderName(holderName);
			System.out.println("Name updated successfully");
			isUpdate=true;
			break;
		case 2:
			System.out.println("Enter number :");
			mob=sc.next();
			mob=accserv.validMob(mob);
			account[loc].setMob(mob);
			System.out.println("Number updated successfully");
			isUpdate=true;
			break;
		case 3:
			System.out.println("Enter new address:");
			address=sc.next();
			account[loc].setAddress(address);
			System.out.println("Adress updated successfully");
			isUpdate=true;
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		if(isUpdate)
			break;
		}
		break;

	case 9:
		System.exit(0);

	default:
		System.out.println("Invalid choice");

		}
	}	
}
}