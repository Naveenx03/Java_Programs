import java.util.*;
class Bitwise_Swap{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print(a+" "+b);
	}
}