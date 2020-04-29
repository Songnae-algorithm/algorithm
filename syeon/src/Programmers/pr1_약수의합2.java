package Programmers;

public class pr1_약수의합2 {

	// 4/29 11:28 - 35

	public static int solution(int n) {
		int answer = 0;

		for (int i = n; i > 0; i--) {
			if (n % i == 0) { // n을 i로 나눠서 나머지가 0이면
				answer += i;// 나눈 수 i
				answer += n / i; // 몫
			}
		}
		
		answer = answer / 2;
		return answer;
	}

	public static void main(String[] args) {
		solution(5);
		solution(12);
	}

}
