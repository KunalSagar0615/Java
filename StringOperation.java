
public class StringOperation{
	
	public static void CountVowelsAndConsonants(String s){
		String alphabets="^[a-zA-Z]$";
		String[] vowels={"a","e","i","o","u"};

		int vcount=0;
		int acount=0;
		for(int i=0;i<s.length();i++){
			String str=""+s.charAt(i);
			if(str.matches(alphabets))
				acount++;
			else
				continue;			

			for(String x: vowels){
				if(x.equalsIgnoreCase(str)){
					vcount++;
				}
			}
		}

		System.out.println("Vowels count= "+vcount+" and consonants= "+(acount-vcount));
		
	}	

	public static void main(String args[]){
		
		CountVowelsAndConsonants("Kunal Ananda Sagar 1234");
	}
}
