import java.util.*;
class Scheme_comission{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter parent member: ");
		String p = in.next();
		System.out.print("Do have member? Y/N: ");
		String x = in.next().toUpperCase(); 
		int amount = 5000;
		if(x.equals("Y")){
			System.out.print("Enter members: ");
			String c = in.next();
			String[] mem = c.split(",");
			System.out.println("Total members: "+(mem.length+1));
			System.out.println("Comission detail");
			System.out.println(p +" : " + ((amount*10/100)*mem.length)+" INR");
			for(int i=0; i<mem.length; i++){
				System.out.println(mem[i] +" : " + (amount*5/100)+" INR");
			}
	
			
		}
		else{
			System.out.println("Total members: 1");
			System.out.println("Comission detail");
			System.out.println(p +" : " + (amount*5/100)+" INR");
		}
		
	}
}