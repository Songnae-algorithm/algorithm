package Programmers;

import java.util.*;

public class pr1_실패율_2 {

	static class Fail {
		int idx;
		double fail;

		Fail(int idx, double fail) {
			this.idx = idx;
			this.fail = fail;
		}

	}

	public static int[] solution(int N, int[] stages) {

		double[] fail = new double[N + 2]; // 실패율 ( 0~6 까지 저장이 되니까 )
		int[] num = new int[N + 2]; // 남은 사람수
		ArrayList<Fail> list = new ArrayList<>();

		for (int i = 0; i < stages.length; i++) {

			fail[stages[i]]++;
			// 이렇게 쓰면 굳이 for 문 두개를 안 쓰더라도 그냥 stages의 값들의 갯수만큼 fail에 더해줄 수 있다...꼭 알아두기
			// 이 문제를 예시로 든다면 stages에는 0 1 3 2 1 0 1 이 저장됨
		}
		num[1] = stages.length;
		for (int i = 2; i < fail.length; i++) {
			num[i] = (int) (num[i - 1] - fail[i - 1]); // 사람수를 입력. 근데 이미 해당 스테이지에 도전한 사람 수는 빼야하니까.

		}
		for (int i = 1; i <= N; i++) {
			if (fail[i] != 0 && num[i] != 0) {
				// fail[i] = fail[i] / num[i]; // 소숫점 값 입력하기.
				list.add(new Fail(i, fail[i] / num[i]));

			} else {
				// 0일 때
				list.add(new Fail(i, 0));

			}

		}

		Comparator<Fail> fails = new Comparator<Fail>() {

			@Override
			public int compare(Fail A, Fail B) {
				if (A.fail < B.fail) {// 오름차순으로 정렬

					return 1;
				} else if (A.fail > B.fail) {
					return -1;

				}

				return 0;
			}

		};

		Collections.sort(list, fails);

		int answer[] = new int[N];

		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i).idx;
			System.out.println(answer[i]);
		}

		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, arr);
	}

}
