package Greedy;

import java.util.*;

public class pr2_큰수만들기 {

	static LinkedList<String> list = new LinkedList<>();

	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	static int max = Integer.MIN_VALUE;

	private static void perm(int m, int count, LinkedList<String> num, boolean[] perChk) {
		if (count == m) {
			String s = "";

			for (int i = 0; i < num.size(); i++) {
				s += num.get(i);
			}
			System.out.println(s);
			// max = Math.max(max, Integer.parseInt(s));
		}

		for (int i = 0; i < list.size(); i++) {

			if (!perChk[i] &&) {
				num.add(list.get(i));
				perChk[i] = true;
				perm(m, count + 1, num, perChk);
				perChk[i] = false;
				num.removeLast();

			}
		}

	}

	public static String solution(String number, int k) {

		// 5.25 23:49 - 24:12/ 24:19-
		String answer = "";

		for (int i = 0; i < number.length(); i++) {
			list.add(Character.toString(number.charAt(i)));
		}
		// 순열 만들 list

		n = number.length();
		m = n - k;

		boolean[] perChk = new boolean[n];
		LinkedList<String> num = new LinkedList<>();

		perm(m, 0, num, perChk);

		System.out.println(max);
		return answer;
	}

	public static void main(String[] args) {

		solution("1924", 2);
		// solution("1231234",3);//3234
		// solution("4177252841", 4);

	}

}
