import java.util.*;
import java.util.stream.Collectors;
class Demo{
	
	public static int[] rotateRightByPos(int[] arr,int n){

		int x=0;
		int len=arr.length;
		int result[]=new int[len];
		
		
		for(int i=len-n;i<len;i++){
			result[x++]=arr[i];
		}

		for(int i=0;i<len-n;i++){
			result[x++]=arr[i];
		}

		return result;
	
	}

	
	public static void main(String[] args){
	
		int[] res = rotateRightByPos(new int[]{1,2,3,4,5,6,7,8,9},2);

		System.out.println(Arrays.toString(res));
	}
}
