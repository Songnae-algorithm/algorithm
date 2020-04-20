package Test;

import java.util.*;

public class test2 {

	static LinkedList<Integer> list = new LinkedList<>();
	static LinkedList<Integer> num = new LinkedList<>();

	static int n;
	static int m;
	static int sumt = 0;

	static int sum = 0;

	private static void perm(int count) {
		if (count == m) {

			for (int i = 0; i < m; i++) {
				sumt += num.get(i);
			}
			System.out.println(sumt);
		}

		for (int i = 0; i < list.size(); i++) {
			if (num.contains(list.get(i)) || !num.isEmpty() && list.get(i) < num.getLast()) {
				continue;
			}
			num.add(list.get(i));
			perm(count + 1);
			num.removeLast();
		}
	}

	public static void solution(int money[][]) {

		for (int i = 0; i < money.length; i++) {
			sum += money[i][0] * money[i][1];
			for (int j = 0; j < money[i][1]; j++) {
				list.add(money[i][0]);
			}
		}

		sum /= 2; // 전체총합 /2
		n = list.size();

		for (int i = 1; i < list.size() / 2; i++) {
			m = i;
			perm(0);
		}

	}

	public static void main(String[] args) {

		int arr[][] = { { 2500, 3 }, { 700, 5 } };
		int arr1[][] = { { 100, 3 }, { 200, 1 }, { 50, 2 } };

		solution(arr);

	}
}
