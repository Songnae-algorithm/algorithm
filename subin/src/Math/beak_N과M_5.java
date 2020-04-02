package Math;

import java.util.*;

public class beak_N과M_5 {

	static int n;
	static int m;
	static LinkedList<Integer> result;
	static StringBuilder sb;
	static LinkedList<Integer> numbers;
	
	public static void perm(int count) {
		if(count == m) {
			for(int i: result)
				sb.append(i + " ");
			
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(result.contains(numbers.get(i)))
				continue;
			
			result.add(numbers.get(i));
			perm(count+1);
			result.removeLast();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sb = new StringBuilder();
		numbers = new LinkedList<>();
		result = new LinkedList<>();
		
		for(int i=0; i<n; i++)
			numbers.add(sc.nextInt());
		
		numbers.sort(null);
		
		perm(0);
		
		System.out.println(sb.toString());
	}
	
}
