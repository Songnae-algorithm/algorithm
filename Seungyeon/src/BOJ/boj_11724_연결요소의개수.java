package BOJ;

import java.util.*;

public class boj_11724_연결요소의개수 {
	private static void dfs(int[][] arr, boolean[] chk, int i) {
		// false로 들어갔으니까 들어간거를 true로 바꿔줌
		// 일차원배열일때 생각하기
		
		chk[i] = true;
		for (int j = 1; j < chk.length; j++) {
			if (arr[i][j] == 1 && chk[j] == false) {
				dfs(arr, chk, j);
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 6
		int b = sc.nextInt();// 5

		int arr[][] = new int[a + 1][a + 1];// 0~6까지

		boolean chk[] = new boolean[a + 1];

		int cnt = 0;

		for (int k = 0; k < b; k++) { // 간선 값 입력 x는 행 y는 열
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;// 입력된 행,열의 값 1로
			arr[y][x] = 1;
		}

		for (int i = 1; i <= a; i++) {
			if (chk[i] == false) {
				dfs(arr, chk, i);
				cnt++;
			}

		}

		System.out.println(cnt);
	}

}
