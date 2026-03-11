class Demo{
	
	public static Boolean checkPalindrome(int no){
	
	int temp=no;
	int sum=0;

	while(no>0){
	int digit=no%10;
	sum=sum*10+digit;
	no/=10;
	}

	return sum==temp;
	}

	public static void main(String[] args){
	if(checkPalindrome(121))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	}

}
