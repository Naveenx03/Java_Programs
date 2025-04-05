import java.util.*;
class Hex_addition{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		String a = in.next();
		System.out.print("Enter Number: ");
		String b = in.next();
		while(a.length() != b.length()){
			if(a.length()>b.length()){
				b = 0 + b;
			}
			else{
				a = 0 + a;
			}
		}
		char carry = '0';
		String sum = "";
		for(int i= a.length()-1; i>=0; i--){
			char[] s = add(a.charAt(i),b.charAt(i),carry);
			sum = s[0] + sum;
			carry = s[1];
		}
		if(carry != '0'){
			sum = carry + sum;
		}
		System.out.print(sum);
			
	}
	static char[] add(char n1, char n2, char c){
		String hex = "0123456789ABCDEF";
		int s = hex.indexOf(n1)+hex.indexOf(n2) + c-'0';
		char[] sum = new char[2];
		sum[0] =hex.charAt(s%16);
		sum[1] =hex.charAt(s/16);
		return sum;
	}
		
}