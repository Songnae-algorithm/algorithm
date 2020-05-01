package Programmers;

public class pr1_행렬의덧셈2 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		// 5/1 14:49-51

		int[][] answer = new int[arr1.length][arr1[1].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[1].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2 }, { 2, 3 } };
		int arr2[][] = { { 3, 4 }, { 5, 6 } };
		solution(arr1, arr2);

	}

}
