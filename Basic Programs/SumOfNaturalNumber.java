import java.util.*;
class SumOfNaturalNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Sum of N Natural Numbers");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int sum = n*(n+1)/2;
		System.out.print(sum);
		in.close();
		
		
	}
}