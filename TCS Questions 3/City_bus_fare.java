import java.util.*;
class City_bus_fare{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] BusStops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA" };
		int[] Path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
		int dist = 0;
		double fare = 0f;
		System.out.print("Enter start: ");
		String s = in.next().toUpperCase();
		System.out.print("Enter destination: ");
		String d = in.next().toUpperCase();
		int S_index = Arrays.asList(BusStops).indexOf(s);
		int D_index = Arrays.asList(BusStops).indexOf(d);
		int stop = 0;
		boolean flag = false;
		int temp = 0;
		if(s.equals(d) || S_index == -1 || D_index == -1){
			System.out.print("Invalid Input");
		}
		else{
			if(D_index < S_index){
				stop = Path.length-1;
				flag = true;
				temp = D_index;
			}
			else{
				stop = D_index;
			}
			for(int i=S_index+1; i<=stop; i++){
				dist += Path[i];
			}
			if(flag){
				for(int i=0; i<=temp; i++){
					dist += Path[i];
				}
			}
			fare = Math.ceil((dist/1000.00)*5);
			System.out.print(fare+ " INR");

		
		}
		
		


	}
}
