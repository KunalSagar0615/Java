
public class StringOperation{
	
	public static int CountWords(String s){
		String[] arr=s.trim().split(" ");
		
		int cnt=0;
		for(String x:arr){
			if(!(x.trim()==""))
				cnt++;
		}
		return cnt;
	}

	public static void main(String args[]){
		
		System.out.println(CountWords("  Kunal 	  Ananda Sagar 1234 atpadi   "));
	}
}
