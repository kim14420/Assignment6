package exam6;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [4][2];

		int sum = 0, count = 1;
		int avg_sum = 0;
		int all_sum = 0;

		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				all_sum += arr[i][j];
			}
			count++;
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			sum = 0;
			for(int j = 0; j < arr[i].length; j ++) {
				sum += arr[i][j];
			}
			System.out.print(sum/2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i<arr[i].length; i++) {
			sum = 0;
			for(int j= 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.print(sum/4 + " ");
		}
		System.out.println();
		System.out.println(all_sum/8);
		
		
		
	}

}
