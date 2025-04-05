import java.util.*;
class IndexOfMax{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find index of Maximum 1 holding row in 2D matrix");
		System.out.print("Enter Row: ");
		int m = in.nextInt();
		System.out.print("Enter Column: ");
		int n = in.nextInt();
		int[][] matrix = new int[m][n];
		int index = -1;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		int max = 0;
		for(int i=0; i<m; i++){
			int temp = 0;
			for(int j=0; j<n; j++){
				if(matrix[i][j] == 1){
					temp += 1;
				}
			}
			if(temp>max){
				max = temp;
				index = i;
			}
		}
		System.out.print("The max no of 1 holding row index: "+index);
	}
}