import java.util.*;
class Top_coders_validchain{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		while(true){
			String s = in.next();
			if(s.equals("#")){
				break;
			}
			arr.add(s);
		}
		if(arr.size() == 0){
			System.out.println("Invalid input");
			return;
		}
		String temp = arr.get(0).toLowerCase();
		char c = temp.charAt(temp.length()-1);
		System.out.print(arr.get(0));
		if(arr.size()==1){
			return;
		}
		for(int i=1; i<arr.size(); i++){
			String a = arr.get(i).toLowerCase();
			if(a.charAt(0)!=c){
				break;
			}
			System.out.print(" "+arr.get(i));
			c = a.charAt(a.length()-1);
		
		}
		
		
	}
}