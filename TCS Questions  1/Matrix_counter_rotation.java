import java.util.*;
class Matrix_counter_rotation{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6};
		int r = 3;
		for(int i=0; i<r; i++){
			int temp = arr[0];
			for(int j=0; j<arr.length; j++){
				if(j != arr.length-1){
					arr[j] = arr[j+1];
				}
				else{
					arr[j] = temp;
				}
				
			}
			
		}
		for(int i: arr){
			System.out.print(i);
		}
	}
}