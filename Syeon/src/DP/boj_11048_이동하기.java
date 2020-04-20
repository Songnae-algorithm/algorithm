package DP;

import java.util.*;

//20200402 18:34 start 
//정수삼각형이랑 비슷한 문줴...
public class boj_11048_이동하기 {

	static int a;
	static int b;

	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		arr = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}

		}

		// 0행은 받아올 값이 자신의 왼쪽에 있는 값들 뿐 
		for (int i = 1; i < b; i++) {
			arr[0][i] = arr[0][i - 1] + arr[0][i];
		} // 0열은 앞에 받아올 값이 자신의 위에있는 열들 뿐이라 이렇게해주기
		for (int i = 1; i < a; i++) {
			arr[i][0] = arr[i - 1][0] + arr[i][0];
		}
		//1행,열 부터는 자신의 위, 왼쪽, 대각선 위 중에서 젤 큰 값을 받아옴
		for (int i = 1; i < a; i++) {
			for (int j = 1; j < b; j++) {
				arr[i][j] = arr[i][j] + Math.max(arr[i - 1][j - 1], Math.max(arr[i - 1][j], arr[i][j - 1]));

			}
		}
		System.out.println(arr[a - 1][b - 1]);
	}
}
