import java.util.*;
class Lcm{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find LCM");
		System.out.print("Enter num1: ");
		int a = in.nextInt();
		System.out.print("Enter num2: ");
		int b = in.nextInt();
		int gcd = gcd(a,b);
		int lcm = a*b/gcd;
		System.out.println("LCM: "+lcm);
		
	}
	static int gcd(int a, int b){
		return (b==0)? a : gcd(b,a%b);
	}
}