import java.util.*;
class Shift{
	public static void main(String[] args){
		int a = 6;
		int a1 = a;
		a = a>>1;
		a = a<<1;
		if(a==a1){
			System.out.print("Even");
		}
		else{
			System.out.print("Odd");
		}
	}
}