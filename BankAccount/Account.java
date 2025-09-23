
public class Account{

private int accNo;
private String holderName;

public static final float limit=200000;
public static final float minBalance=5000;

private float balance;
private String mob;
private String address;

public void setAccNo(int accNo){
	this.accNo=accNo;
}

public int getAccNo(){
	return accNo;
}

public void setHolderName(String holderName){
	this.holderName=holderName;
}

public String getName(){
	return holderName;
}

public void setBalance(float balance){
	this.balance=balance;
}

public float getBalance(){
	return balance;
}

public void setMob(String mob){
	this.mob=mob;
}

public String getMob(){
	return mob;
}

public void setAddress(String address){
	this.address=address;
}

public String getAddress(){
	return address;
}

@Override
public String toString(){
	return "Account [No "+accNo+" holder Name "+holderName+" balance "+balance+" mobile number "+mob+" address "+address+"]";
}

}