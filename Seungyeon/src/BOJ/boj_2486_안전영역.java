package BOJ;

import java.util.*;

public class boj_2486_안전영역 {
	public static void dfs(int arr[][], boolean visit[][], int x, int y, int height) {
		visit[x][y] = true;// dfs에 들어가면 간 곳을 true로 바꿈

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };
		// 상하좌우를 돌아줌(순서는 관계없음! 매칭만 잘되게)

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];// 새로운 좌표 nx에 기존의 좌표 + 상하좌우 돌아줌
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && visit[nx][ny] == false
					&& arr[nx][ny] > height) {
				dfs(arr, visit, nx, ny, height);
				// 상하좌우가 범위를 초과하지 않고 K보다 크고 visit이 false일 때만 다시 dfs를 돌기
				// 배열의 크기는 arr.length보다 작고 0보다 크거나 같아야함
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int arr[][] = new int[a][a];
		// boolean을 선언하면 모두 다
		// false로 되어있음 따로 초기화 x
		int max = 0;
		

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j]) {
					max = arr[i][j];

				}//배열 안의 최댓값 구하기
			}

		}

		int answer = 1;// dfs를 돌고 나온 결과를 리턴(1인 이유는 아무지역도 안잠길수도 있기 때문)

		for (int k = 1; k < max; k++) {//최대높이보다 작을때까지
			int cnt = 0;
			boolean visit[][] = new boolean[arr.length][arr.length];
			//매번 dfs를 몇번돌았는지 확인할 cnt와 방문했는지 확인해줄 visit 배열 선언 
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {

					if (arr[i][j] > k && visit[i][j] == false) {
						//k층보다 높고 방문 안했을 때 dfs를 돌기 

						dfs(arr, visit, i, j, k);
						cnt++;
					}

				}

			}
			if (answer < cnt) {
				answer = cnt;//answer 와 cnt 비교
			}

		}
		System.out.println(answer);
	}
}