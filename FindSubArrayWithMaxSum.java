import java.util.*;
import java.util.stream.Collectors;
class Demo{
	public static int findSum(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}	


		public static void findMax(int arr[]){
		int n=arr.length;
		int max[]=new int[n];

		for(int i=0;i<n;i++){

			for(int j=i;j<n;j++){
			int temp[]=new int[n];

				for(int k=i;k<=j;k++){
					temp[k]=arr[k];
				}
			if(findSum(max)<findSum(temp)){
				for(int x=0;x<temp.length;x++){
					max[x]=temp[x];
				}
			}
				
			}

		}

		for(int x:max){
			if(x!=0)
				System.out.println(x);
		}
	}

	
	public static void main(String[] args){
	findMax(new int[]{-2,-3,4,-1,-2,1,5,-3});
		
	}
}
