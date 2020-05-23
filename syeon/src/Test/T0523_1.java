package Test;

import java.util.Arrays;

public class T0523_1 {

	public static String solution(String[] strs) {
		String answer = "";

		Arrays.sort(strs);

		for (int i = 0; i < strs[0].length(); i++) {
			answer += strs[0].charAt(i);

			for (int j = 0; j < strs.length; j++) {
				if (strs[j].startsWith(answer)) {
					continue;
				} else {
					answer = answer.substring(0, answer.length() - 1);

					System.out.println(answer);
					return answer;

				}
			}

		}
		System.out.println(answer);
		// if (phone_book[j].startsWith(phone_book[i]))

		return answer;

	}

	public static void main(String[] args) {
		// String a[] = { "abcaefg", "abcdefg", "abcdhfg" };
		// String a[] = { "a", "b", "c" };
		String a[] = { "ddfs", "ddse", "dgss" };
		solution(a);
	}

}
