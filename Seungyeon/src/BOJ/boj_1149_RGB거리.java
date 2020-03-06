package BOJ;

import java.util.*;

public class boj_1149_RGB거리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n + 1][3];// _0: R ,_1 : G, _2 : B

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 가격 입력

		for (int i = 1; i < n; i++) {
			arr[i][0] = Math.min(arr[i - 1][1], arr[i - 1][2]) + arr[i][0];
			arr[i][1] = Math.min(arr[i - 1][0], arr[i - 1][2]) + arr[i][1];
			arr[i][2] = Math.min(arr[i - 1][0], arr[i - 1][1]) + arr[i][2];

		}

		/*
		 * arr[1][1] = 두개의 최솟값(arr[0][0] , arr[1][2])+ arr[1][1] //자기자신;
		 * 
		 * 
		 * /* 3 
		 * 26 40 83 
		 * 49 60 57 
		 * 13 89 99
		 * 
		 * 1번 돌면
		 * 
		 * 89(49 + 40) 86 (60+26) 83(57+26)
		 * 
		 */

		// n-1인 이유.... 배열은 0,1,2 니까^^(첨에 n이라고해서 틀렸음..주의할것)
		System.out.println(Math.min(arr[n - 1][0], Math.min(arr[n - 1][1], arr[n - 1][2])));
	}

}
