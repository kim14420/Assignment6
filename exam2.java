package exam6;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		

		System.out.print("몸무게를 입력하시오: ");
		
		double weight [] = new double [6];
		double sum = 0;
		int count = 0;
		
		for(count = 0; count < weight.length; count++) {
			
			weight[count] = in.nextDouble();
		
			sum += weight[count] ;
		
			in.close();
		
		}
		
		System.out.println(Math.round((sum / count))*10/10.0);
		
		
	
		
	}

}
