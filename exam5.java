package exam6;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int [] number = new int [100];
		int num;
		int count = 0;
		
		System.out.print("정수를 입력하시오: ");
		
		
		for (int i = 0; i < number.length; i++) {
			
			num = sc.nextInt();
			
			if (num != 0) {
				number [i] =+ num;
				count++;
				
				continue;
				
			}
		
			else {
				
				break;
			}
		}
		
		System.out.println();
		
		for (int i = count -1; i >= 0;  i--) {
			
			System.out.print(+ number [i] + " ");
		}
		

		sc.close();
		
		
		
	}
}
