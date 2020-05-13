package Greedy;

public class pr1_체육복2 {

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;// 처음에는 전체인원수 - 잃어버린 사람 수 만큼 가능

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;

				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;

				}
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		int lost1[] = { 1, 2 };
		int re1[] = { 2, 3 };
		solution(5, lost1, re1);
	}

}
