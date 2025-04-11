import java.util.*;
class Search_course{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no.of course: ");
		int n = in.nextInt();
		in.nextLine();
		if(n>20){
			System.out.println("Max 20 courses");
			return;
		}
		else if(n<=0){
			System.out.println("Invalid range");
			return;
		}
		List<String> c = new ArrayList<>();
		System.out.println("Enter courses");
		for(int i=0; i<n; i++){
			c.add(in.nextLine().toLowerCase());
		}
		System.out.print("Enter course to search: ");
		String s = in.nextLine();
		if(c.contains(s.toLowerCase())){
			System.out.println(s+" course is available!");
		}
		else{
			System.out.println(s+" course is not available!");
		}
		in.close();
	}
}