
public class RemoveWhiteSpace{
	
	public static String removeSpace(String s){
		String[] arr=s.trim().split(" ");
		
		String str="";
		for(String x:arr){
			if(!(x.trim()==""))
				str+=x;
		}
		return str;
	}

	public static void main(String args[]){
		
		System.out.println(removeSpace("  Kunal 	  Ananda Sagar 1234 atpadi   "));
	}
}
