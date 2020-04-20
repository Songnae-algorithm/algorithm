package BFS_DFS;

import java.util.*;

public class boj_3055_탈출 {

	static class map {
		int x;
		int y;
		int cnt = 0;

		public map(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}

		public map(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int answer = 0;

		Character arr[][] = new Character[r][c];
		boolean chk[][] = new boolean[r][c];
		boolean rechk = true;

		for (int i = 0; i < r; i++) {
			String s = sc.next();
			for (int j = 0; j < c; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };

		Queue<map> qu = new LinkedList<>();
		Queue<map> waterqu = new LinkedList<>();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (arr[i][j] == 'S') {
					qu.add(new map(i, j, 0));
				}
				if (arr[i][j] == '*') {
					waterqu.add(new map(i, j));
				}
			}

		} // 좌표값 입력

		while (!qu.isEmpty()) {

			int wlen = waterqu.size();
			for (int a = 0; a < wlen; a++) {
				map p = waterqu.poll();

				for (int i = 0; i < 4; i++) {

					int nx = p.x + dx[i];
					int ny = p.y + dy[i];

					if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == '.') {

						arr[nx][ny] = '*';// 방문한곳 * 으로
						waterqu.add(new map(nx, ny));

					}
				}
			} // * 확장

			int len = qu.size();
			for (int a = 0; a < len; a++) {
				map p = qu.poll();

				int x = p.x;
				int y = p.y;
				answer = p.cnt;

				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];

					if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length
							&& (arr[nx][ny] == '.' || arr[nx][ny] == 'D') && chk[nx][ny] == false) {

						if (arr[nx][ny] == 'D') {
							rechk = true;
							break;
						}

						chk[nx][ny] = true;
						arr[nx][ny] = 'S';

						qu.add(new map(nx, ny, p.cnt + 1));
						if (arr[nx][ny] != 'D') {
							rechk = false;
						}

					}
				}
			}

		} // qu

		if (rechk == false)

		{
			System.out.println("KAKTUS");
		} else {
			System.out.println(answer + 1);
		}

	}

}
