import java.util.*;
class Octal_addition{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n1 = in.nextInt();
		System.out.print("Enter Number: ");
		int n2 = in.nextInt();
		int carry = 0;
		String sum = "";
		while(n1>0||n2>0||carry>0){
			int[] s = add(n1%10,n2%10,carry);
			sum = s[0] + sum;
			carry = s[1];
			n1/=10;
			n2/=10;
		}
		System.out.print(sum);
			
	}
	static int[] add(int n1, int n2, int c){
		int[] sum = new int[2];
		int s = n1 + n2 + c;
		sum[0] = s%8;
		sum[1] = s/8;
		return sum;
	}
		
}