import java.util.*;
class Top_coders_chess_status{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter nxn board: ");
		int n = in.nextInt();
		if(n<2){
			System.out.println("Invalid input");
			return;
		}
		int[] bishop = new int[2]; 
		int[] queen = new int[2];
		System.out.print("Enter x cordinates for bishop: ");
		bishop[0] = in.nextInt();
		System.out.print("Enter y cordinates for bishop: ");
		bishop[1] = in.nextInt();
		System.out.print("Enter x cordinates for queen: ");
		queen[0] = in.nextInt();
		System.out.print("Enter y cordinates for queen: ");
		queen[1] = in.nextInt();
		if(bishop[0] == queen[0] && bishop[1] == queen[1]){
    			System.out.println("Bishop and Queen cannot be on the same square");
    			return;
		}
		for(int i=0; i<2; i++){
			if(bishop[i] > n || bishop[i] < 0){
				System.out.println("Invalid input");
				return;
			}
			if(queen[i] > n || queen[i] < 0){
				System.out.println("Invalid input");
				return;
			}

		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==bishop[0] && j==bishop[1]){
					System.out.print("B ");
				}
				else if(i==queen[0] && j==queen[1]){
					System.out.print("Q ");
				}
				else{
					System.out.print(check(bishop, queen, i, j)+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	static String check(int[] b, int[] q, int x, int y){
		boolean bishop = false;
		boolean queen = false;
		if(Math.abs(b[0] - x) == Math.abs(b[1] - y)){
			bishop = true;
		}
		if(q[0] == x || q[1] == y || Math.abs(q[0] - x) == Math.abs(q[1] - y)){
			queen = true;
		}
		if(bishop && queen){
			return "%";
		}
		else if(bishop){
			return "*";
		}
		else if(queen){
			return "&";
		}
		else{
			return ".";
		}
	}
}