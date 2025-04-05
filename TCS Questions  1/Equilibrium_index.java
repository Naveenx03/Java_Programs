import java.util.*;
class Equilibrium_index{
	public static void main(String[] args){
		int arr[] = {4,2,3,9,3,6};
		Boolean found = false;
		for(int i=0; i<arr.length; i++){
			int Lsum = 0;
			int Rsum = 0;
			for(int j=0; j<i; j++){
				Lsum += arr[j];
			}
			for(int k=i+1; k<arr.length; k++){
				Rsum += arr[k];
			}
			if(Lsum == Rsum){
				found = true;
				System.out.print(i);
				break;
			}
		}
		if(!found){
			System.out.print(-1);
		}
	}
}