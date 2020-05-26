package Programmers;

import java.util.*;

public class pr2_가장큰수3 {

	public static String solution(int[] numbers) {
		String answer = "";

		String str[] = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			str[i] = Integer.toString(numbers[i]);

		}

		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);// 두개를 더해서 더 큰거를 리턴하는 것
			}
		});

		for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
		if (answer.charAt(0) == '0') {
			answer = "0";
		}
		//0000들어왔을 때 0으로 바꿔줌
		//System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		// int arr[] = { 6, 10, 2 };
		// int arr[] = { 3, 30, 34, 5, 9 };
		// int arr[] = { 0, 0, 0, 0 };0
		// int arr[] = { 40, 403 };// 40403
		int arr[] = { 70, 0, 0, 0 };// 70000
		// int arr[]= {12,121}; //12121

		// int arr[] = { 21, 212 };// 21221

		solution(arr);
	}

}
