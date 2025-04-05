import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Reverse a number");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		System.out.print("Reversed number: ");
		while(n>0){
			System.out.print(n%10);
			n/=10;
		}
	}
}