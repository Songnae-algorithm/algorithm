package Greedy;

import java.util.*;

public class beak_대회or인턴 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		//k==0: 인턴 0이면 적게 만들 수 있는 팀으로 나간다
		//k!=0: 인턴으로 나가야 하는 인원이 있다면 -> 인원만큼 빼고 팀으로 나갈 수 있는 인원 체크
		System.out.println( Math.min(Math.min(n/2, m), (m+n-k)/3));
		
	}
}

// https://jaimemin.tistory.com/726