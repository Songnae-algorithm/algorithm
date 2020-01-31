package review;

import java.util.*;

public class pr_2_기능개발_2 {

	public static int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> que = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			que.offer(progresses[i]);
		}

		// que에 순서대로 넣음

		int day = 0;
		int idx = 0;

		while (!que.isEmpty()) {
			day++;// day ++

			int answer = 0;

			while (!que.isEmpty() && (que.peek() + day * speeds[idx] >= 100)) {
				// que is empty를 또 해주어야 함
				// que.peek을 while문 밖에서 변수로 지정하면 안되고 바로 써주야 함 (그래야 while에서 도니까)
				// que가 비어있지 않고, peek값과(1차때는 93) + day*sppeds의 인덱스값을 곱해서 100보다 크거나 같아질때

				// 크거나 같아지면
				idx++;
				answer++;
				que.poll();

			} // 크지 않으면 day++ 해서 값 올려줌

			if (answer != 0) {// answer가 0이 아닐때만 넣음
				list.add(answer);
			}

		}

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		return list.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		int arr[] = { 93, 30, 55 };
		int arr2[] = { 1, 30, 5 };

		solution(arr, arr2);

	}
}
