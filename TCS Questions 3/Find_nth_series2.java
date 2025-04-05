import java.util.*;
class Find_nth_series2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<Integer> res = new ArrayList<>();
		System.out.print("Enter Range: ");
		int range = in.nextInt();
		int n1 = 0;
		int n2 = 0;
		for(int i=0; i<range; i++){
			if(i%2==0){
				res.add(n1);
				n1 +=2;
			}
			else{
				res.add(n2);
				n2 = n1/2;
			}
		}
		System.out.print(res.get(range-1));
		
	}
}