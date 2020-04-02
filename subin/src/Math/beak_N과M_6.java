package Math;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class beak_N과M_6 {

	static int n;
	static int m;
	static LinkedList<Integer> result;
	static StringBuilder sb;
	static LinkedList<Integer> numbers;
	
	public static void comb(int count) {
		if(count == m) {
			for(int i:result)
				sb.append(i + " ");
			
			sb.append("\n");
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(result.contains(numbers.get(i)))
				continue;
			
			//result가 가진 끝값의 number인덱스가 i이상이어야 한다.
			if(result.size()!=0 && i < numbers.indexOf(result.getLast()))
				continue;
			
			result.add(numbers.get(i));
			comb(count+1);
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
		
		comb(0);
		
		System.out.println(sb.toString());
	}
}
