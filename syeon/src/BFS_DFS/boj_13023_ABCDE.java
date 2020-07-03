package BFS_DFS;

import java.util.*;

public class boj_13023_ABCDE {
	
	public static void main(String[] args) {
		//문제이해안됨 ㅂ2
		Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		int in=sc.nextInt();
		
		int arr[][]=new int[a][a];
		
		for(int i=0;i<in;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			arr[x][y]=1;
			arr[y][x]=1;
			
		}//arr에 입력 
		
		
	}
}
