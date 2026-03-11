import java.util.*;
import java.util.stream.Collectors;
class Demo{
	
	public static int[] rotateLeftByPos(int[] arr,int n){ //left
		int[] result=new int[arr.length];

		for(int i=n;i<arr.length;i++){			
			result[i-n]=arr[i];
		}

		for(int i=0;i<n;i++){
			result[i+1+n]=arr[i];
		}

		return result;
					
	}

 //  public static int[] rotateByPos(int[] arr,int n){ //left
	// 	int[] result=new int[arr.length];
	// 	int x=0;

	// 	for(int i=n;i<arr.length;i++){			
	// 		result[x++]=arr[i];
	// 	}

	// 	for(int i=0;i<n;i++){
	// 		result[x++]=arr[i];
	// 	}

	// 	return result;
					
	// }

	

	
	public static void main(String[] args){
	
		int[] res = rotateByPos(new int[]{1,2,3,4,5},2);

		System.out.println(Arrays.toString(res));
	}
}
