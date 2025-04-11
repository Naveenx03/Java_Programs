import java.util.*;
class IncrementCalculation{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int n = in.nextInt();
		if(n<=0){
			System.out.println("Invalid input");
			return;
		}
		System.out.print("Enter the Performance appraisal rating");
		float x = in.nextFloat();
		if(x<=0 || x>5){
			System.out.println("Invalid input");
			return;
		}
		if(x<=3){
			System.out.printf("Incremented Salary: %.0f", (n + n*0.10));
		}
		else if(x<=4){
			System.out.printf("Incremented Salary: %.0f", (n + n*0.25));
		}
		else{
			System.out.printf("Incremented Salary: %.0f", (n + n*0.30));
		}
		in.close();
	}
}

