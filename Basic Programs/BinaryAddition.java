import java.util.*;
class BinaryAddition{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		String a = in.next();
		System.out.print("Enter Number: ");
		String b = in.next();
		while(a.length()<b.length()){
			a = "0"+a;
		}
		while(b.length()<a.length()){
			b = "0"+b;
		}
		char carry = '0';
		String sum = "";
		String sol="";
		for(int i=a.length()-1; i>=0; i--){
			char x = a.charAt(i);
			char y = b.charAt(i);
			sol = add(x,y,carry);
			carry = sol.charAt(0);
			sum = sol.charAt(1) + sum;
		}
		if(carry > '0'){
			sum = carry + sum;
		}
		System.out.print(sum);
		in.close();
		
		
	}
	public static String add(char a, char b, char c){
		if(c == '0'){
			if(a=='0' && b=='0'){
				return "00";
			}
			else if(a=='1' && b=='1'){
				return "10";
			}
			else{
				return "01";
			}
				
		}
		else{
			if(a=='0' && b=='0'){
				return "01";
			}
			else if(a=='1' && b=='1'){
				return "11";
			}
			else{
				return "10";
			}
				
		}
	}
}