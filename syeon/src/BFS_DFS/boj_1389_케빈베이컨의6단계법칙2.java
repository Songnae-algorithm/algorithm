package BFS_DFS;

import java.util.*;

//4/24 16:15 -16:59
//index....주의.........................

public class boj_1389_케빈베이컨의6단계법칙2 {
	static int arr[][];

	static ArrayList<Integer> list = new ArrayList<>();

	private static void bfs(int x) {
		int ans[] = new int[arr.length];
		boolean chk[] = new boolean[arr.length];
		int sum = 0;

		Queue<Integer> qu = new LinkedList<>();
		qu.add(x);
		chk[x] = true;

		while (!qu.isEmpty()) {
			int p = qu.poll();
			for (int i = 1; i < arr.length; i++) {
				if (arr[p][i] == 1 && !chk[i]) {
					ans[i] = ans[p] + 1;
					qu.add(i);
					chk[i] = true;
				}
			}

		}

		for (int i = 1; i < ans.length; i++) {
			sum += ans[i];
		}
		list.add(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 친구 수
		int b = sc.nextInt(); // 입력하는 개수

		arr = new int[a + 1][a + 1];

		for (int i = 1; i <= b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		for (int i = 1; i <= a; i++) {
			bfs(i);

		}

		System.out.println(list.indexOf(Collections.min(list)) + 1);//list 에는 0부터 들어가기 떄문에 +1
		

	}

}
