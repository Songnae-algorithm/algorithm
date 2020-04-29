package Programmers;

import java.util.*;

public class pr1_자연수뒤집어배열로만들기2 {
	public static int[] solution(long n) {

		ArrayList<Integer> list = new ArrayList<>();

		while (n > 0) {
			list.add((int) (n % 10));
			n = n / 10;

		}
		int answer[] = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			
		}
		return answer;
	}
	
	/*
	 *
	 * 
class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}

	 */

	public static void main(String[] args) {
		solution(12345);

	}
	
	

}
