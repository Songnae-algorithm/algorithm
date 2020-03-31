package Dfs_Bfs;

import java.util.*;

public class beak_re_케빈베이컨의6단계법칙 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[m][2];
		int cnt[] = new int[n+1];
		
		for(int i=0;i<m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			Queue<Integer> qu = new LinkedList<>();
			boolean visited[] = new boolean[n+1];
			int c[] = new int[n+1];
			
			qu.add(i);
			visited[i] = true;
			
			System.out.println("i가 " + i);
			
			while(!qu.isEmpty()) {
				int x = qu.poll();

				System.out.println("x는  " + x + "와 c[x]는  "+c[x]);
				
				for(int j=0; j<arr.length; j++) {

					if(arr[j][0] == x && !visited[arr[j][1]]) {
						visited[arr[j][1]] = true;						
						qu.add(arr[j][1]);
						c[arr[j][1]] = c[x]+1;
						cnt[i] += c[arr[j][1]];
					}
					
					else if(arr[j][1] == x && !visited[arr[j][0]]) {
						visited[arr[j][0]] = true;						
						qu.add(arr[j][0]);
						c[arr[j][0]] = c[x]+1;
						cnt[i] += c[arr[j][0]];
					}
						
				}
			}//while - bfs
		}//for
		
		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		for(int i=cnt.length-1; i>=1; i--) {
			if(min >= cnt[i]) {
				min = cnt[i];
				idx = i;
			}
		}
			
		System.out.println(idx);
	}
}
