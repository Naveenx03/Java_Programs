import java.util.*;
class Find_parking_space{
	public static void main(String[] args){
		int arr[][] = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
		int max = 0;
		int index = -1;
		for(int i=0; i<arr.length; i++){
			int temp = 0;
			for(int j=0; j<arr[0].length; j++){
				if(arr[i][j]==1){
					temp++;
				}
			}
			if(temp>max){
				max = temp;
				index = i+1;
			}
		}
		System.out.print(index);
	}
}