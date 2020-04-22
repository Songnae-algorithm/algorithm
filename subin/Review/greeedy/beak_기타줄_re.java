package greeedy;

import java.util.*;

public class beak_기타줄_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
	
		int p = Integer.MAX_VALUE;
		int g = Integer.MAX_VALUE;
		
		for(int i=0; i<m; i++) {
			p = Math.min(p, sc.nextInt());
			g = Math.min(g, sc.nextInt());
		}
		
		int answer = 0;
		answer = Math.min(Math.min((n/6 + 1)*p, (n/6)*p + (n%6)*g),n*g); 
		
		System.out.println(answer);
	}
}
