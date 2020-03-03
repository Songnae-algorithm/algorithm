package Recursion;

import java.util.*;

public class beak_Z {

	static int r = 0;
	static int c = 0;
	static int answer = 0;
	
	static void recursion(int x, int y, int n) {
		if(n == 1) { //사이즈가 하나 됐을 때
			if(x==r && y==c)
				System.out.println(answer);
				
			answer++;
			return;
		}
		
		int half = n/2;
		
//		System.out.println(x +" " + y + " " + n + " " + half);
		
		recursion(x, y, half); // 1사분면
		recursion(x, y+half , half); // 2사분면
		recursion(x+half, y, half); // 3사분면
		recursion(x+half, y+half, half); // 4사분면
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		
		int pow = (int)Math.pow(2, N);
		
		recursion(0, 0, pow);
		
	}
}
