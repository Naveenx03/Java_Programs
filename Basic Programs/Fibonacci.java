import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Fibonacci series");
		System.out.print("Enter range: ");
		int n = in.nextInt();
		for(int i=0; i<=n; i++){
			System.out.print(fibonacci(i)+" ");
		}
		
	}
	static int fibonacci(int n){
		return (n<=1)? n : fibonacci(n-1)+fibonacci(n-2);
	}
}