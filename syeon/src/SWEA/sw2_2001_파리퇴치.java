package SWEA;

import java.util.*;

public class sw2_2001_파리퇴치 {
	// 12;32 start
	//1:02 fin
	//다 해놓고 변수를 max를 static 으로 해가지고 값에러났던 문제.....
	//주의합시다
	
	static int arr[][];

	static int N;
	static int M;

	private static int cnt(int x, int y, int max) {

		int sum = 0;

		for (int i = x; i < x + M; i++) {
			for (int j = y; j < y + M; j++) {
				sum += arr[i][j];
			}
		}
		max = Math.max(max, sum);
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int a = 1; a <= in; a++) {

			N = sc.nextInt();
			M = sc.nextInt();

			arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();

				}
			}

			int max = Integer.MIN_VALUE;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					max = cnt(i, j, max);
				}
			}
			System.out.println("#" + a + " " + max);

		} // in
	}

}
