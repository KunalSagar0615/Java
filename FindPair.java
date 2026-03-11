import java.util.*;
import java.util.stream.Collectors;
class Demo{
	
	public static void findPair(int arr[],int no){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(no==(arr[i]+arr[j]))
					System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}

	
	public static void main(String[] args){
	findPair(new int[]{1,2,3,4,5,6,7,8,9},4);
		
	}
}
