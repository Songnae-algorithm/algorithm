package Math;

import java.util.*;

//조합 (중복 x)
public class beak_N과M_2 {

	static int n;
	static int m;
	static StringBuilder sb;
	static LinkedList<Integer> numbers;
	
	public static void comb(int count) {
		if(count == m) {
			for(int i: numbers)
				sb.append(i + " ");
			
			sb.append("\n");	
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(numbers.contains(i+1))
				continue;
			
			if(!numbers.isEmpty() && i<numbers.getLast()) // i가 numbers의 맨 끝 값보다 작을때는 continue 
				continue;
			
			numbers.add(i+1);
			comb(count+1);
			numbers.removeLast();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sb = new StringBuilder();
		numbers = new LinkedList<>();
		
		comb(0);
		
		System.out.println(sb.toString());
	}
}


//https://limkydev.tistory.com/186  -> 순열, 중복순열, 조합, 중복조합