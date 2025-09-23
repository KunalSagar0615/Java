
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AccountService{

public static int accNo=100001;
int loc;
public void accept(Account acc[], int n){
	String holderName;
	float balance;
	String mob;
	String address;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter holder Name:");
	holderName=sc.next();
	
	while(true){
	System.out.println("Enter balance :");
	balance=sc.nextFloat();
	
	if(!(balance>=Account.minBalance && balance<=Account.limit))
		System.out.println("Balance must be between"+Account.minBalance+" and "+Account.limit);
	else
		break;
	}

	System.out.println("Enter mobile number :");
	mob=sc.next();
	mob=validMob(mob);

	System.out.println("Enter address :");
	address=sc.next();

	Account temp=new Account();
	temp.setAccNo(accNo++);
	temp.setHolderName(holderName);
	temp.setBalance(balance);
	temp.setMob(mob);
	temp.setAddress(address);

	acc[n]=temp;
}
public String validMob(String mob){
Scanner sc=new Scanner(System.in);
while(true){
	if(mob.length()==10){
		boolean flag=true;
		for(int i=0;i<mob.length();i++){
			if(!Character.isDigit(mob.charAt(i))){
				flag=false;
				break;
			}
		}
		if(flag)
			break;
	}
	System.out.println("Invalid mobile number");
	System.out.println("Enter mobile number :");
	mob=sc.next();
	}
	return mob;
}

public void display(Account account[],int n){
	for(int i=0;i<n;i++)
		System.out.println(account[i]);
}

public int withdraw(Account account[],int n,int accNo,int amt){
	if(amt<=0 || amt>=Account.limit) {
		return 1;
	}
	loc = search(account, n, accNo);
	if(loc == -1)
		return 2;
	if((account[loc].getBalance()-amt) < Account.minBalance)
		return 3;

	account[loc].setBalance(account[loc].getBalance()-amt);
	return 0;
}

public int search(Account account[],int n,int accNo){
	for(int i=0;i<n;i++){
	if(account[i].getAccNo()==accNo)
		return i;
	}
	return -1;
}

public int deposit(Account account[],int n,int accNo,int amt){
	loc=search(account,n,accNo);
	if(loc<0)
		return 1;
	if(account[loc].getBalance()+amt>Account.limit)
		return 2;
	
	account[loc].setBalance(account[loc].getBalance()+amt);
	return 0;
}

public void closeAccount(Account account[],int n,int loc){
	for(int i=loc;i<n;i++)
		account[i]=account[i+1];
}
}