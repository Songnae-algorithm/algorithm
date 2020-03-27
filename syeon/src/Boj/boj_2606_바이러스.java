package Boj;

import java.util.*;

public class boj_2606_바이러스 {
	static int cnt = 0;// 변수 받기 위해 static으로 선언

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 입력받는 정점 수 (7)

		int arr[][] = new int[a + 1][a + 1]; // (0~7)

		int b = sc.nextInt();// 입력받을 연결 쌍 수

		for (int i = 0; i < b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		boolean chk[] = new boolean[a + 1];

		bfs(arr, chk, 1);// 1부터 시작
		System.out.println(cnt);
	}

	private static int bfs(int[][] arr, boolean[] chk, int start) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(start);// 초깃값 1 입력
		chk[start] = true;// 1행 방문했으니까 true로 바꿈

		while (!q.isEmpty()) {// q가 비어있지 않을때까지
			int p = q.poll(); // 1을 빼서 저장 peek아니고 poll!!!!!!!!!!

			for (int i = 1; i <arr.length; i++) {
				if (arr[p][i] == 1 && chk[i] == false) {// 1이고 방문안했으면 add
					// 여기서 for문을 두번 안쓰는 이유!!!
					// poll해준 p값이 행의값이 되기 때문!!!
					
					q.add(i);
					chk[i] = true;
					cnt++;
				}

			}
		}

		return cnt;

	}
}
