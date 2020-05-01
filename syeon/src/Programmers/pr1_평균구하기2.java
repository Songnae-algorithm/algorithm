package Programmers;

public class pr1_평균구하기2 {

	public static double solution(int[] arr) {
		// 5/1 13:23

		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer/=arr.length;
		return answer;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		solution(arr);

	}

}
