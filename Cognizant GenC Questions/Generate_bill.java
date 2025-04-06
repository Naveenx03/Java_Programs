import java.util.*;
class Generate_bill{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int bill = 0;
		String[] items = {"Pizzas", "Puffs", "Cooldrinks"};
		int[] cost = {100, 20, 10};
		int[] nos = new int[items.length];
		for(int i=0; i<items.length; i++){
			System.out.print("Enter the no of "+items[i]+" bought: ");
			nos[i] = in.nextInt();
			bill += nos[i] * cost[i];
		}
		for(int i=0; i<items.length; i++){
			if(nos[i] == 0){
				continue;
			}
			System.out.println("No of "+items[i]+" : "+ nos[i]);
		}
		System.out.println("Total price = "+bill +"\n"+"ENJOY THE SHOW!!!");
		in.close();

	}
}
