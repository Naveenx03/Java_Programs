import java.util.*;
class Neon{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sq = n*n;
		int sum = 0;
		while(sq>0){
			sum += sq%10;
			sq /= 10;
		}
		if(sum == n){
			System.out.print("Neon");
		}
		else{
			System.out.print("Not Neon");
		}
		in.close();
		
		
	}
}