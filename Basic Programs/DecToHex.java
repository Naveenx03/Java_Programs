import java.util.*;
class DecToHex{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(hex(n));
	}
	static StringBuilder hex(int n){
		char[] hex_values = "0123456789ABCDEF".toCharArray();
		StringBuilder hex = new StringBuilder();
		while(n>0){
			hex.insert(0,hex_values[n%16]);
			n/=16;
		}
		return hex;
	}
}