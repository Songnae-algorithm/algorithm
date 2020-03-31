package Recursion;

import java.util.*;

public class beak_알약 {

	static long cache[][] = new long[1000][1000];
	
	public static long sol(int f, int h) {
		
		// 기저조건
		if(f==0 && h==1)
			return 1;
		
		 //이미 값이 들어있으면 바로 return 해서, 중복으로 여러번 돌지 않게 한다
		if(cache[f][h] != 0)
			return cache[f][h];
		
		//조건 1 -> full을 -1 해주고 half는 +1
		if(f != 0)
			cache[f][h] = cache[f][h] + sol(f-1, h+1);
		
		//조건 2 -> full 그대로 두고, half만 -1 해줄 때
		if(h != 0)
			cache[f][h] = cache[f][h] + sol(f, h-1);
		
		return cache[f][h];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == 0)
				break;
			else
				System.out.println(sol(n,0)); // n개와 h는 처음엔 0
		}
		
	}
}
