import java.util.*;
import java.util.stream.Collectors;
class Demo{
	public static boolean findArrayIsPalindrome(int arr[]){
	int temp[]=new int[arr.length];

		int index=0;
		for(int i=arr.length-1;i>=0;i--){
			temp[index++]=arr[i];
		}	

		for(int i=0;i<arr.length;i++){
			if(temp[i]!=arr[i])
				return false;
		}	

		return true;	
	}

	public static void main(String[] args){
			System.out.println(findArrayIsPalindrome(new int[]{1,2,3,2,1}));
	}
}
