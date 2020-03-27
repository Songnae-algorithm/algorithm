package Boj;

import java.util.*;

public class boj_11047_동전 {

	public static void main(String[] args) {
		// 딱 30분 걸림
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int money = sc.nextInt();
		int answer = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < in; i++) {
			int a = sc.nextInt();

			if (a < money) {
				list.add(a);
			}
		} // 전체 목적값보다 작을때만 list에 넣기

		Collections.reverse(list); // 역순으로 입력 (1000 500 ...)

		while (money != 0) {

			for (int i = 0; i < list.size(); i++) {
				if (money / list.get(i) != 0) { // 몫이 0이 아닐경우에 (4200/1000 은 가능, 다음수인 200/500은 안됨)

					int mok = money / list.get(i);// 몫 4

					answer += mok; // 나눈 몫을 answer에 더해줌

					money = money - (mok * list.get(i));
					// 연산을 한번 하고 난 나머지값. 거스름돈 (4200-4000=200)
				}
			}
		}
		System.out.println(answer);

	}
}
