package Programmers;

import java.util.*;

public class pr2_전화번호목록2 {

	public static boolean solution(String[] phone_book) {
		// 5/29 01:30-39
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (i == j) {
					continue;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					break;
				}

			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		String s[] = { "119", "97674223", "1195524421" };// true

		String a[] = { "123", "456", "789" };// false

		String aa[] = { "12", "123", "1235", "567", "88" };// true

		solution(a);
	}

}

/*
 * 
 * import java.util.Arrays;
 * 
 * class Solution { public boolean solution(String[] phoneBook) {
 * Arrays.sort(phoneBook); boolean result = true; for (int i=0;
 * i<phoneBook.length-1; i++) { if (phoneBook[i+1].contains(phoneBook[i])) {
 * result = false; break; } } return result; } }
 * 
 */
