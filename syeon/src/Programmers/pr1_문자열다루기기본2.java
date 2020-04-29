package Programmers;

public class pr1_문자열다루기기본2 {

	// 4/28 15:26 st 38 fin...
	// 아스키코드는 48 ~ 57이 숫자라는것 알아두기 (0~9)

	public static boolean solution(String s) {
		boolean answer = true;

		if (s.length() != 4 && s.length() != 6) { // or 아니고 and 여야 하죠..
			answer = false;

		}
		for (int i = 0; i < s.length(); i++) {
			// 48 ~ 57가 숫자
			if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
				continue;
			} else {
				answer = false;

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		solution("a234");
		solution("1234");
	}
}

/*
 * 다른사람코드 
 * 
 * class Solution { public boolean solution(String s) { boolean answer = true;
 * 
 * if (s.length() != 4 && s.length() != 6) return false; for (int i = 0; i <
 * s.length(); i++) { if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
 * } return answer; } }
 * 
 */
