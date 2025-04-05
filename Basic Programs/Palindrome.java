import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Check palindrome");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int num = n;
		int reversed = 0;
		while(n>0){
			reversed = reversed*10 + n%10;
			n/=10;
		}
		if(num == reversed){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}