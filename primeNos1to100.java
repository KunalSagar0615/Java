public class primeNos1to100 {

	public static void main(String[] args) {
		
		int no,i,flag;
		
		no=1;
		while(no<=100) {
			flag=1;
			
			if(no<=1)
				flag=0;
			else if(no==2 || no==3)
				flag=1;
			else if(no%2==0 || no%3==0)
				flag=0;
			else {
				for(i=5;i<=Math.sqrt(no);i+=6) {
					if(no%i==0 || no%i+2==0)
						flag=0;
				}
			}
			
			if(flag==1)
				System.out.println(no);
			no++;
		}
	}

}
