import java.util.*;
class Cost_of_painting{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter No.of Interior walls: ");
		int interior = in.nextInt();
		System.out.print("Enter No.of Exterior walls: ");
		int exterior = in.nextInt();
		float cost = 0f;
		for(int i=0; i<interior; i++){
			System.out.print("Square feet of wall "+(i+1)+": ");
			float temp = in.nextFloat();
			cost += temp*18;
		}
		for(int i=0; i<exterior; i++){
			System.out.print("Square feet of wall "+(i+1)+": ");
			float temp = in.nextFloat();
			cost += temp*12;
		}
		System.out.print("Total cost for painting: "+(String.format("%.1f", cost))+" INR");
		
	}
}