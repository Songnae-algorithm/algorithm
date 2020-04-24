package Dfs_Bfs;

import java.util.*;

public class beak_케빈베이컨의법칙_re {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		int arr[][] = new int[m][2];
		
		sc.nextLine();
		
		for(int i=0; i<m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int answer []= new int[n+1];
		
		for(int i=1; i<=n; i++) {
			Queue<Integer> qu = new LinkedList<>();
			boolean v[] = new boolean[n+1];
			int sum[] = new int[n+1];
			
			qu.add(i);
			v[i] = true;
			
			while(!qu.isEmpty()) {
				int x = qu.poll();
				
				for(int j=0; j<m; j++) {
					if(arr[j][0] == x && !v[arr[j][1]]) {
						//걔까지는 갈수있으니까
						qu.add(arr[j][1]);
						v[arr[j][1]] = true;
						sum[arr[j][1]] += sum[arr[j][0]] +1;
					}
					
					if(arr[j][1] == x && !v[arr[j][0]]) {
						//걔까지는 갈수있으니까
						qu.add(arr[j][0]);
						v[arr[j][0]] = true;
						sum[arr[j][0]] += sum[arr[j][1]] +1;
					}
				}
				
			}//while
			
			for(int k:sum) {
				answer[i] += k;
			}	
		}
		
		int idx = 0;
		int real = answer[n];
		for(int i=n-1; i>=1; i--) {
			if(real>=answer[i]) {
				real = answer[i];
				idx = i;
			}
		}
	
		System.out.println(idx);
	}
}
