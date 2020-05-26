package Programmers;

public class pr2_최댓값과최솟값 {

	public static String solution(String s) {
		// 5/27 01:40-44
		String answer = "";

		String arr[] = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			min = Math.min(a, min);
			max = Math.max(a, max);
		}

		answer += min + " " + max;
		return answer;
	}

	public static void main(String[] args) {
		solution("1 2 3 4"); // 1 4
		solution("-1 -2 -3 -4"); // -4 -1
	}
}
