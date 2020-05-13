package Stack_Queue;

import java.util.*;

public class pr2_주식가격2 {
	public static int[] solution(int[] prices) {

		// 5/6 18:10 -20
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] > prices[j]) {
					answer[i]++;
					break;
				} else {
					answer[i]++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 3 };
		solution(arr);

	}

}
