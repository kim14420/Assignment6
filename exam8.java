package exam6;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][]array1 = new int[2][4];
		int[][]array2 = new int[2][4];
		int[][]mul = new int[2][4];
		
		System.out.println("first Array");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {	
				array1[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("second Array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				array2[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("------------");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				mul[i][j] = array1[i][j] * array2[i][j]; 
				
				System.out.print(mul[i][j]+" "); 
			}
			
			System.out.println();
		}

		sc.close();
	}

}