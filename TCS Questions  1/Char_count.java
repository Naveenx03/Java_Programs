import java.util.*;
class Char_count{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Find no of character occurence");
		System.out.print("Enter a String: ");
		String a = in.next();
		System.out.print("Enter a targer character: ");
		String b = in.next();
		int count = 0;
		for(int i=0; i<a.length(); i++){
			for(int j=0; j<b.length(); j++){
				if(a.charAt(i)==b.charAt(j)){
					count++;
				}
			}
		}
		System.out.println("No of occurence: " + count);
		
	}
}