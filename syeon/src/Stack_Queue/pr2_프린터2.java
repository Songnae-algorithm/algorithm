package Stack_Queue;

import java.util.*;

public class pr2_프린터2 {

	public static int solution(int[] priorities, int location) {

		LinkedList<Integer> pri = new LinkedList<>();
		LinkedList<Integer> idx = new LinkedList<>();

		// 5/6 18:26 - 19:14

		int answer = 0;

		for (int i = 0; i < priorities.length; i++) {
			pri.add(priorities[i]);
			idx.add(i);

		}
		boolean chk = false;

		while (true) {


			for (int i = 0; i < pri.size(); i++) {
				if (pri.get(0) < pri.get(i)) {
					int p = pri.remove();
					int id = idx.remove();

					pri.add(p);
					idx.add(id);

					chk = true;
					break;
				}
			}
			if (chk == false) {
				// 맨 앞이 가장 크다는 것
				pri.remove(0);// 맨앞제거
				int a = idx.remove(0); //인덱스도 제거 . 근데 얘까 location이랑 같을 수도 있으니까 저장해놔야함 
				answer++;

				if (a == location) {
					break;
				}

		
			}
			chk = false;
		}

		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 9, 1, 1, 1 };
		solution(arr, 0);
	}

}
