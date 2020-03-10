package BOJ;

import java.util.*;

class Start {
	int startx;
	int starty;
	int cnt;

	Start(int startx, int starty, int cnt) {
		this.startx = startx;
		this.starty = starty;
		this.cnt = cnt;
	}
}

public class boj_7562_나이트의이동 {

	static int answer = 0;

	public static void main(String[] args) {
		// 12;28 시작

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {

			int n = sc.nextInt();
			int arr[][] = new int[n][n];

			int startx = sc.nextInt();
			int starty = sc.nextInt();

			int endx = sc.nextInt();
			int endy = sc.nextInt();

			Queue<Start> startqu = new LinkedList<>();

			startqu.add(new Start(startx, starty, 0));

			int dx[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
			int dy[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

			while (!startqu.isEmpty()) {
				Start s = startqu.poll();
				int stx = s.startx;
				int sty = s.starty;
				int cnt = s.cnt;

				answer = cnt;

				if (stx == endx && sty == endy) {
					break;
				}

				for (int j = 0; j < 8; j++) {
					int nx = stx + dx[j];
					int ny = sty + dy[j];

					if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[nx][ny] == 0) {

						arr[nx][ny] = 1;
						startqu.add(new Start(nx, ny, cnt + 1));

					}
				}

			}
			System.out.println(answer);
		}
	}

}
