package Programmers;

public class pr2_멀쩡한사각형 {

	public static long solution(int w, int h) {
		long answer = 0;

		long w1 = Long.parseLong(Integer.toString(w));

		long h1 = Long.parseLong(Integer.toString(h));

		for (long i = 0; i < w1; i++) {
			answer += (h1 * i / w1);

		}

		return answer * 2;
	}

	public static void main(String[] args) {

		// 5/19 01:00-
		solution(8, 12);

	}

}
