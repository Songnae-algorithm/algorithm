package Programmers;

import java.util.*;

class Color {
	int x;
	int y;

	Color(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

public class pr2_카카오프렌즈컬러링북 {

	static Queue<Color> qu = new LinkedList<>();

	public static int[] solution(int m, int n, int[][] picture) {

		boolean chk[][] = new boolean[m][n];

		// 5/22 13:12-13:58 왜 헤맸니..

		int numberOfArea = 0;
		int maxSizeOfOneArea = Integer.MIN_VALUE;

		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[1].length; j++) {

				if (picture[i][j] != 0 && !chk[i][j]) {// 0이 아니고 방문 안했으면 qu에 add
					numberOfArea++;
					qu.add(new Color(i, j));
					int cnt = 1;

					chk[i][j] = true; // 간곳은 true로 바꿔줌

					while (!qu.isEmpty()) {
						Color p = qu.poll();// poll해주고

						int x = p.x;
						int y = p.y;

						int dx[] = { -1, 1, 0, 0 };
						int dy[] = { 0, 0, 1, -1 };
						// 사방 돌아줌

						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];

							if (nx >= 0 && nx < picture.length && ny >= 0 && ny < picture[1].length
									&& picture[nx][ny] == picture[i][j] && !chk[nx][ny]) {

								qu.add(new Color(nx, ny));
								chk[nx][ny] = true;
								cnt++;

							}
						}

					}
					maxSizeOfOneArea = Math.max(maxSizeOfOneArea, cnt);
				}

			}
		}

		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;

		return answer;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
				{ 0, 0, 0, 3 } };
		solution(6, 4, arr);

	}

}
