package BFS_DFS;

import java.util.*;

public class boj_3055_탈출2 {

	static class map {
		int x;
		int y;
		int cnt = 0;

		public map(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}// 고슴도치 이동

		public map(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}// 물

	static char arr[][];

	static Queue<map> watermap = new LinkedList<>(); // 물
	static Queue<map> gomap = new LinkedList<>();// 고슴도치

//
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean chk = true;

		arr = new char[n][m];

		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.charAt(j);

				if (arr[i][j] == '*') {
					watermap.add(new map(i, j));
				}
				if (arr[i][j] == 'S') {
					gomap.add(new map(i, j, 0));// 고슴도치는 한개니까 첨 발견했을땐 count 0
				}

			}
		} // 배열에 입력

		while (chk) {

			int ws = watermap.size();// 따로 뺴서 해 주어야 한다. for 문 안에 돌면서 큐의 사이즈가 계속 바뀌니까

			for (int a = 0; a < ws; a++) {

				map w = watermap.poll();

				int wx = w.x;
				int wy = w.y;

				for (int i = 0; i < 4; i++) {
					int nwx = wx + dx[i];
					int nwy = wy + dy[i];

					if (nwx >= 0 && nwx < arr.length && nwy >= 0 && nwy < arr[0].length && arr[nwx][nwy] == '.') {
						arr[nwx][nwy] = '*';// 범위초과 안하고 옆에가 . 일때만 *(물로 바꿈)
						watermap.add(new map(nwx, nwy));

						// System.out.println(nwx + " " + nwy + " 물 ");
					}

				}
			}

			int gs = gomap.size();// 따로 뺴서 해 주어야 한다. for 문 안에 돌면서 큐의 사이즈가 계속 바뀌니까

			for (int a = 0; a < gs; a++) {

				map go = gomap.poll();

				int x = go.x;
				int y = go.y;

				if (chk == false) {
					break;
				}
				for (int i = 0; i < 4; i++) {

					int nx = x + dx[i];
					int ny = y + dy[i];

					if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && arr[nx][ny] == '.') {
						arr[nx][ny] = 'S';// 범위초과 안하고 옆에가 . 일때만
						// System.out.println(nx + " " + ny);

						gomap.add(new map(nx, ny, go.cnt + 1));

					}
					if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && arr[nx][ny] == 'D') {
						System.out.println(go.cnt + 1);// 범위초과 X고 다음에 갈 곳이 D 면 한번만 더 가면 되니까 +1 해서 리턴
						chk = false;
						break;

					}

				}

			}
			if (gs == 0) { // gs는 고슴도치가 이동할 수 있는 사이즈인데 아무것도 추가를 안했다는 건 더이상 갈 길이 없다는 것. 따라서 false로 하고 while
							// 빠져나오고 끝냄
				System.out.println("KAKTUS");
				chk = false;
				break;
			}

		} // while

	}// main

}
