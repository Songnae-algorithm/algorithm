package Dfs_Bfs;

import java.util.*;

public class beak_Dfs와Bfs {
	
	public static void dfs(int arr[][], boolean check[], int v) {
		check[v] = true;
		
		System.out.print(v + " ");
		
		for(int i=1;i<arr.length;i++) {
				if(i==v)
					continue;
				
				if(arr[v][i] == 1 && check[i] == false) {
					//check[i] = true; 두번 걸어주면 안된다
					dfs(arr, check, i);
				}
		}//for
		
	}
	
	public static void bfs(int arr[][], int v) {
		Queue<Integer> qu = new LinkedList<Integer>();
		boolean check[] = new boolean[arr.length+1]; // false로 초기화
		
		qu.offer(v);
		check[v] = true;
		
		while(!qu.isEmpty()) {
			int x = qu.poll();
			
			System.out.print(x + " ");
			
			for(int i=1;i<arr.length; i++) {
				if(i == x)
					continue;

				if(arr[x][i] == 1 && check[i]== false) {
					qu.offer(i);
					check[i] = true;
				}
			}//for
			
		}//while
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n*n 행렬
		int m = sc.nextInt(); //몇개의 간선이 연결되어 있는지
		int v = sc.nextInt(); //몇번째 행부터 시작할건지
		
		int arr[][] = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
			
		boolean check[] = new boolean[arr.length+1]; // false로 초기화
		
		dfs(arr, check, v);
		System.out.println("");
		bfs(arr, v);
	}
}
