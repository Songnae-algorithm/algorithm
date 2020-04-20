package sort;

import java.util.*;

public class boj_1931_회의실배정 {

	static int arr[][];
	static int start;
	static int end;
	static int cnt = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}

		Arrays.sort(arr, new Comparator<int[]>() {

			public int compare(int a[], int b[]) {
				if (a[1] == b[1]) // 0번째 행렬이 같을 때는
					return a[0] - b[0]; // 뒤에거로 오름차순
				else
					return a[1] - b[1]; // 0번째행렬로 오름차순
				//if랑 return 이랑 같아야 함
				//return  이 기준이어야 함 
			}
		});
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i][0] + "  " + arr[i][1]);
//		}

		//start = arr[0][0];
		end = arr[0][1];
		for (int i = 1; i < n; i++) {
			if (arr[i][0] >= end) {
				//start = arr[i][0];
				end = arr[i][1];
				cnt++;
			}

		}
		System.out.println(cnt);

	}
}