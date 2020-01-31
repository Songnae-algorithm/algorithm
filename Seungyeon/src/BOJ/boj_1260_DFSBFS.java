package BOJ;

import java.util.*;

public class boj_1260_DFSBFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int start = sc.nextInt();

		int arr[][] = new int[a + 1][a + 1];
//		boolean chk[] = new boolean[arr.length];// boolean을 선언하면 모두 다 false로 되어있음 따로 초기화 x

		for (int i = 1; i <= b; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			arr[v1][v2] = 1;
			arr[v2][v1] = 1;

		}

		boolean chk1[] = new boolean[arr.length];// boolean을 선언하면 모두 다 false로 되어있음 따로 초기화 x
		boolean chk2[] = new boolean[arr.length];

		dfs(arr, chk2, start);
		System.out.println();
		bfs(arr, chk1, start);
		
	}// 입력받아서 인접행렬 만들어 줌

	public static void dfs(int[][] a, boolean[] c, int v) {

		int n = a.length - 1;// 5

		c[v] = true;// 배열 c의 v번째(정점)을 true 로 하고
		// (한번 돌았을 때, v=i가 되니까)

		System.out.print(v + " ");// 출력
		// (v=i인 2를 출력한다)

		for (int i = 1; i <= n; i++) {// 1부터 n까지

			if (a[v][i] == 1 && !c[i]) {// 배열의 [1][2] 이 1이고, c[2]이 false면
				// 1에 붙어있는 다음꺼를 찾고 다 찾으면 dfs를 다시 선언( i=2가 됨)
				dfs(a, c, i);

			}
		}

	}

	public static void bfs(int[][] a, boolean[] c, int v) {

		Queue<Integer> que = new LinkedList<Integer>();

		int n = a.length - 1;

		que.offer(v);// que에 시작되는 정점 입력
		c[v] = true;

		while (!que.isEmpty()) {
			v = que.poll();// 맨 앞에꺼를 뺌

			System.out.print(v + " ");

			for (int i = 1; i < a.length; i++) {
				if ((a[v][i] == 1) && (c[i] == false)) {
					que.offer(i);
					c[i] = true;

				}
			}

		}

	}
}