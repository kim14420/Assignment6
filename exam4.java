package exam6;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		
		double [] number = new double [11];
		
		double sum = 0;
		int sum2 = 0;
		double avg = 0;
	
		
		for (int count = 1; count < number.length; count++) {
			
			number [count] = sc.nextInt();
			
			if (count % 2 == 0) {
				
				sum2 += number [count];
				
				
			}
		
			if (count % 2 != 0) {
				
				sum += number [count];
				
				avg = sum / 5;
			}	
		
			sc.close();
		
		}
	
		System.out.println("sum" + " : " + sum2);
		System.out.println("avg" + " : " + avg);
	

	}

}
