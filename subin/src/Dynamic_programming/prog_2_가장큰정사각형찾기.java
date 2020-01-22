package Dynamic_programming;

import java.util.*;

public class prog_2_가장큰정사각형찾기 {
	
	//1h 30min
    static public int solution(int board[][]){
        int arr[][] = new int[board.length+1][board[0].length+1];
    	int answer = 0;
        
    	for(int i=1;i<arr.length; i++) {
    		for(int j=1; j<arr[0].length; j++){
    			if(board[i-1][j-1] == 1)
    				arr[i][j] = 1;
    		}
    	}
    	
        for(int i=1; i<arr.length; i++) {
        	for(int j=1; j<arr[0].length; j++) {
        		if(arr[i][j]==1) {
        			int min = Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i-1][j-1]));
        			arr[i][j] = min+1;
        			answer = Math.max(answer, arr[i][j]);
        		}
        	}	
        }
        
        return answer * answer;
    }
	
	public static void main(String[] args) {
		int b[][] = {{0,0,1,1},{1,1,1,1}};
		System.out.println(solution(b));
	}
}
