import java.util.*;
class FindPrime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Prime Number");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		if(isPrime(n)){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}

	}
	static Boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}