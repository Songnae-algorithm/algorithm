package Stack_Queue;

import java.util.*;

public class pr2_기능개발3 {

	public static int[] solution(int[] progresses, int[] speeds) {
		// 5/6 20:00- 21:00
		// while문 조건 잘 봐주기.......ㅠㅠㅠ

		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();

		for (int i = 0; i < progresses.length; i++) {
			int day = 0;
			while (progresses[i] < 100) {
				progresses[i] += speeds[i];
				day++;

			}
			list.add(day);
		} // 7 3 9

		while (!list.isEmpty()) {
			int a = list.poll();
			int cnt = 1;

			while (list.size() > 0 && list.get(0) <= a) {

				list.remove(0);
				cnt++;

				if (list.isEmpty()) {
					break;
				} // break를 해줘야..오류가 안난다 ㅎㅎ

			}

			ans.add(cnt);

		}
		System.out.println(ans);

		int answer[] = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int pr[] = { 93, 30, 55 };
		int sp[] = { 1, 30, 5 };
		solution(pr, sp);
//		int p[] = { 40, 93, 30, 55, 60, 65 };
//		int s[] = { 60, 1, 30, 5, 10, 7 }; // 1 2 3

//		int p[] = { 93, 30, 55, 60, 40, 65 };
//		int s[] = { 1, 30, 5, 10, 60, 7 }; // 2 4
//
//		solution(p, s);

	}

}
