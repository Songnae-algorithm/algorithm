package Programmers;

public class pr1_소수찾기2 {
	public static int solution(int n) {
		int answer = 0;
		boolean prime[] = new boolean[n + 1];// 1~n까지.

		// 에라토스테네스의 체 이용
		// 2부터 시작해서 자기 자신을 제외한 배수들을 다 바꿔줌

		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				prime[i * j] = true; // i에 2, 3, 4, 5 ...를 곱한 배수를 true로 해줌
			}
		}

		for (int i = 2; i <= n; i++) {
			if (!prime[i]) {
				answer++;
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(10);// 2 3 5 7 -> 4
	}

}
