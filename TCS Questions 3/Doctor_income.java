import java.util.*;
class Doctor_income{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<Integer> patients = new ArrayList<>();
		int income = 0;
		boolean flag = true;
		for(int i=0; i<20; i++){
			String temp = in.nextLine();
			if(temp.isEmpty()){
				break;
			}
			int x = Integer.parseInt(temp);
			if(x >= 120  || x <= 0){
				System.out.print("Invalid Input");
				flag = false;
				break;
			}
			else{
				patients.add(x);
			}
		}
		
		if(flag){
			for(int age: patients){
				if(age<17){
					income+=200;
				}
				else if(age<40){
					income+=400;
				}
				else{
					income+=300;
				}
			}
		}
		System.out.print("Doctor's income: "+income+" INR");


		
		
	}
}