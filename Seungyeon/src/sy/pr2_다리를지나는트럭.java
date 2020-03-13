package sy;

import java.util.*;

public class pr2_다리를지나는트럭 {
	//미완
	

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Integer> fin = new LinkedList<>();
		Queue<Integer> ing = new LinkedList<>();

		for (int i = 0; i < truck_weights.length; i++) {

			while (truck_weights[i] <= weight) {
				ing.add(truck_weights[i]);
				answer++;
			}if()
		}

		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 5, 6 };

		solution(2, 10, arr);

	}
}
