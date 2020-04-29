package Greedy;

import java.util.*;

public class boj_1946_신입사원3 {
	// 4/24
	// 10:45 start 10:55 fin

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int a = 0; a < in; a++) {
			int cnt = 1;
			int n = sc.nextInt();
			int arr[][] = new int[n][2];

			for (int i = 0; i < n; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();

			}

			Arrays.sort(arr, new Comparator<int[]>() {

				public int compare(int a[], int b[]) {
//					if (a[0] == b[0]) {
//						return a[1] - b[1];
//					} else {
					return a[0] - b[0];
				}

			}); // 서류점수로 정렬

			int min = arr[0][1];
			for (int i = 1; i < n; i++) {
				if (arr[i][1] < min) {
					cnt++;
					min = arr[i][1];

				}
			}
			System.out.println(cnt);

		}
	}

}
