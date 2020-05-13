package Programmers;

public class pr2_124나라의숫자 {

	public static String solution(int n) {

		// 5/11 23:44 -24:33 
		String answer = "";

		while (n > 0) {
			int mok = n % 3;
			n = n / 3;

			if (mok == 0) {
				mok = 4;
				n = n - 1;
			}
			answer = mok + answer;

		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		solution(10);
		solution(11);
		solution(12);
		solution(13);
		solution(14);
		solution(15);

	}

}
