import java.util.*;
class Make_valid_string{
	public static void main(String[] args){
		String s = "***###";
		int count_star = 0;
		int count_hash = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='*'){
				count_star++;
			}
			else if(s.charAt(i)=='#'){
				count_hash++;
			}
		}
		System.out.print(count_star - count_hash);
	}
}