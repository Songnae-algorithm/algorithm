package Greedy;

import java.util.*;

public class beak_한줄로서기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();	
		int arr[] = new int[c+1];
		List<Integer> answer = new ArrayList<>();
		
		for(int i=1; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		for(int i=c; i>=1; i--)
			answer.add(arr[i], i);
		
		for(int k : answer)
			System.out.print(k + " ");
		
	}
}
