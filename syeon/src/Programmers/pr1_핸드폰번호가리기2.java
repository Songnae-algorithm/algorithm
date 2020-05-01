package Programmers;

public class pr1_핸드폰번호가리기2 {
	public static String solution(String phone_number) {

		// 5/1 14:44-47
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution("01033334444");
		solution("027778888");
	}

}
