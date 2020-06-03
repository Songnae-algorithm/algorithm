package DP;

public class pr2_가장큰정사각형찾기 {
	
	    public int solution(int [][]board)
	    {
	        int arr[][]=new int [board.length+1][board[0].length+1];
	        int answer =0;
	        
	        //새로운 arr를 만든 이유 : 그냥 진행하게 되면 board의 첫번째 행, 첫번째 열에만 1이 있고 나머지가 0인 경우를 봐주지 못하기 때문에 한 칸씩 대각선으로 밀어서 다 봐준다( 0행, 0열에 0을 추가함 )
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[1].length;j++){
	                if(board[i][j]==1){
	                    arr[i+1][j+1]=1;
	                }
	            }
	        }
	        for(int i=1;i<arr.length;i++){
	            for(int j=1;j<arr[0].length;j++){
	                if(arr[i][j]==1){
	                    //내가 1 이면, 내 왼,위, 대각선 위에중에 가장 작은 값 +1 이 내 값이 된다 
	                int min= Math.min(arr[i-1][j], Math.min(arr[i][j-1],arr[i-1][j-1] ));
	                    arr[i][j]=min+1;
	                    answer=Math.max(answer,arr[i][j]);
	                    //arr중 젤 큰 값 answer에
	                    
	                }
	            }
	        }
	        return answer*answer;
	    }
	
	    public static void main(String[] args) {
			
		}
}



	/*
	import java.util.*;

	class Solution

	{
	    static int cnt=0;
	    
	    public static void bfs(int[][] board, int x, int y){
	        for(int i=0;i<board.length;i++){
	            int nx=x+i;
	            int ny=y+i;
	            
	            if(nx<board.length&&ny<board[1].length&&board[nx][ny]==1&&board[nx][y]==1 && board[x][ny]==1){
	                cnt=Math.max(cnt,(i+1)*(i+1));
	            }
	        }
	    }
	    public int solution(int [][]board)
	    {
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[1].length;j++){
	                if(board[i][j]==1){
	                    bfs(board,i,j);
	                }
	            }
	        }
	        

	        int answer=cnt;
	        System.out.println(cnt);

	        return answer;
	    }
	}
	*/


