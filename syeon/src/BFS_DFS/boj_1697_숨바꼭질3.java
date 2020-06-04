package BFS_DFS;

import java.util.*;

public class boj_1697_숨바꼭질3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int des = sc.nextInt();

		Queue<Integer> qu = new LinkedList<>();

		qu.add(st);
		boolean visit[] = new boolean[100001]; // 방문체크
		int cnt[] = new int[100001]; // cnt 저장

		visit[st] = true;

		while (!qu.isEmpty()) {

			int p = qu.poll();

			if (p == des) { //poll한게 동생위치랑 같으면 break 하고 cnt 출력 
				System.out.println(cnt[p]);
				break;
			}
			
			if (0 <= p - 1 && p - 1 <= 100000 && !visit[p - 1]) {// 원래위치 -1 경우
				qu.add(p - 1);
				visit[p - 1]=true;//방문했으니까 true로 
				cnt[p - 1] = cnt[p] + 1; //원래 cnt +1해서 cnt 에 더해준다
			}
			if (0 <= p + 1 && p + 1 <= 100000 && !visit[p + 1]) {// 원래위치 +1일 때.범위초과 X고 방문 안했을때
				qu.add(p + 1);
				visit[p + 1]=true;
				cnt[p + 1] = cnt[p] + 1;
			}
			if (0 <= 2 * p && 2 * p <= 100000 && !visit[2 * p]) {// 원래위치 +1일 때.범위초과 X고 방문 안했을때
				qu.add(2 * p);
				visit[2*p]=true;
				cnt[2 * p] = cnt[p] + 1;
			}
		}
	}

}
