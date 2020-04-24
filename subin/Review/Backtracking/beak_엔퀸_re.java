package Backtracking;

import java.util.*;
public class beak_엔퀸_re {
	static int n;
	static int arr[][];
	static int hang[];
	static int answer = 0;
	
	public static boolean ck(int lev) {
		for(int i=0; i<lev; i++) {
			if(hang[i] == hang[lev])
				return false;
			if(Math.abs(hang[i] - hang[lev]) == Math.abs(i-lev))
				return false;
		}
		return true;
	}
	
	public static void bt(int lev) {
		if(lev == n) {
			answer++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			hang[lev] = i; // hang[i] = lev가 아니다! lev행에 i를 다 넣어보는것
			
			if(ck(lev)) { // lev행 전까지 가보는 것
				bt(lev+1);
			}
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		hang = new int[n];
				
		bt(0); // 영층부터 가본다
		
		System.out.println(answer);
	}
}
