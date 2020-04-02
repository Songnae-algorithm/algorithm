package BFS_DFS;

import java.util.*;

public class BFS와DFS_re {

	public static void dfs(int[][] arr, boolean chk[], int start) {

		chk[start] = true;// 간 곳 true로 바꿔줌

		System.out.print(start + " ");// 1행

		for (int i = 1; i < chk.length; i++) {
			if (chk[i] == false && arr[start][i] == 1) {
				// 방문아직안했구 arr[1][1~4]까지 돌면서 연결된 걸 찾아줌
				
				dfs(arr, chk, i);

			}
		}

	}

	public static void bfs(int arr[][], boolean chk[], int start) {

		Queue<Integer> qu = new LinkedList<Integer>();

		qu.offer(start);// 1을 넣음
		chk[start] = true;// 방문한 1은 true로

		while (!qu.isEmpty()) {
			start = qu.poll();// poll해서 그 값을 기억해줌 //1

			System.out.print(start + " ");
			for (int i = 1; i < chk.length; i++) {
				if (chk[i] == false && arr[start][i] == 1) {
					qu.offer(i);
					chk[i] = true;

				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 정점 수 (4 //1234)
		int b = sc.nextInt();// 입력

		int start = sc.nextInt();// 1

		int arr[][] = new int[a + 1][a + 1]; // 1~4

		boolean chk1[] = new boolean[a + 1];
		boolean chk2[] = new boolean[a + 1];
		//bfs용 chk 전이랑 똑같은 실수...chk배열을 두개를만들어야함 

		for (int i = 0; i < b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		dfs(arr, chk1, start);
		System.out.println();
		bfs(arr, chk2, start);

	}

}
