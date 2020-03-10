package BOJ;

import java.util.*;

public class boj_11047_동전 {

	public static void main(String[] args) {
		//딱 30분 걸림
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
				if (money / list.get(i) != 0) { // 몫이 0이 아니면

					int mok = money / list.get(i);// 몫 4
					
					answer += mok;
					money = money - (mok * list.get(i));
				}
			}
		}
		System.out.println(answer);

	}
}
