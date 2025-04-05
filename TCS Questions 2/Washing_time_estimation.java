import java.util.*;
class Washing_time_estimation{
	static void time_estimation(int l){
		if(l<0){
			System.out.print("Invalid Input");
		}
	 	else if(l>7000){
			System.out.print("OverLoaded");
		}
		else if (l==0){
			System.out.print("Estimated time: "+0+ " Minutes");
		}
		else if(l<=2000){
			System.out.print("Estimated time: "+25+ " Minutes");
		}
		else if(l<=4000){
			System.out.print("Estimated time: "+35+ " Minutes");
		}
		else{
			System.out.print("Estimated time: "+45+ " Minutes");
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Load: ");
		int l = in.nextInt();
		time_estimation(l);	
	}
}