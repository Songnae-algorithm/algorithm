package Stack_Queue;

import java.util.*;

public class pr2_주식가격 {

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}
//		for (int i = 0; i < prices.length; i++) {
//			System.out.println(answer[i]);
//		}
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 3 };
		solution(arr);

	}

}
