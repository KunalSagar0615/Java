import java.util.*;
import java.util.stream.Collectors;
class Demo{

	public static String[] convertStringToArr(String s){
		
		String[] arr=new String[s.length()];
		for(int i=0;i<s.length();i++){
			arr[i]=(""+s.charAt(i)).toLowerCase();
		} 

		return arr;
	} 

	public static boolean checkAnagram(String s1,String s2){
		
		List<String> a=Arrays.asList(convertStringToArr(s1)).stream().sorted().collect(Collectors.toList());
		List<String> b=Arrays.asList(convertStringToArr(s2)).stream().sorted().collect(Collectors.toList());

		return a.equals(b);
	}
	
	
	public static void main(String[] args){
	
	System.out.println(checkAnagram("listeN","silent"));
	
	}
}
