package exam6;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int [] number = new int [10];
		
		int min;
		int num = 0;
		int count = 1;
		
		System.out.print("정수를 입력하시오: ");
		
		for (int range = 0; range < number.length; range++) {
			num = sc.nextInt();
		
			if (num < 1000) {
				
				number [range] = num;
				count++;
				
			}
		
			else {
				
				range--;
				System.out.print("다시 입력하시오.");
				continue;
			}
		}
	
		min = number[0];
		for (int range = 0; range < number.length; range++) {
			if (min > number[range]) {
				
				min = number[range];
			}
		}
		System.out.println();
		System.out.println("결과 " + min);
		
		sc.close();
	}

}
