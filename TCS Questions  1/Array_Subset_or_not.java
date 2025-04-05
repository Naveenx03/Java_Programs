import java.util.*;
class Array_Subset_or_not{
	public static void main(String[] args){
		int a[] = {10, 5, 2, 23, 19};
		int b[] = {19, 5, 3};
		Boolean flag = true;
		for(int i=0; i<b.length; i++){
			for(int j=0; j<a.length; j++){
				if(b[i] == a[j]){
					flag = true;
					break;
				}
				else{
					flag = false;
				}
			}
		}
		System.out.print(flag);
	}
}