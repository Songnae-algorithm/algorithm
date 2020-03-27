package Prog;

public class pr3_N����ǥ�� {

	static int answer = -1;

	public static int solution(int N, int number) {

		dfs(N, number, 0, 0);
		return answer;
	}

	static void dfs(int N, int number, int cnt, int prev) {
		// N�� ī��Ʈ�� �÷����� dfs �� �����Ѵ�.
		// �� ���� �����ϰ� �� ���� number�� �������� Ȯ���Ѵ�.
		int temp_N = N;
		if (cnt > 8) {
			answer = -1;
			return;
		}

		if (number == prev) {
			if (answer == -1 || answer > cnt)
				answer = cnt;
			return;
		}

	
		for (int i = 0; i < 8 - cnt; i++) {
			System.out.println(prev);
			dfs(N, number, cnt + i + 1, prev - temp_N);
		
			dfs(N, number, cnt + i + 1, prev + temp_N);
			dfs(N, number, cnt + i + 1, prev * temp_N);
			dfs(N, number, cnt + i + 1, prev / temp_N);

			temp_N = increaseNumber(temp_N, N);
		}
	}

	static int increaseNumber(int value, int N) {
		
		
		return value * 10 + N;
	}

	public static void main(String[] args) {

		solution(5, 12);

		// solution(2, 11);

	}

}
