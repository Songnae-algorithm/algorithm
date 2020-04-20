package 탐색;

import java.util.*;

public class pr3_예산_이분탐색 {

	public static int solution(int[] budgets, int M) {
		int answer = 0;

		Arrays.sort(budgets);

		long sum = 0; // 효율성 2번 통과를 위해서는 long으로 초기화
		int max = budgets[budgets.length - 1];// 최댓값

		for (int i = 0; i < budgets.length; i++) {
			sum += budgets[i];
		}
		if (sum <= M) {
			return max; // 전체 예산을 다 더해도 M보다 작으면 최댓값을 리턴해야함

		}
		// 아닌경우는 이분탐색을 이용

		int start = 0; // 처음 start를 0으로
		int end = max; // 처음 end를 요청한 예산 중 가장 큰 값으로 저장

		// 위의 sum 다시 사용하기 위해 초기화

		while (start <= end) {
			int mid = (start + end) / 2; // 배정할 예산
			System.out.println(sum + " " + start + " " + mid + "  " + answer);

			sum = 0;// sum을 매번 초기화 해 주어야 함

			for (int i = 0; i < budgets.length; i++) {
				if (budgets[i] >= mid) {// 예산보다 budgets이 클 때
					sum += mid; //mid 를 그대로 준다
					
				} else { // 예산보다 budgets이 작을때 더 많이 줄 필욘없으니까 부족한애들에게 주자 딱 얘한테 필요한 만큼(110)을 준다.
					sum += budgets[i];
				}
			}

			if (sum > M) {// M보다 크면 예산을 더 적게 해야하므로 줄여줌
				end = mid - 1;
			} else {// M이 더 크면 예산을 증가
				start = mid + 1;
				answer = mid;//리턴 입력
			}

		}
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 120, 110, 140, 150 };
		solution(arr, 485);

	}

}
