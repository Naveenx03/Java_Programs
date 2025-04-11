import java.util.*;
class Palindrome_game{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n1 = in.nextLong();
		if(n1<0){
			System.out.println("Invalid input");
			return;
		}
		long temp = n1;
		long n2 = 0;
		while(temp>0){
			n2 = temp%10 + n2*10;
			temp/=10;
		}
		if(n1==n2){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindorme");
		}
		in.close();
	}
}