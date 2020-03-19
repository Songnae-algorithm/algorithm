package BOJ;

import java.util.*;

public class boj_2644_촌수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int arr[][] = new int[in + 1][in + 1];// 9X9 배열

		int chk[] = new int[in + 1];

		int a = sc.nextInt();// 7
		int b = sc.nextInt();// 3

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		int cnt = 0;
		Queue<Integer> qu = new LinkedList<>();

		qu.add(a);
		while (!qu.isEmpty()) {// q가 비어있지 않을때까지
			int p = qu.poll(); // 7을 빼서 저장 peek아니고 poll!!!!!!!!!!

			if (p == b) {
				break;
			}
			for (int i = 1; i < arr.length; i++) {
				if (arr[p][i] == 1) {// 1이면
					// 여기서 for문을 두번 안쓰는 이유!!!
					// poll해준 p값이 행의값이 되기 때문!!!

					qu.add(i);
					arr[p][i] = 0;
					cnt++;
					//System.out.println(i);
				}

			}
		}
		System.out.println(cnt);

	}

}
