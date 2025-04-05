import java.util.*;
class DecToOctal{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Decimal to octal converter");
		System.out.print("Enter Decimal: ");
		int dec = in.nextInt();
		System.out.print("Octal = ");
		System.out.print(decToOctal(dec));
		
	}
	static StringBuilder decToOctal(int n){
		StringBuilder octal = new StringBuilder();
		while(n>0){
			octal.insert(0,n%8);
			n/=8;
		}
		return octal;
	}
}