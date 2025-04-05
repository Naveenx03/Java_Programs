import java.util.*;
class Vending_machine{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Sub-Menu: ");
		char a = in.next().charAt(0);
		System.out.print("Enter Item No: ");
		int b = in.nextInt()-1;
		System.out.print(vending_machine(a,b));
		
	}
	static String vending_machine(char a, int b){
		String[] coffee = {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"};
		String[] tea = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea","Organic Darjeeling Tea"};
		String[] soup = {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"};		
		String[] beverage = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"};
		String[] items;
		switch(a){
			case 'c': items = coffee; break;
			case 't': items = tea; break;
			case 's': items = soup; break;
			case 'b': items = beverage; break;
			default : return "Invalid Input";
		}
		if(b>=items.length || b<0){
			return "Invalid Input";
		}
		return items[b];
		
	}
}