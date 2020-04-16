package Heap;

import java.util.*;

public class pr3_디스크컨트롤러 {

	public static int solution(int[][] jobs) {
		int answer = 0;
		int fintime = 0;
		int idx = 0;

		PriorityQueue<Integer> qu = new PriorityQueue<>();

		// jobs 정렬

		Arrays.sort(jobs, new Comparator<int[]>() {
			public int compare(int a[], int b[]) {
				if (a[0] == b[0]) // 0번째 행렬이 같을 때는
					return a[1] - b[1]; // 뒤에거로 오름차순
				else
					return a[0] - b[0]; // 0번째행렬로 오름차순
				// if랑 return 이랑 같아야 함
				// return 이 기준이어야 함
			}
		});

		return answer;
	}

	public static void main(String[] args) {

		int arr[][] = { { 0, 3 }, { 2, 6 }, { 1, 9 } };
		solution(arr);
	}

}
