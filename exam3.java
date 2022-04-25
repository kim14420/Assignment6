package exam6;

import java.util.ArrayList;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("반을 입력하시오: ");
		
		ArrayList<Double> score = new ArrayList<>();

		score.add (85.6);
		score.add (79.5);
		score.add (83.1);
		score.add (80.0);
		score.add (78.2);
		score.add (75.0);
		
		double sum = 0.0;
		
		int class1 = sc.nextInt() -1;
		int class2 = sc.nextInt() -1;
	
		sum = score.get(class1) + score.get(class2);
			
		System.out.println();
		
		System.out.println(sum);
		
		
		sc.close();
		
	}

}
