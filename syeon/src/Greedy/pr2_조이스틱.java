package Greedy;

public class pr2_조이스틱 {

	public static int solution(String name) {
		int answer = 0;

		int arr[] = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.min(i, 26 - i);
			if (i > 13) {
				arr[i]++;
			}

			//System.out.println(arr[i]);
		}

		for (int i = 0; i < name.length(); i++) {
			int a = (int) name.charAt(i) - 'A';
			System.out.println(arr[a]);
			answer += arr[a];
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// 5/22 14:01-

		// solution("JEROEN");// 56
		// solution("JAZ");// 11
		solution("JAN");// 23
	}

}
