import java.util.*;
class Factorial{
	public static void main(String[] args){
		System.out.println("Find Factorial without using * and /");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++){
			int temp = 0;
			for(int j=1; j<=i; j++){
				temp +=fact;
			}
			fact = temp;
		}
		System.out.print(fact);
	}
}
