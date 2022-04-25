package exam6;

import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			int count = 1;
			int tens = 0;
			
			int [] number = new int [1000];
			int [] number2 = new int [number.length];
			
			System.out.print("정수를 입력하시오: ");
			
			for (int range = 0; range < number.length; range++) {
				num = sc.nextInt();
				
				if (num == 0) {
					
					break;
					
				}
				
				else if (num > 0 && num < 100) {
					
					tens = num/10;
					number [range] = tens;
					count++;
					number2 [tens]++;
					
				}
			
				else {
					
					range--;
					System.out.println("다시 입력하시오.");
					continue;
					
				}
			}
			
			for(tens = 0; tens < 10; tens++) {
				if(number2 [tens] != 0) {
					System.out.println(tens + " : " + number2 [tens]);
				}
					
			}
			
			
	}

}
