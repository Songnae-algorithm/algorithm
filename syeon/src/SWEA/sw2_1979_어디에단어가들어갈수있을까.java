
package SWEA;

import java.util.*;

public class sw2_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int a = 1; a <= in; a++) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			int cnt = 0;

			int arr[][] = new int[n][n];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();

				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] == 1) {

						// 범위 초과하지 않으면가로로 봄
						if (j + k <= n) {
							boolean gachk = true;
							for (int l = 1; l < k; l++) {
								if (arr[i][j + l] == 0) {
									gachk = false;
									break;
								}
							}
							if (gachk && (j + k == n  || arr[i][j + k] == 0 ) && (j==0|| arr[i][j-1]==0)) {
								//true 이고, 1) 범위의 끝이거나, 오른쪽 옆이 0일때 && 2) 0이거나 왼쪽이 0일 때 
								cnt++;
							
							} 

						} // 가로 봐줌

						if (i + k <= n) {
							boolean sechk = true;
							for (int l = 1; l < k; l++) {
								if (arr[i + l][j] == 0) {
									sechk = false;
									break;
								}
							}
							if (sechk && (i + k == n || arr[i + k][j] == 0) &&  (i==0||arr[i-1][j]==0) ) {
								//true 이고, 1) 범위의 끝이거나, 내 아래가 0일때 && 2) 0이거나 위쪽이 0일 때 
								

								cnt++;
							} 

						} // 세로 봐줌

					}

				}
			}

			System.out.println("#" + a + " " + cnt);

		} // in

	}// main

}
