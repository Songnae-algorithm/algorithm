package SWEA;

import java.util.*;

public class sw2_2005_파스칼의삼각형 {
//12:16 start
	//12:30
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int a = 0; a < in; a++) {

			int N = sc.nextInt();

			int arr[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {

					if (i == j || j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
				}
			}
			System.out.println("#" + (a + 1));
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {

					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		} // in
	}
}
