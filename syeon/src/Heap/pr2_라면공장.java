package Heap;

import java.util.*;

public class pr2_라면공장 {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		//그냥 갯수만 세 주는 것.. 굳이 문제에서 나온것처럼 똑~~같이 구현하려고 X
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//pq 는 작은것부터 넣는거니까 거꾸로 넣으려면 이렇게 ....!바보다 ㅠㅠㅠ

		int idx = 0;

		for (int i = 0; i < k; i++) {
			// 하루씩 갈 때마다 stock이 줄어야 하니까 k 만큼 돌아줌(처음엔 day를 새로 만들었는데 그럴필요 X i 가 day 역할)


			if (idx < dates.length && dates[idx] == i) {
				//idx는 날짜와 공급을 정해줄 index. date[idx]랑 i랑 같을 떄 pq에 공급량 넣어주기
				//그리고 idx의 범위를 정해주어야 함
				
				pq.offer(supplies[idx]);
				idx++;
				//다음 idx를 지정해주기 위함 
			
			}

			if (stock == 0) {
				// 재고가 0이면
				stock += pq.poll();//pq에서 뺴주고 답 ++
				answer++;
			}
			stock--; //하루하루 갈때마다 stock--

		}

		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
//		int a[] = { 1, 2, 3, 4 };
//		int b[] = { 10, 40, 20, 30 };
//		solution(4, a, b, 100);// 4

		int aa[] = { 4, 10, 15 };
		int bb[] = { 20, 5, 10 };
		solution(4, aa, bb, 30);
	}
}
