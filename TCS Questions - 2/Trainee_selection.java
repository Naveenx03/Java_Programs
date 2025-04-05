import java.util.*;
class Trainee_selection{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = 3;
		int[][] trainee = new int[n][3];
		int[] selected  = new int[n];
		for(int i=0; i<trainee.length; i++){
			System.out.println("Enter oxygen level for trainee "+ (i+1));
			int temp = 0;
			for(int  j=0; j<trainee[0].length; j++){
				System.out.print("Round " + (j+1) + ":");
				trainee[i][j] = in.nextInt();
				temp += trainee[i][j];
			}
			selected[i] = temp/n;
		}
		int max = -1;
		for(int i=0; i<selected.length; i++){
			if(selected[i] > max){
				max = selected[i];
			}
		}
		String index = "";
		for(int i=0; i<selected.length; i++){
			if(selected[i] == max){
				max = selected[i];
				index += i+1;
			}
		}
		if(max<75){
			System.out.print("All trainees are unfit");
		}
		else{
			for(int i=0; i<index.length(); i++){
				System.out.println("Selected trainee: "+index.charAt(i));
			}
		}
		
		
	}
}