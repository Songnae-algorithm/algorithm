package Programmers;

public class pr1_문자열을정수로바꾸기2 {
	
	public static int solution(String s) {
		int answer = Integer.parseInt(s);
		System.out.println(answer);
		return answer;
	}
	
	
	public static void main(String[] args) {
		solution("1234");
		solution("-1234");
	}

}
