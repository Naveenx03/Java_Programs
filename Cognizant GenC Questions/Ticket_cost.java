import java.util.Scanner;
class Ticket_cost{
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		double cost = 0;
		int ref = 0;
		System.out.print("Enter no.of tickets: ");
		int n = in.nextInt();
		if(n<5 || n>40){
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			return;
		}
		System.out.print("Do you want refreshments? Y/N: ");
		char r = in.next().toUpperCase().charAt(0);
		if(r=='Y'){
			ref = 50*n;
		}
		else if(r!='N'){
			System.out.println("Invalid input");
			return;
		}
		System.out.print("Do you have any coupan code Y/N: ");
		char c = in.next().toUpperCase().charAt(0);
		if(c!='Y' && c!='N'){
			System.out.println("Invalid input");
			return;
		}
		System.out.print("Enter the circle ( K or Q ): ");
		char circle = in.next().toUpperCase().charAt(0);
		if(circle == 'K'){
			cost = n*75;
		}
		else if(circle == 'Q'){
			cost = n*150;
		}
		else{
			System.out.println("Invalid input");
			return;
		}
		if(n>20){
			cost *= 0.90;
		}
		if(c=='Y'){
			cost *= 0.98;
		}
		System.out.printf("Ticket cost: %.2f",(cost+ref));
		in.close();
	}
}