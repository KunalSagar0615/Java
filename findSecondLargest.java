import java.util.*;
class Demo{
	
	public static Integer findSecondLargest(int[] arr){	

		return Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);		
	}
	
	public static void main(String[] args){
	
	System.out.println(findSecondLargest(new int[]{1,2,5,3,7,8,9}));
	
	}
}
