package Programmers;

import java.util.*;

public class pr_2_더맵게 {
	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> list = new PriorityQueue<Integer>();//우선순위 큐 선언

		for (int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);//큐에 배열 값 입력 
		}

		while (list.peek() < K) {//peek : 최상위 값만 보여주는것!!

			int a = list.poll();//poll : 최상위값을 제거 (remove도 사용 O) 

			int b = list.poll();

			int c = a + (b * 2); 

			list.add(c);

			answer++;

			if (list.size() == 1 && list.peek() < K) {
				//스코빌을 계속 하고 입력한 마지막 값이 1개이고,
				//그게 K보다 작으면 안대니까 -1을 리턴해준다
				return -1;
			}

		}
		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 9, 10, 12 };

		solution(arr, 7);
	}
}
