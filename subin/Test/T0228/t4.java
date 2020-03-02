package T0228;

import java.util.*;

//30min
public class t4 {

    static public int solution(int[] bricks) {
        int answer = 0;
        
        int max = 0; // 행 개수
        for(int i=0;i<bricks.length; i++)
        	max = Math.max(max, bricks[i]);
        
        int arr[][] = new int[max][bricks.length];

        for(int i=0; i<bricks.length; i++) {
        	if(bricks[i] !=0) {
        		for(int j=0; j<bricks[i]; j++)
        			arr[j][i] = 1;
        	}
        }
        
        for(int i=0 ;i<max; i++) {
        	int f_i = 0;
        	for(int j=0; j<bricks.length; j++) {
        		if(arr[i][j] == 1) {
        			f_i = j;
        			break;
        		}
        	}
        	
        	int l_i = 0;
        	for(int j=f_i; j<bricks.length; j++) {
        		if(arr[i][j] == 1) {
        			l_i = j;
        		}
        	}
        	
        	for(int j=f_i; j<l_i; j++) {
        		if(arr[i][j] == 0) {
        			answer += 1;
        		}
        	}
        	
        }//out for
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(solution(arr));
	}
}
