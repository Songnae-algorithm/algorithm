package Test;

import java.util.*;

public class T0523_3_1 {

	static class Pos {
		int x;
		int y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static LinkedList<Pos> ham = new LinkedList<>();// 뿌실 망치 위치

	public static int solution(int[][] arr) {
		int answer = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {

				int dy[] = { -1, -2, 1 };

				int a = arr[i][j + dy[0]];
				
				int cnt = 0;
				for (int k = 1; k < 3; k++) {
					int ny = j + dy[k];

					if (ny >= 0 && ny < arr.length && a == arr[i][ny]) {
						cnt++;
					}

				}
				if (cnt == 2) {
					System.out.println(i + " " + j);
					ham.add(new Pos(i, j));
				}
				cnt = 0;

				int dy2[] = { 1, -1, 2 };

				a = arr[i][j + dy2[0]];

				for (int k = 1; k < 3; k++) {
					int ny = j + dy2[k];

					if (ny >= 0 && ny < arr.length && a == arr[i][ny]) {
						cnt++;
					}

				}
				if (cnt == 2) {
					System.out.println(i + " " + j);
					ham.add(new Pos(i, j));
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 3, 3, }, { 4, 1, 3, 4 }, { 1, 2, 1, 1 }, { 2, 1, 3, 2 } };

		solution(arr);
	}

}
