package Boj;

import java.util.*;

public class boj_1149_RGB거리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		int arr[][] = new int[in][3];
		//arr[in][in] 으로 입력했더니 런타임에러가 났다. 여기서는 RGB니까 세개만 해줘도 OK

		for (int i = 0; i < in; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 1; i < in; i++) {
			arr[i][0] = Math.min(arr[i - 1][1], arr[i - 1][2]) + arr[i][0];
			arr[i][1] = Math.min(arr[i - 1][0], arr[i - 1][2]) + arr[i][1];
			arr[i][2] = Math.min(arr[i - 1][1], arr[i - 1][0]) + arr[i][2];

		}

		System.out.println(Math.min(arr[in - 1][0], Math.min(arr[in - 1][1], arr[in - 1][2])));

	}
}
