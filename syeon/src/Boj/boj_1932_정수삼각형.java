package Boj;

import java.util.*;

public class boj_1932_정수삼각형{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int arr[][] = new int[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// int max = arr[0][0];// 7

		int max = 0;
		for (int i = 1; i < a; i++) {
			for (int j = 1; j <= i; j++) {

				if (j == 0) {
					arr[i + 1][0] = arr[i + 1][0] + arr[i][0];
					arr[i + 1][1] = arr[i + 1][1] + arr[i][0];
				}
				if (j == i) {
					arr[i + 1][j] = arr[i + 1][j] + arr[i][j];
					arr[i + 1][j + 1] = arr[i + 1][j + 1] + arr[i][j];
				} else {
					arr[i][j] = arr[i][j] + Math.max(arr[i - 1][j - 1], arr[i - 1][j]);

					
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}

			}
		}
		System.out.println(max);

	}

}