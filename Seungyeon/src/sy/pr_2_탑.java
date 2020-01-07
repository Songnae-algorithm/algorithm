package sy;

import java.util.*;

public class pr_2_탑 {

	public static void solution(int[] heights) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//boolean chk = false;

		for (int i = heights.length - 1; i > 0; i--) {
			boolean chk = false;
			for (int j = i - 1; j >= 0; j--) {

				if (heights[i] < heights[j]) {
					list.add(j + 1);
					chk = true;
					break;
				}

			}
			
			if (chk == false) {
				list.add(0);
			}
			
//			chk = false;
			

		}
		list.add(0);

		Collections.reverse(list);

		for (

				int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void main(String[] args) {
		int[] arr = { 6, 9, 5, 7, 4 };
		solution(arr);
	}
}
