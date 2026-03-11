import java.util.*;
import java.util.stream.Collectors;
class Demo{
	
	public static void countFrequency(String s){
	
		//char[] arr=s.toCharArray();
		//Set<Character> set=s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
		
		//for(char c:set){
		//	int cnt=0;
		//	for(char x:arr){
		//		if(c==x)
		//			cnt++;
		//	}
		//	System.out.println("Count of "+c+" is: "+cnt);
		//}
		
		Map<Character,Long> map=s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(map);

	}
	
	
	public static void main(String[] args){
	
		countFrequency("asdfghjklkjhdsaasdf");
	
	}
}
