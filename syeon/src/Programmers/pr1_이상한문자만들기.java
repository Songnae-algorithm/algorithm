package Programmers;

public class pr1_이상한문자만들기 {
	public static String solution(String s) {

		// 4/29 16:46st

		String answer = "";

		String arr[] = s.split(" ", -1);
		// 여기서 split(" ")이 아니라 -1를 해주야함
		/*
		 * split 메소드는 String[] split(String regex, int limit) 와 같이 선언되어있고, limit은 반환될
		 * 배열의 길이에 영향을 주게됩니다. limit은 크게 > 0 , == 0, < 0 3가지 경우로 나눌 수 있으며 각 경우에 따라 결과가
		 * 달라집니다. split(" , 0) 혹은 split( )의 경우abc 에서 값이 없는 c뒷부분을 제거하기때문에 [a],[b],[c]로
		 * 반환됩니다. 반면 0보다 작은 -1을 지정한 split( ",-1)은 구분자로 나눈 모든 결과값을 반환하기떄문에 [a],[b],[c],[]로 반환됩니다.
		 * 
		 * 
		 * "abc " 일 경우 "AbC "로 뒤에 공백포함하여 반환해야하는데 split(" ") 하면 값이 없는 C뒷부분공백은 제거되어 "AbC"로 반환됩니다. 공백포함하려면 split(String regex, int limit) limit 인자를 0보다 작게 지정해야해요

		 * 
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				String a = Character.toString(arr[i].charAt(j));
				if (j % 2 == 0) {
					answer += a.toUpperCase();
				} else {
					answer += a.toLowerCase();
				}
			}
			if (i != arr.length - 1) {
				answer += " ";
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		String s = "try hello world";

		solution(s);

	}

}
