package BFS_DFS;

import java.util.*;

public class boj_2644_촌수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int arr[][] = new int[in + 1][in + 1];// 9X9 배열

		boolean chk[] = new boolean[in + 1];
		int count[] = new int[in + 1];

		int a = sc.nextInt();// 7
		int b = sc.nextInt();// 3

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}


		Queue<Integer> qu = new LinkedList<>();

		qu.add(a);
		chk[a] = true;

		while (!qu.isEmpty()) {// q가 비어있지 않을때까지
			int p = qu.poll(); // 7을 빼서 저장 peek아니고 poll!!!!!!!!!!

			if (p == b) {
				break;
			}
			for (int i = 1; i < arr.length; i++) {
				if (arr[p][i] == 1 && chk[i] == false) {// 1이면
					// 여기서 for문을 두번 안쓰는 이유!!!
					// poll해준 p값이 행의값이 되기 때문!!!

					qu.add(i);
					chk[i] = true;
					count[i] = count[p] + 1;// 같은 자식일때는 다 동일한 값을 가지게 된당
					// p=7이고 i는 2일때 count에는 1
					// p=2이고 i가 1,8,9일 때는 기존의 p[2]+1
					// p=1이고 i가 3이면 기존의 p[2]+1 해서 3

				}

			}
		}
		if (count[b] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count[b]);
		}
	}

}
