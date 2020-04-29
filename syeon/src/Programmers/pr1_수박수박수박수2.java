package Programmers;

public class pr1_수박수박수박수2 {
	// 4/28 3:48~ 52

	public static String solution(int n) {
		String answer = "";

		for (int i = 0; i < n / 2; i++) {
			answer += "수박";
		}
		if (n % 2 == 1) {
			answer = answer + "수";
		}
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(3);
		solution(4);
	}

}
