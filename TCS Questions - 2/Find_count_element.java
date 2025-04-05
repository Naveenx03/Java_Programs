import java.util.*;
class Find_count_element{
	public static void main(String[] args){
		int Arr[]={7,4,8,2,9};
		int count = 1;
		for(int i=0; i<Arr.length-1; i++){
			if(Arr[i] < Arr[i+1]){
				count++;
			}
		}
		System.out.print(count);

	}
}