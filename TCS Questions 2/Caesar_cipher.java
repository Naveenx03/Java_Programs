import java.util.*;
class Caesar_cipher{
	public static void main(String[] args){
		String plaintext = "All the best";
		int key = 1;
		String cipher = "";
		for(int i=0; i<plaintext.length(); i++){
			if(plaintext.charAt(i)==' '){
				cipher += ' ';
				continue;
			}
			int temp = plaintext.charAt(i)+key;
			cipher += (char)temp;
		}
		System.out.print(cipher);
		
	}
}
