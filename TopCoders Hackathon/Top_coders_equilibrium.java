import java.util.*;
class Top_coders_equilibrium{
	static int equilibrium(int[] a){
		int n = a.length;
		for(int i=0; i<n; i++){
			int l = 1;
			int r = 1;
			for(int j=0; j<i; j++){
				l *= a[j];
			}
			for(int k=i; k<n; k++){
				r *= a[k];
			}
			if(l==r){
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = in.nextInt();
		if(n<=0){
			System.out.println("Invalid input");
			return;
		}
		int[] arr = new int[n];
		System.out.println("Enter only 1 or 8");
		for(int i=0; i<n; i++){
			int temp = in.nextInt();
			if(temp == 1 || temp == 8){
				arr[i] = temp;	
			}
			else{
				System.out.println("Invalid input");
				return;
			}
			
		}
		int res = equilibrium(arr);
		if(res == -1){
			System.out.println("No equilibrium");
			return;
		}
		System.out.println("Equilibrium index = "+res);
	}
}
