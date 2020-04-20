package Programmers;

import java.util.*;

public class pr_2_전화번호목록 {
	//성공코드

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);
		
		//정렬하면 앞에있는 문자열들이 제일 작기 때문에 정렬해주면 한번만 돌아도 된당
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				
				if (phone_book[j].startsWith(phone_book[i])) {
					//startsWith를 써서 접두어 체크 

					answer = false;
					break;
				}
			}
		}
//System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {

		String arr[] = { "119", "97674223", "1195524421" };
		solution(arr);
	}

}
