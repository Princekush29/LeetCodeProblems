package programs;
import java.util.Arrays;

public class SortZeroAndOnes {

	public static void main(String[] args) {
		int arr [] ={0,1,1,0,1,0,1,0,1,1,1};
		int arr1 [] ={0,1,1,0,1,0,1,0,1,1,1};
		int temp;
		for(int i=0;i<arr.length;i++){
			for (int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("++++");
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==1){
				for(int j=i+1;j<arr1.length;j++){
					if(arr1[j]==0){
						temp = arr1[i];
						arr1[i]= arr1[j];
						arr1[j]= temp;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}