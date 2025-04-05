import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Factorial");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		System.out.print(factorial(n));
	}
	static int factorial(int n){
		return (n==0)?1:n*factorial(n-1);
	}
}