import java.util.*;
class No_of_vehicle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("To find combination of two-wheelers and four-wheelers exists");
		System.out.print("Enter total no of Vehicles: ");
		int v = in.nextInt();
		System.out.print("Enter total no of Wheels: ");
		int w = in.nextInt();
		int twoWheeler = w/2;
		int fourWheeler = 0;
		Boolean found = false;
		while(twoWheeler > 0){
			twoWheeler -= 2;
			fourWheeler++;
			if(twoWheeler + fourWheeler == v){
				found = true;
				break;
			}
		}
		if(found){
			System.out.println(twoWheeler + " " + fourWheeler);
		}
		else{
			System.out.print(-1 + " " + -1);
		}
	}
}