package Backtracking;

import java.util.*;

//1h
public class beak_NQueen {

	static int n;
	static int answer = 0;
	//cols에는 각 행마다의 "열" 값이 들어있음
	static int cols[]; //cols[level] = x;라면 level이라는 행에 x값은 열; 고로 (level,x) 의미
	
	static public boolean isPossible(int level) {
		//level행에 걸치는지 or i열에 걸치는지
		//대각선에 위치하는지
		//의 조건에만 false
		
		//level전까지의 행의 열값 중 같은것이 존재하는지
		for(int i=0; i<level; i++) {
			//새로 넣고 들어온 level행의 i열 퀸과 전에 존재하던 열에 겹치는게 있다면
			if(cols[level] == cols[i])
				return false;
			//i번째 퀸의 위치와 level 위치의 퀸이 대각선에 존재할 때,
			//level행 - i행 == level열 - i열 이 같으면 대각선!
			if(Math.abs(level-i) == Math.abs(cols[level]- cols[i]))
				return false;
		}
		
		return true;
	}
	
	static public void back_tracking(int level) {
		//level : level-1 까지는 검증 된것이고, level 행을 검증할 차례
		if(level == n) {//0행부터시작해서 n-1까지 만족한거니까 n이라면 그 전을 전부 만족한것
			answer++;
			//만약 각 행의 퀸의 위치(열)를 알고싶다면 cols[i]출력하면 됨
			//for(i<n) sout(cols[i]);
		}
		
		else {
			//level-1까지는 조건대로 만족이고
			//level 행에 (0~n)열까지 퀸 넣어보기
			
			for(int i=0; i<n; i++) {
				cols[level] = i; //level행에 i번째 열에 퀸 넣어보기
				if(isPossible(level)) {
					//퀸을 놔도 되면
					// 다음행으로 넘어가기
					back_tracking(level+1);
				}
			}
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		cols = new int[n];
		boolean visited[][] = new boolean[n][n];
		
		back_tracking(0);
		
		System.out.println("answer " + answer);
	}
}
