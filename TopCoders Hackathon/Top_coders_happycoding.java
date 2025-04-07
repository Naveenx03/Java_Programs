import java.util.*;
class Top_coders_happycoding{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range: ");
		int m1 = 2;
		int m2 = 5;
		int n = in.nextInt();
		int happy = 0;
		int coding = 0;
		int happycoding = 0;
		for(int i=1; i<=n; i++){
			if(i%m1==0 && i%m2==0){
				System.out.print("HappyCoding");
				happycoding++;
			}
			else if(i%m1==0){
				System.out.print("Happy");
				happy++;
			}
			else if(i%m2==0){
				System.out.print("Coding");
				coding++;
			}
			else{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Happy - "+happy+"\n"+"Coding - "+coding+"\n"+"HappyCoding - "+happycoding);
	}
}