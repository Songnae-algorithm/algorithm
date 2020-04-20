package Test;

import java.util.*;

public class test1 {

	static public int solution(String s, String pattern) {
		int answer = 0;

		String arr[] = new String[pattern.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(pattern.charAt(i));
		}

		for (int i = 0; i <= s.length() - pattern.length(); i++) {
			boolean chk = true;
			String a = s.substring(i, i + pattern.length());
			System.out.println(a);

			for (int j = 0; j < pattern.length(); j++) {
				if (!a.contains(arr[j])) {
					chk = false;

				}

			}
			if (chk == true) {
				answer++;
			}

		}

		System.out.println(answer);
		return answer;

	}

	// return answer;

	public static void main(String[] args) {

		System.out.println(solution("aabbccddee", "abcde"));
	}
}
