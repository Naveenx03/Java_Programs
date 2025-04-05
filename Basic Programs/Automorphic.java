import java.util.*;
class Automorphic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int sq = n*n;
		in.close();
		while(n>0){
			if(sq%10 != n%10){
				System.out.print("Not Automorphic");
				break;
			}
			n/=10;
			sq/=10;
		}
		if(n==0){
			System.out.print("Automorphic");
		}
	}
	
}
