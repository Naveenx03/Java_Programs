import java.util.*;
class Monkeys_left{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Monkeys: ");
		int n = in.nextInt();
		System.out.print("Monkey's capacity to eat bananas: ");
		int k = in.nextInt();
		System.out.print("Monkey's capacity to eat peanuts: ");
 		int j = in.nextInt();
		System.out.print("Total bananas: ");
		int m = in.nextInt();
		System.out.print("Total peanuts: ");
		int p = in.nextInt();
		if(n < 0 || k <= 0 || j <= 0) {
            		System.out.println("INVALID INPUT");
        	}
		else{
			while(true){
				if(m>=k){
					m-=k;
					n--;
				}
				else if(p>=j){
					p-=j;
					n--;
				}
				else if(m>0 || p>0){
					m = 0;
					p = 0;
					n--;
					break;
				}
				else{
					break;
				}
			}
			System.out.print("Remaining monkeys: "+n);
		}
	}
}