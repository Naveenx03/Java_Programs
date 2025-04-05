import java.util.*;
class Good{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find Good Number");
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int num = n;
		int sum = 0;
		while(n>0){
			sum += n%10;
			n/=10;
		}
		if(num%sum==0){
			System.out.print("Good Number");
		}
		else{
			System.out.print("Bad Number");
		}
		
		
	}
}