package Programmers;

public class pr1_하샤드수 {
	public static boolean solution(int x) {

		// 5/1 14:00-14:08 
		

		boolean answer = true;

		int sum = 0;
		int n = x;

		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		// 자릿수 합 구함

		if (x % sum != 0) {
			answer = false;
		}

		return answer;
	}

	public static void main(String[] args) {
		solution(10);
		solution(13);
	}

}
