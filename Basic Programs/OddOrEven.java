import java.util.*;
class OddOrEven{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Odd or Even");
		System.out.print("Enter number: ");
		int n = in.nextInt();
		if(n%2==0){
			System.out.print("Even");
		}
		else{
			System.out.print("Odd");
		}
	}
}