package Dfs_Bfs;

import java.util.*;

public class beak_경로찾기 {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		Queue<Integer> q = new LinkedList<Integer>();
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		}
		
		
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1) {//i행부터 갈 수 있는 길들을 큐에 추가 
					q.add(j);
				}
			}
			
			//bfs -> i층인 동안 1로 연결된 곳 다 찾아들어가서 1로 만들어준다!
			while(!q.isEmpty()) {
				int temp = q.poll();
				
				arr[i][temp] =1;	//i에서 tmp는 갈 수 있으므로 1로 변경
				for(int j=0; j<arr.length; j++) {
					if(arr[temp][j] ==1 && arr[i][j] !=1) //arr[i][j]==1인데 큐에 넣으면 무한루프를 돌게 될 수 있으므로 조건 추가
						q.add(j);
				}
				
			}
		}//out for
		

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+ " ");
			System.out.println(); // println.(" ") -> 이거했다고 출력형식이 잘못됐다고 뜸...;
		}
		
	}

}

/*
	//그 값으로 돌아오면 1, 못돌아오면  0을 return 한다
	//x행이 y랑 연결돼있으면 타고 넘어가
	
	static int dfs(int arr[][], int x, int y) {
//		System.out.println("arr[" +x +"][" + y+ "] =" + arr[x][y] + "y" + y);
		
		if(arr[x][y] == y)
			return y;
		
		else {
			for(int i=0; i<arr.length; i++) {
				if(arr[x][i] != -1)
					dfs(arr,i,y);
			}			
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				if(arr[i][j] == 1)
					arr[i][j] = j;
				else
					arr[i][j] = -1;
		}
		
		
		int ans[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("??" + dfs(arr,i,j));
				ans[i][j] = dfs(arr,i,j);
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
*/