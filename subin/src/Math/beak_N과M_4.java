package Math;

import java.util.*;


//조합 (중복 O)
public class beak_N과M_4 {
	static int n;
	static int m;
	static StringBuilder sb;
	static LinkedList<Integer> numbers;
	//nCm
	public static void comb(int count) {
		if(count == m) {
			for(int i:numbers)
				sb.append(i + " ");
			sb.append("\n");
			
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(numbers.size() !=0 && i<numbers.getLast()-1)//중복을 위해서는 자기자신도 돌아야 하기때문에 -1
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
		
		numbers = new LinkedList<>();
		sb = new StringBuilder();
		
		comb(0);
		
		System.out.print(sb.toString());
		
	}
}
