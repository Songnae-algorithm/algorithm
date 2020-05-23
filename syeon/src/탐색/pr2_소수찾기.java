package 탐색;

import java.util.*;

public class pr2_소수찾기 {

	static LinkedList<Integer> list = new LinkedList<>();// 조합에 넣을 숫자 입력

	static LinkedList<Integer> number = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();

	static int n;
	static int m;

	private static void perm(int m, int count, LinkedList<Integer> num, boolean[] perCheck) {

		if (count == m) {
			String s = "";
			for (int i = 0; i < num.size(); i++) {

				s += Integer.toString(num.get(i));

			}
			if (!number.contains(Integer.parseInt(s))) {
				number.add(Integer.parseInt(s));
			}

			return; // return 해 주 기 ! !
		}

		for (int i = 0; i < list.size(); i++) {
			if (!perCheck[i]) {
				num.add(list.get(i));
				perCheck[i] = true;
				perm(m, count + 1, num, perCheck);
				perCheck[i] = false;
				num.removeLast();
			}
		}

	}

	public static int solution(String numbers) {

		// 5/22 14:50-
		int answer = 0;

		for (int i = 0; i < numbers.length(); i++) {
			list.add(Integer.parseInt(Character.toString(numbers.charAt(i))));
		}
		n = list.size();

		list.sort(null);
		for (int i = 1; i <= numbers.length(); i++) {
			boolean[] perCheck = new boolean[n];
			LinkedList<Integer> num = new LinkedList<>();
			perm(i, 0, num, perCheck);
			// i는 m을 의미. 1, 2, 3 ..

		}

		number.sort(null);

		boolean prime[] = new boolean[number.getLast() + 1];

		for (int i = 2; i <= prime.length; i++) {
			for (int j = 2; i * j < prime.length; j++) {
				prime[i * j] = true;
			}
		}

		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) >= 2 && prime[number.get(i)] == false) {
				answer++;
			}
		}
		//System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		solution("17");
	}

}
