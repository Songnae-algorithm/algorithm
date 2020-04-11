package DP;

import java.util.*;

public class boj_1932_정수삼각형2 {

	// 11:30 start 11:52 fin

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int arr[][] = new int[in][in];
		int answer = Integer.MIN_VALUE;

		for (int i = 0; i < in; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 1부터 시작
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {

				if (j == 0) {// 맨 왼쪽은 바로 위에있는 왼쪽의 값밖에 받을 수 없음
					arr[i][j] = arr[i - 1][0] + arr[i][j];
				} else if (j == i) {// 맨 오른쪽은 바로 위에있는 맨 오른쪽의 값밖에 받을 수 없음( 와 여기를 왜 1로 두고 풀었을까 바보...)
					arr[i][j] = arr[i - 1][j - 1] + arr[i][j]; // 자기 자신과 위의값 더해주기
				} else {
					arr[i][j] = +Math.max(arr[i - 1][j - 1], arr[i - 1][j]) + arr[i][j];
				}
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < in; i++) {
			if (arr[in - 1][i] > answer) {
				answer = arr[in - 1][i];
			}
		}

		System.out.println(answer);
	}

}
