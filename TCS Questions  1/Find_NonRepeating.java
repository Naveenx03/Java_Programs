import java.util.*;
class Find_NonRepeating{
	public static void main(String[] args){
		int[] arr = {9, 4, 9, 6, 7, 4};
		for(int i=0; i<arr.length; i++){
			Boolean flag = true;
			for(int j=0; j<arr.length; j++){
				if(i==j){
					continue;
				}
				else if(arr[i] == arr[j]){
					flag = false;
				}
			}
			if(flag){
				System.out.print(arr[i]);
				break;
			}
			
		}
	}
}