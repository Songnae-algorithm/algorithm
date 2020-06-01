package BFS_DFS;

import java.util.*;

class puyo {
	int x;
	int y;

	puyo(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

public class boj_11559_puyopuyo {

	static Queue<puyo> qu = new LinkedList<>();

	static Character arr[][] = new Character[12][6];

	private static void dfs(int x, int y, Character c, boolean[][] chk) {

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == c && !chk[nx][ny]) {

				chk[nx][ny] = true;
				qu.add(new puyo(nx, ny));
				dfs(nx, ny, arr[nx][ny], chk);

			}
		}

	}

	private static void down() {

		for (int k = 0; k < 12; k++) {// 행의 수 만큼 계속 해주기 위함. 따라서 12임 
			for (int i = 10; i >= 0; i--) {// 10인 이유는 arr의 행이 12까지니까 맨 밑에는 11이고, 내 밑에꺼랑 비교할꺼니가 하나 더 -해서 10인 것...
				for (int j = 0; j < 6; j++) {
					if (arr[i][j] != '.' && arr[i + 1][j] == '.') {
						arr[i + 1][j] = arr[i][j];
						arr[i][j] = '.';
						// 내 밑에랑 위에랑 바꾸기
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		// 5/30 19:40-

		int answer = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[1].length; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		// 한줄씩 받아서 arr에 입력
		
		
		boolean end = true;//while문을 돌기위한 조건 !!! 이거를 잘 알아듀기..
		while (end) {

			end = false;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[1].length; j++) {
					if (arr[i][j] != '.') {
						qu.clear();

						boolean chk[][] = new boolean[12][6];

						chk[i][j] = true;
						qu.add(new puyo(i, j));

						dfs(i, j, arr[i][j], chk);// i,j, 문자, chk배열

						if (qu.size() >= 4) {

							end = true;// 4개이상일때 true

							while (!qu.isEmpty()) {
								puyo p = qu.poll();
								int x = p.x;
								int y = p.y;
								arr[x][y] = '.';
								// qu에 들어있는애들을 다 .으로 바꿔줌

							}

						}

					}

				}
			}
			//한번 쫙 돌고 나서 4개이상인게 있을 때만 내려주고, answer++해준다. 
			if (end == true) {
				answer++;
				down();

			} else {
				//false면 배열을 전체 돌면서 4개이상인게 발견되지 않았다는 뜻이니까 while문을 나간다
				break;
			}
		}
		System.out.println(answer);

	}

}
