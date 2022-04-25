package exam6;

import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int[][] number = new int [4][3];
		int[][] sum = new int [4][1];
		
		for(int i = 0; i<4; i++) {
			System.out.print((i+1)+"Class? ");
			for(int j = 0; j<3; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i <4; i++) {
			for(int j = 0; j<3; j++) {
				sum[i][0] += number[i][j];
			}
			
			System.out.println((i+1)+"Class? : "+sum[i][0]);
		}

			sc.close();
			
	}

}
