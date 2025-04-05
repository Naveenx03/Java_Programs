import java.util.*;
class Pascal_triangle{
	public static void main(String[] args){
		int n = 5;
		for(int i=0; i<n; i++){
			for(int j = i; j<n; j++){
				System.out.print(" ");
			}
			int count = 1;
			for(int j = 0; j<=i; j++){
				System.out.print(count+" ");
				count = count*(i-j)/(j+1);
			}
			
			System.out.println();
		}
		
	}
}