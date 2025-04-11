import java.util.*;
class Find_season{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int n = in.nextInt();
		if(n>12 || n<1){
			System.out.println("Invalid month");
		}
		else if(n>11 || n<3){
			System.out.println("Winter");
		}
		else if(n>2 && n<6){
			System.out.println("Spring");
		}
		else if (n>5 && n<9){
			System.out.println("Summer");
		}
		else if(n>8 && n<12){
			System.out.println("Autumn");
		}
	}
}