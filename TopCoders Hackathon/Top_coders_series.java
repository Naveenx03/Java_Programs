import java.util.*;
class Top_coders_series{
	static int series(int[] a){
		int n = a.length-1;
		int n1 = a[0];
		int n2 = a[1];
		if(n2-n1 == 2){
			return a[n]+2;
		}
		else if(n2/n1 == 2 && n2%n1==0){
			return a[n]*2;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = in.nextInt();
		}
		int num = series(arr);
		System.out.println("Next series number: "+num);
	}
}