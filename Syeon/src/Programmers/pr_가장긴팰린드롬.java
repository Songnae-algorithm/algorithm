package Programmers;

public class pr_가장긴팰린드롬 {

	public static void solution(String s) {
		int answer = 0;
		
		int a = s.length() / 2; // 절반 (0~3)
		int start = 0;
		int last = s.length() - 1; // length는 1부터 시작하지만 문자열은 0부터 시작

		while (true) {

			if (s.charAt(start) == s.charAt(last)) {

				System.out.println(s.charAt(start));
				System.out.println(s.charAt(last));
				start++;
				last--;
			} else {
				break;
			}

		}

		// return answer;

	}

	public static void main(String[] args) {

		String s1 = "abcdcba";
		String s2 = "abacde";

		solution(s1);
		// solution(s2);
	}
}
