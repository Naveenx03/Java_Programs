import java.util.*;
class Top_coders_winnername{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = in.next().toLowerCase();
		in.close();
		if(name.length()<2){
			System.out.println("Invalid input");
			return;
		}
		char f = name.charAt(0);
		char l = name.charAt(name.length()-1);
		if(f!='b' && f!='l'){
			System.out.println("No");
			return;
		}
		if(l!='e' && l!='r'){
			System.out.println("No");
			return;
		}
		for(int i=1; i<name.length()-1; i++){
			if(name.charAt(i) == 'k'){
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
		
		
		
	}
}