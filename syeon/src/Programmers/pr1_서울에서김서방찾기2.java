package Programmers;

public class pr1_서울에서김서방찾기2 {

	// 4/28 15:42 - 45

	public static String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String arr[] = { "Jane", "Kim" };
		solution(arr);
	}

}
