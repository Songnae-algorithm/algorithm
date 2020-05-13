package Programmers;

public class pr1_비밀지도2 {

	public static String[] solution(int n, int[] arr1, int[] arr2) {

		// 5/2 01:15- 40
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			String str1 = Integer.toBinaryString(arr1[i]);
			String str2 = Integer.toBinaryString(arr2[i]);

			while (str1.length() != n) {
				str1 = "0" + str1;

			}
			while (str2.length() != n) {
				str2 = "0" + str2;
			}
			System.out.println(str2);
			String st = "";
			for (int j = 0; j < n; j++) {

				if (str1.charAt(j) == '0' && str2.charAt(j) == '0') {
					st += " ";
				} else {
					st += "#";
				}
			}
			answer[i] = st;

		}
		

		return answer;
	}

	public static void main(String[] args) {
		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };
		solution(5, arr1, arr2);

	}

}
