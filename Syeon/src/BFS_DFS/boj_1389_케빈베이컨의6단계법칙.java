package BFS_DFS;

import java.util.*;

public class boj_1389_케빈베이컨의6단계법칙 {
	static int sum = 0;
	static int arr[][];
	static int map[][];
	static boolean visited[][];

	private static int bfs(int a) {
		sum = 0;

		Queue<Integer> qu = new LinkedList<>();
		int cnt[] = new int[arr.length];
		boolean chk[] = new boolean[arr.length];

		qu.add(a);
		chk[a] = true;

		while (!qu.isEmpty()) {
			int p = qu.poll();

			// arr.length=6 이다
			for (int i = 1; i < arr.length; i++) {
				if (arr[p][i] == 1 && chk[i] == false) {
					chk[i] = true;
					qu.add(i);
					cnt[i] = cnt[p] + 1;

				}

			}

		}

		for (int i = 1; i < cnt.length; i++) {
			sum += cnt[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 친구들의 수 (배열 수 )
		int b = sc.nextInt(); // 입력받을 연결 갯수

		arr = new int[a + 1][a + 1];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;
//			
		}

		for (int i = 1; i <= a; i++) {

			bfs(i);
			list.add(sum);

		}
		int min = Collections.min(list);
		for (int i = 0; i < list.size(); i++) {
			if (min == list.get(i)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}