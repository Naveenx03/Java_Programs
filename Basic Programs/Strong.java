import java.util.*;
class Strong{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int num = n;
		int sum = 0;
		while(n>0){
			sum += (factorial(n%10));
			n/=10;
		}
		if(num == sum){
			System.out.print("Strong");
		}
		else{
			System.out.print("Not Strong");
		}
	}
	static int factorial(int n){
		return (n==0)?1:n*factorial(n-1);
	}
}