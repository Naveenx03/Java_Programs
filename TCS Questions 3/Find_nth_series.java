import java.util.*;
class Find_nth_series{
	public static void main(String[] args){
		int[] arr = {0,0,7,6,14,12,21,18,28};
		List<Integer> res = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			res.add(arr[i]);
		}
		for(int i=9; i<15; i++){
			if(i%2==0){
				res.add((res.get(i-2)+7));
			}
			else{
				res.add((res.get(i-2)+6));
			}
		}
		System.out.print(res.get(14));

	}
}