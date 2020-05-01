package Programmers;

public class pr1_콜라츠추측 {

	public static int solution(long num) {

		// 4/30 20:38 - 47
		//타입을 int 말고 long으로 바꿔줘야 함 ㅡㅡ
		
		int answer = 0;

		while (num != 1) {

			if (num % 2 == 0) {
				// 짝수일때는 2로 나눔
				num /= 2;
				answer++;
			} else {
				num = num * 3 + 1;
				answer++;
			}

			if (answer >= 500) {
				
				return -1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		solution(6);// 8
		//solution(16);// 4
		solution(626331);

	}

}
