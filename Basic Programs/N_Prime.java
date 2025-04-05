import java.util.*;
class N_Prime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find N number of Prime between the range");
		System.out.print("Enter Range: ");
		int n = in.nextInt();
		for(int i=0; i<=n; i++){
			Prime(i);
		}
		
		in.close();
		
		
	}
	static void Prime(int n){
		Boolean isPrime = true;
		if(n<2){
			isPrime = false;
		}
		for(int i=2; i<n; i++){
			if(n%i==0){
				isPrime = false;
			}
		}
		if(isPrime){
			System.out.print(n+" ");
		}
	}
}