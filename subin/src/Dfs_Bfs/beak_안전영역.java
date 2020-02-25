package Dfs_Bfs;
import java.util.*;


//35min
public class beak_안전영역 {

	static int[][] color(int arr[][], int n) {
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(arr[i][j] <=n)
					arr[i][j] = 0;
			}
		}
		
		return arr;
	}
	
	static void dfs(int arr[][], int x, int y) {
		arr[x][y] =0;
		
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		
		for(int i=0; i<4;i ++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			
			if(newx>=0 && newx<arr.length && newy>=0 && newy<arr.length && arr[newx][newy]!=0)
				dfs(arr,newx,newy);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		int height [] = new int[101];
		
		int answer = 1; // 전부 물에 잠기지 않을경우는 영역이 1개이기 떄문에 초기화를 0이아니고 1로 해주어야 한다 
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
				height[a] = 1;
			}
		}
		
		for(int i=1;i<height.length;i++) {
			if(height[i] == 1) {
				
				int new_arr[][] = new int[n][n]; //arr 배열을 new_arr배열 만들어서 돌려보는 법!
				
				for(int k=0; k<n; k++) {
					for(int l=0; l<n; l++) {
						new_arr[k][l] = arr[k][l]; // new_arr에 arr 넣기 -> 이걸 반복해줘야 arr여러번 사용 가능
					}
				}
				
				new_arr = color(new_arr,i);
				
				int max = 0;
				for(int k=0; k<n; k++) {
					for(int l=0; l<n; l++) {
						if(new_arr[k][l] !=0) {
							dfs(new_arr,k,l);
							max++;
						}
					}
				}//middle for
				
				answer = Math.max(answer, max);
				
			}//if
		}//out for
		
		System.out.println(answer);
		
	}
}
