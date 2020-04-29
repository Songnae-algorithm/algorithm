package Programmers;

public class pr1_정수제곱근판별 {

	public static long solution(long n) {
		// 4/29 17:50 -18:00;
		// 5분만에 풀었으나 i=1일경우에 리턴이 4가 안돼서.....흠...
		//math.sqrt(a,b);-->제곱근을 판별해쥼당 

		  long answer = -1;

	        for (int i = 1; i < n / 2; i++) {
	            if (Math.pow(i, 2) == n) {
	                answer = (long) Math.pow(i + 1, 2);
	                break;
	            }
	        }

	        if (n == 1) {
				answer = 4;
			}

	        return answer;
	    }

	/*
	 * if (Math.pow((int)Math.sqrt(n), 2) == n) { return (long)
	 * Math.pow(Math.sqrt(n) + 1, 2); }
	 * 
	 */

	public static void main(String[] args) {
		solution(1);

		solution(3);

	}

}
