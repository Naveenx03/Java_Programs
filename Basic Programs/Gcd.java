import java.util.*;
class Gcd{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find GCD");
		System.out.print("Enter num1: ");
		int a = in.nextInt();
		System.out.print("Enter num2: ");
		int b = in.nextInt();
		System.out.print("GCD: "+gcd(a,b));
		
	}
	static int gcd(int a, int b){
		return (b==0)? a : gcd(b,a%b);
	}
}