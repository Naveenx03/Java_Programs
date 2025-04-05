import java.util.*;
class Find_odd_baloons{
	public static void main(String[] args){
		char b[] = "rggdgg".toCharArray();
		boolean flag = false;
		String s = "";
		for(int i=0; i<b.length; i++){
			if(s.contains(String.valueOf(b[i]))){
				continue;
			}
			s+=b[i];
			int count = 0;
			for(int j=0; j<b.length; j++){
				if(b[i]==b[j]){
					count++;
				}
			}
			if(count%2 != 0){
				System.out.print(b[i]);
				flag = true;
			}
		}
		if(!flag){
			System.out.print("All are even");
		} 
		
	}
}