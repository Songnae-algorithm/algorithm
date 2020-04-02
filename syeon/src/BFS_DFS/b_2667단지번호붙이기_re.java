package BFS_DFS;

import java.util.*;

public class b_2667단지번호붙이기_re { // 16:03시작, 16:23분 끝

	static int cnt = 0;

	public static int bfs(int arr[][], int x, int y) {

		arr[x][y] = 0;// 첨으로 들어간 곳을 0으로 바꿈
		cnt++;// 들어간거의 cnt를 세줌

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] != 0) {

				bfs(arr, nx, ny);
			}
		}

		return cnt;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 입력받을 단지 수

		int arr[][] = new int[a][a]; // 단지 배열

		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < a; j++) {
				arr[i][j] = s.charAt(j) - '0';// 이거 알아두라구요 꼭...
				// s.charAt(j) 사이에 들어가는게 j임... -'0'임!
			}
		}
		// 배열넣어줌

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (arr[i][j] == 1) {// 1일때만 bfs를 돌아
					bfs(arr, i, j);

					list.add(cnt);// 한바퀴 돌고 나면 cnt를 리턴함. 그 cnt를 list에 저장
					cnt = 0; // 다시 돌 때 cnt 값이 또 더해지며 안되니까 0으로 다시 초기화 시켜줌
				}
			}
		}

		System.out.println(list.size()); //list에 들어간 size 출력
		
		list.sort(null); //작은것부터 순서대로 정렬해주기
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //list 값 출력
		}

	}

}
