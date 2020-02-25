package Greedy;

import java.util.*;

//30min
public class beak_로프 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int size = 1;
		int max = 0;
		
		//제일 작은 숫자 * size가 답이 아니고 중량으로 칠 수 있는거 * size가 제일 큰게 답이라는것!
		for(int i=arr.length-1; i>=0; i--) {
			max = Math.max(max, arr[i] * size);
			size++;
		}
		
		System.out.println(max);
	}
}