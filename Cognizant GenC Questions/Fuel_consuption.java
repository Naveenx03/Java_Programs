import java.util.*;
class Fuel_consuption{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the no of liters to fill the tank: ");
		float diesel = in.nextFloat();
		System.out.print("Enter the distance covered: ");
		float dist = in.nextFloat();
		if(diesel <= 0 || dist <= 0){
			System.out.println("Invalid input");
		}
		else{
			float fuel_km = diesel/dist*100;
			double miles = dist * 0.6214;
			double gallon = diesel * 0.2642;
			double fuel_miles = miles/gallon;
			System.out.printf("%.2f Liters/100km\n", fuel_km);
			System.out.printf("%.2f Miles/gallon\n", fuel_miles);
			
			
		}
    in.close();
	}
}
