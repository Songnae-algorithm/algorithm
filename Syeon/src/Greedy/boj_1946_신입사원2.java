package Greedy;

import java.util.*;

public class boj_1946_신입사원2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int l = 0; l < in; l++) {
			int ans = 1;// 1등은 무조건 포함하기 때문에 1로 초기화

			int a = sc.nextInt();

			int arr[][] = new int[a][2];

			for (int i = 0; i < arr.length; i++) {
				arr[i][0] = sc.nextInt();// 서류성적
				arr[i][1] = sc.nextInt();// 면접성적

			} // 배열 입력

			Arrays.sort(arr, new Comparator<int[]>() {

				public int compare(int a[], int b[]) {
					if (a[0] == b[0]) // 0번째 행렬이 같을 때는
						return a[1] - b[1]; // 뒤에거로 오름차순
					else
						return a[0] - b[0]; // 0번째행렬로 오름차순
					// if랑 return 이랑 같아야 함
					// return 이 기준이어야 함
				}
			});
			// arr[i][0] 을 기준으로 정렬함

			int min = arr[0][1]; // 서류 1등의 면접점수를 최소로 정함

			for (int i = 1; i < arr.length; i++) {
				if (arr[i][1] < min) {
					ans++; // 1등의 면접점수보다 작을때 ans ++
					min = arr[i][1]; // min 값을 바꿔줌

				}
			}
			System.out.println(ans);
		} // in
	}

}
