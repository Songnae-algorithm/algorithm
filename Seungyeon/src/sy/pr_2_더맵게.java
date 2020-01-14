package sy;

import java.util.*;

public class pr_2_더맵게 {
	public static int solution(int[] scoville, int K) {
		int answer = 0;

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);
		}
		Arrays.sort(scoville);

		while (list.get(0) < K) {

		
			
			int a = list.remove(0);
			//System.out.println(a);
			int b = list.remove(0);
			//System.out.println(b);
			int c = a + (b * 2);
			//System.out.println(c);
			list.add(0, c);
			//System.out.println(list);

			answer++;
			Collections.sort(list);
			//System.out.println(list);
		}
		if (answer == 0) {
			return -1;
		}
		//System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 9, 10, 12 };

		solution(arr, 7);
	}
}
