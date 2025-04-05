import java.util.*;
class NoOfDigits{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find number of digits");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int count = 0;
		while(n>0){
			n/=10;
			count++;
		}
		System.out.println("Number of digits: "+count);
		
		
	}
}