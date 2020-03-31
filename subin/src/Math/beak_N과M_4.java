package Math;

import java.util.*;

public class beak_N과M_4 {
	static int n;
	static int m;
	static StringBuilder sb;
	static Stack<Integer> already;
	
	//nCm
	public static void comb(int x, String s) {
		if(x == m) {//trim 앞의 공백을 제거해준다.
			sb.append(s.trim() + "\n");	
		}
		else {
			++x;
			for(int i=1; i<=n; i++) {
				if(already.isEmpty() || i>= already.peek()) {//123일때 3이전의 수가 못들어오게 함으로써 순서 유지
					already.push(i);
					comb(x, s + " " + i); //얘 때문에 trim 필요!
					already.pop();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sb = new StringBuilder();
		already = new Stack<>();
		
		comb(0,"");
		
		System.out.print(sb.toString());
		
	}
}
