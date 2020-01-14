package sy;

import java.util.*;

public class pr_2_전화번호목록 {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i+1; j < phone_book.length; j++) {

				if (i == j) {
					continue;
				}

				if (phone_book[j].startsWith(phone_book[i])) {
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
