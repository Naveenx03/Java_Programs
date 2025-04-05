import java.util.*;
class SumOfDigits{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find sum of digits");
		System.out.println("Enter Number: ");
		int n = in.nextInt();
		int sum = 0;
		while(n>0){
			sum += n%10;
			n/=10;
		}
		System.out.println("Sum of digits: "+sum);
		
		
	}
}