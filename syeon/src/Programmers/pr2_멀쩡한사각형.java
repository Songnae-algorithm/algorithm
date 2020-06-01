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
	
/*
	private static long gcd(long w, long h) {
		if (w == 0) {
			return h;
		}
		return gcd(h % w, w);
	}

	public static long solution(int w, int h) {

		long w1 = Long.parseLong(Integer.toString(w));
		long h1 = Long.parseLong(Integer.toString(h));

		if (w1 > h1) {
			long tmp = w1;
			w1 = h1;
			h1 = tmp;

		}

		long num = gcd(w1, h1);// 최대공약수 구하기

		long answer = w1 * h1;
		answer -= (w1 + h1 - num);

		return answer;
	}
	*/
	

	public static void main(String[] args) {

		// 5/19 01:00-
		solution(8, 12);

	}

}
