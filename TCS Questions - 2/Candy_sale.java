import java.util.*;
class Candy_sale{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = 10;
		int k = 5;
		while(n>0){
			System.out.print("Enter No.of Candies: ");
		int c = in.nextInt();
		if(c>n){
			System.out.println("INVALID INPUT");
		}
		else{	
			n-=c;
			System.out.println("No of candies sold = "+c);
			System.out.println("No of candies left = "+ n);
			if(n<=k){
				n=10;
			}
		}
		}
	}
}