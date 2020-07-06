package BFS_DFS;

import java.util.*;

public class boj_3055_탈출2 {
	
	
	static class map {
		int x;
		int y;
		int cnt = 0;

		public map(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}//고슴도치 이동

		public map(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}//물 

	
	static char arr[][];
	static Queue<map> watermap=new LinkedList<>(); //물 
	static Queue<map> gomap=new LinkedList<>();//고슴도치

	static int desx=0;
	static int desy=0;
	
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,1,-1};
	
	
	
	
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	arr=new char [n][m];
	
	for(int i=0;i<arr.length;i++) {
		String s= sc.nextLine();
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=s.charAt(j);
			
			if(arr[i][j]=='D') {
				desx=i;
				desy=j;
				
			}
			if (arr[i][j]=='*') {
				watermap.add(new map(i,j));
			}
			if(arr[i][j]=='S') {
				gomap.add(new map(i,j,0));//고슴도치는 한개니까 첨 발견했을땐 count 0 
			}
			
		}
	}//배열에 입력
	
	while(!gomap.isEmpty()) {
		
		map w=watermap.poll();
		
		int wx=w.x;
		int wy=w.y;
		
		for(int i=0;i<4;i++) {
			int nwx=wx+dx[i];
			int nwy=wy+dy[i];
			
			if(nwx>=0 && nwx<arr.length && nwy>=0 && nwy<arr[0].length && arr[nwx][nwy]=='.') {
				arr[nwx][nwy]='*';//범위초과 안하고 옆에가 . 일때만 *(물로 바꿈)
				watermap.add(new map(nwx,nwy));
			}
			
		}
		
		
		map go =gomap.poll();
		
		int x=go.x;
		int y= go.y;
		
		for(int i=0;i<4;i++) {
			
		
		int nx=x+dx[i];
		int ny=y+dy[i];
		
		if(nx>=0 && nx<arr.length && ny>=0 && ny<arr[0].length && arr[nx][ny]=='.') {
			arr[nx][ny]='S';//범위초과 안하고 옆에가 . 일때만 
			watermap.add(new map(nwx,nwy));
		}
		
	}
		
	}//while
	
		
	}//main

}
