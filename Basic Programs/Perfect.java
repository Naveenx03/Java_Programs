import java.util.*;
class Perfect{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Perfect number");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		if(perfect(n)){
		System.out.print("Perfect");
		}
		else{
		System.out.print("Not Perfect");
		}
	}
	static Boolean perfect(int n){
		int sum = 0;
		for(int i=1; i<=n/2; i++){
			if(n%i==0){
				sum += i;
			}	
		}
		if(n!=sum){
			return false;
		}
		return true;
	}
}
		
