package Math;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class beak_N과M_6 {

	static int n;
	static int m;
	static LinkedList<Integer> numbers;
	static StringBuilder sb;
	static int arr[];
	
	public static void comb(int count) {
		if(count == m) {
			for(int i:numbers)
				sb.append(i + " ");
			
			sb.append("\n");
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(numbers.contains(arr[i]))
				continue;
			
			if(numbers.size()!=0 && i<numbers.get(numbers.size()-1))
				continue;
			
			numbers.add(arr[i]);
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
		arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		comb(0);
		
		System.out.println(sb.toString());
	}
}
