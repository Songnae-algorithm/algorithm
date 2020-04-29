package Programmers;

public class pr1_시저암호1 {
	// 4/28 23:21 - 44
	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char a = 0;
			if (s.charAt(i) == ' ') {
				answer += " ";
				continue;
			}
			a += s.charAt(i) + n;

			if (s.charAt(i) >= 97 && s.charAt(i) <= 122 && a > 122) {
				a = (char) (96 + (a - 122));
			}
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90 && a > 90) {
				a = (char) (64 + (a - 90));
			}

			answer += Character.toString(a);
		}
		//System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution("AB", 1);
		solution("z Z", 1);
		solution("a B z	", 4);
		// 공백은 밀어도 공백
	}

}
