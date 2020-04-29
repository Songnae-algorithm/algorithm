package Programmers;

public class pr1_2016년_2 {

	// 4/27 22:46 start ~ 23:13 

	public static String solution(int a, int b) {
		String answer = "";

		int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//문제조건을 잘보자...2016년은 윤년이라 2월은 29일.......
		String day[] = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		// 0일 때 thu

		int allday = 0;

		for (int i = 0; i < a - 1; i++) {
			allday += month[i];
		}

		allday = allday + b;

		answer = day[allday % 7];

		return answer;
	}

	public static void main(String[] args) {

		solution(5, 24);
	}
}
