import java.util.*;
class Magic_board{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] num = new int[4];
		System.out.println("Enter Four Numbers");
		for(int i=0; i<num.length; i++){
			num[i] = in.nextInt();
		}
		System.out.println();
		for(int i=0; i<num.length; i++){
			char c = (char)num[i];
			System.out.println(num[i]+" - "+c);
		}
		in.close();

	}
}
