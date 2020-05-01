package Programmers;

public class pr1_최대공약수와최소공배수 {

	public static int[] solution(int n, int m) {

		// 4/3- 20:06- 20: 24 
		
		int[] answer = new int[2];
		int a = 0;// 최대공약수
		int b = 0; // 최소공배수

		if (n > m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		//n이 더 크면 순서 바꿔줌
		
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && m % i == 0) {
				a = i;
			}
		} // 최대공약수 구하기

		b = (n / a) * (m / a) * a;
		//최소공배수 

		answer[0] = a;
		answer[1] = b;
		

		return answer;
	}

	public static void main(String[] args) {

		solution(3, 12);
		solution(2, 5);
	}
}
