import java.util.*;
class Generating_prime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter inital value: ");
		int n1 = in.nextInt();
		System.out.print("Enter range: ");
		int n2 = in.nextInt();
		if(n1>=n2 || n1<0 || n2<0){
			System.out.println("Provide valid input");
			return;
		}
		while(n1<=n2){
			boolean isPrime = true;
			for(int i=2; i<=n1; i++){
				if(n1%i==0 && i!=n1){
					isPrime = false;
				}
			}
			if(isPrime && n1>1){
				System.out.print(n1+" ");
			}
			n1++;
		}
		in.close();
	}
}