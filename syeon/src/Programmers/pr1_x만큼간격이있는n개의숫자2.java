package Programmers;

public class pr1_x만큼간격이있는n개의숫자2 {

	public static long[] solution(int x, int n) {

		// 5/1 14:53 - 58
		long[] answer = new long[n];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = (long) (i + 1) * x;

		}

		return answer;
	}

	public static void main(String[] args) {
		solution(2, 5);

	}

}
