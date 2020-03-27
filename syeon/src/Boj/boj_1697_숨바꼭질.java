package Boj;

import java.util.*;

public class boj_1697_숨바꼭질 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean[] check = new boolean[100001];
		int[] cnt = new int[100001];

		check[a] = true;// 수빈이가 방문한 곳 true로
		cnt[a] = 0; //몇번째인지 저장

		Queue<Integer> q = new LinkedList<Integer>(); 

		q.add(a); //수빈이가 방문한 곳 저장(5)

		while (!q.isEmpty()) {
			int x = q.poll(); //초기값. 큐에서 빼면서 저장

			if (0 <= x - 1 && check[x - 1] == false) {//범위 안에 있고, 방문 아직 안한곳일때 
				q.add(x - 1); // q에 x-1 넣음
				check[x - 1] = true;//방문했으니가 true로 바꿔줌 

				cnt[x - 1] = cnt[x] + 1; //cnt에 원래 내가 가진 값 +1 해서 저장

			}
			if (x + 1 <= 100000 && check[x + 1] == false) {
				q.add(x + 1);
				check[x + 1] = true;

				cnt[x + 1] = cnt[x] + 1;
			}
			if (x * 2 <= 100000 && check[x * 2] == false) {
				q.add(x * 2);
				check[x * 2] = true;
				cnt[x * 2] = cnt[x] + 1;
			}

		}
		System.out.println(cnt[b]);

	}
}
