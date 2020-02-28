package Greedy;

import java.util.*;

//35
public class beak_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		int arr[] = new int[10]; //9까지 담아야함
		int sum = 0;
		
		for(int i=0;i<a.length(); i++) {
			arr[a.charAt(i)-'0']++;
			sum = sum + a.charAt(i)-'0';
		}
		
		//30의 배수가 되는 조건
		//1) 각 자리수의 합이 3의 배수이다
		//2) 0의 개수가 1개 이상인 모든 조건을 만족할때만 true
		if(sum%3 !=0 || !a.contains("0")) {
			System.out.println(-1);
			return;
		}
		
		//string을 쓰는 것과 stringBuilder를 쓰는 것에 약 10배의 ms차이가 났다
		StringBuilder s = new StringBuilder();
		for(int i=9; i>=0; i--) {
			while(arr[i]>0) {
				s.append(i);
				arr[i]--;
			}
		}
		System.out.println(s.toString());
	}
	
}

// https://pangsblog.tistory.com/87