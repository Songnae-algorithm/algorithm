package Test;

import java.util.*;

public class T0425_2 {

	public static int solution(String[] ip_addrs, String[] langs, int[] scores) {
		int answer = 0;
		int len = ip_addrs.length;

		boolean chk[] = new boolean[len];

		for (int i = 0; i < len; i++) {
			if (langs[i].equals("C#") || langs[i].equals("C++")) {
				langs[i] = "C";
			}
		} // 일단 다 C로 바꿈

		for (int i = 0; i < len; i++) {
			LinkedList<Integer> list = new LinkedList<>();
			int cnt = 1;
			list.add(i);

			for (int j = 0; j < len; j++) {
				if (i == j) {
					continue;
				}
				if (ip_addrs[i].equals(ip_addrs[j]) && !chk[i]) {
					cnt++;
					list.add(j);

				}
			}

			if (cnt >= 4) {
				while (!list.isEmpty()) {
					chk[list.remove()] = true;
				}
			} else if (cnt == 3) {
				if (langs[list.get(0)].equals(langs[list.get(1)]) && langs[list.get(1)].equals(langs[list.get(2)])) {
					chk[list.get(0)] = true;
					chk[list.get(1)] = true;
					chk[list.get(2)] = true;

				}

			} else if (cnt == 2) {
				if (langs[list.get(0)].equals(langs[list.get(1)]) && scores[list.get(0)] == scores[list.get(1)]) {
					chk[list.get(0)] = true;
					chk[list.get(1)] = true;
				}
			}

		}
		for (int i = 0; i < len; i++) {
			if (chk[i] == false) {
				answer++;
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		String ip[] = { "5.5.5.5", "155.123.124.111", "10.16.125.0", "155.123.124.111", "5.5.5.5", "155.123.124.111",
				"10.16.125.0", "10.16.125.0" };
		String lang[] = { "Java", "C++", "Python3", "C#", "Java", "C", "Python3", "JavaScript" };
		int score[] = { 294, 197, 373, 45, 294, 62, 373, 373 };

		String ip1[] = { "7.124.10.0", "7.124.10.0", "0.0.0.0", "7.124.10.0", "0.0.0.0", "7.124.10.0" };
		String lang1[] = { "C++", "Java", "C#", "C#", "C", "Python3" };
		int score1[] = { 314, 225, 45, 0, 155, 400 };

		solution(ip1, lang1, score1);

	}
}
