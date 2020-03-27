package Programmers;


public class pr_2_타겟넘버 {
	static int answer = 0;

	private static void dfs(int[] arr, int target, int index, int sum) {

		if (index == arr.length) {
			if (target == sum) {
				answer++;
			}
		} else {

			dfs(arr, target, index + 1, sum + arr[index]);
			dfs(arr, target, index + 1, sum - arr[index]);

		}

	}

	public static int solution(int[] numbers, int target) {

		// numbers( 배열 ) , target값, arr의 인덱스 가리키는 값 입력
		dfs(numbers, target, 0, 0);
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 1 };
		int target = 3;

		solution(arr, target);
	}

}
