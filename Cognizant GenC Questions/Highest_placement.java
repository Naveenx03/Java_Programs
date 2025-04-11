import java.util.*;
class Highest_placement{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] dept = {"CSE","ECE","MECH"};
		int[] students = new int[3];
		int max = 0;
		String index = "";
		boolean flag = true;
		for(int i=0; i<students.length; i++){
			System.out.print("Enter the no of students placed in "+dept[i]+": ");
			students[i] = in.nextInt();
			if(students[i] < 0){
				flag = false;
				break;
			}
			if(students[i] > max){
				max = students[i];
			}
		}
		for(int i=0; i<students.length; i++){
			if(students[i]==max){
				index += i;
			}
		}
		if(flag){
			if(index.length()==dept.length){
				System.out.println("None of the department has got the highest placement");

			}
			else{
				System.out.println("Hightest placement");
				for(int i=0; i<=index.length()-1; i++){
					System.out.println(dept[index.charAt(i)-'0']);
				}
			}
		}
		else{
			System.out.println("Invalid input");
		}
		
		
	}
}



