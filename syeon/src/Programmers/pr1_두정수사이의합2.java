package Programmers;

import java.util.*;

//4/27 1:20 start // 1:25 fin
public class pr1_두정수사이의합2 {
	public static long solution(int a, int b) {
		long answer = 0;

		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		// b가 더 큰 경우에 위치를 바꿔줌

		// b가 더 큰 경우에 위치를 바꿔줌
        //굳이 a b 같은경우를 따로 봐 줄 필요가 없다 ! 
		
		for (int i = a; i <= b; i++) {
			answer += i;
		}
		

		return answer;
	}

	public static void main(String[] args) {
		solution(3, 5);
		solution(3, 3);
		solution(5, 3);
	}

}
