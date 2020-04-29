package sort;

import java.util.*;

public class K번째수2_1_CopyOfRange {

	public static int[] solution(int[] array, int[][] commands) {

		int answer[] = new int[commands.length];

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < commands.length; i++) {
			int fir = commands[i][0] - 1; // 시작
			int fin = commands[i][1]; // 끝
			int K = commands[i][2] - 1;

			int[] tmp = Arrays.copyOfRange(array, fir, fin);
			// Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준 (끝인덱스의 하나
			// 전까지 복사)

			Arrays.sort(tmp); // 배열 정렬

			answer[i] = tmp[K]; // 0부터 순차대로 가니까 따로 list를 만들어주지말고 그냥 i 를 이용해서 입력
		}
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 6, 3, 7, 4 };
		int arr1[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(arr, arr1);

	}

}
