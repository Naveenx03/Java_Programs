import java.util.*;
class Guest_in_cruise{
	public static void main(String[] args){
		int T = 5;
		int E[] = {7,0,5,1,3};
		int L[] = {1,2,1,3,4};
		int guest = 0;
		int max = 0;
		for(int i=0; i<E.length; i++){
			guest += E[i];
			guest -= L[i];
			if(guest > max){
				max = guest;
			}
		}
		System.out.print(max);
		
	}
}