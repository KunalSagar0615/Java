import java.util.*;
import java.util.stream.Collectors;
class Demo{

	public static Set<Integer> removeDuplicate(int[] arr){
	
		//List<Integer> lst=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList()); 
		//return lst;

    //alternative
		Set<Integer> set=Arrays.stream(arr).boxed().collect(Collectors.toSet());
		return set;
	} 	
	
	public static void main(String[] args){
	
	System.out.println(removeDuplicate(new int[]{2,4,5,2,6,8,9,0,0,4,5}));
	
	}
}
