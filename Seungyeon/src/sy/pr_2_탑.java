package sy;

import java.util.*;

public class pr_2_탑 {

	public static int[] solution(int[] heights) {

		ArrayList<Integer> list = new ArrayList<Integer>();
	
		for (int i = heights.length - 1; i > 0; i--) {
			boolean chk = false;// 판별해주기 위한 false
			for (int j = i - 1; j >= 0; j--) {//배열의 마지막 값에서 하나 적은 칸의 값 

				if (heights[i] < heights[j]) {
					list.add(j + 1);
					chk = true;
					break;//list에 add해 준 후에는 break
				}

			}
			
			if (chk == false) {
				list.add(0);
			}

		}
		list.add(0);// 1층은 더이상 내려갈 수 없으니까 0을 출력

		Collections.reverse(list);

		int answer[]= new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]+=list.get(i);
			
		}
		return answer;

	}

	public static void main(String[] args) {
		int[] arr = { 6, 9, 5, 7, 4 };
		solution(arr);
	}

}
