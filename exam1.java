package exam6;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String [] wordlist = new String [10];
		
		System.out.print("문자를 입력하시오: ");
		
		for(int count = 0; count < wordlist.length; count++) {
			
			wordlist [count] = sc.next();
			
			
		}
		
		System.out.println(wordlist [0] + " " + wordlist [3] + " "  + wordlist [6]);
			 
	
		
	
		sc.close();
			

	}

}
