import java.util.*;
class Prime_or_not{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = in.nextInt();
		System.out.println(check(n));
	}
	static String check(int n){
		if(n<0){
			return "please enter the positive number";
		}
		else{
			String res = prime(n);
			return res;
		}
	}
	static String prime(int n){
		if(n<2){
			return "Not prime";
		}
		for(int i=2; i<n; i++){
			if(n%i==0){
				return "Not prime";	
			}
		}
		return "Prime";
	}
}