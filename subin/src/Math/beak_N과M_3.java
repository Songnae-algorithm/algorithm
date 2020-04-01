package Math;

import java.util.*;

//순열 (중복 O)
public class beak_N과M_3 {
	static int n;
	static int m;
	static StringBuilder sb;
	static LinkedList<Integer> numbers;
	
	public static void perm(int count) {
		if(count == m) {
			for(int i:numbers)
				sb.append(i+" ");
			
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			//중복 허용이니까
			numbers.add(i+1);
			perm(count+1);
			numbers.removeLast();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sb = new StringBuilder();
		numbers = new LinkedList<>();
		
		perm(0); // 시작 idx를 넣는다
		
		System.out.println(sb.toString());
	}
}