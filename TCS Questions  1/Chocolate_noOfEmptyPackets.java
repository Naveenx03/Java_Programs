import java.util.*;
class Chocolate_noOfEmptyPackets{
	public static void main(String[] args){
		int[] arr = {4,5,0,1,9,0,5,0};
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j] == 0 && arr[j] < arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}

			}
			
		}
		for(int i: arr){
			System.out.print(i);
		}
	}
}