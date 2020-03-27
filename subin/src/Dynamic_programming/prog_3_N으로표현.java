package Dynamic_programming;

import java.util.*;

public class prog_3_N으로표현 {

	static int answer = -1;
	public static void dfs(int n, int number, int cnt, int prev) {
		int temp = n; //

		if(cnt>8) // 8보다 커지면 -1
			return;
		
		if(number == prev) { //숫자가 같을 때
			System.out.println(cnt + " " + answer + " " + prev);
			if(answer == -1 || answer >cnt) //answer가 -1일때 최초로 바뀌는거니까 or answer가 cnt보다 클 떄
				answer = cnt;
			return;
		}
		
		for(int i=0; i<8-cnt; i++) {
			dfs(n,number, cnt+i+1, prev- temp);
			dfs(n,number, cnt+i+1, prev + temp);
			dfs(n,number, cnt+i+1, prev * temp);
			dfs(n,number, cnt+i+1, prev / temp);
			
			temp = temp*10 + n;
		}
		
	}
	
    public static int solution(int N, int number) {
    	
    	dfs(N,number,0,0);
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(5,12));
	}
}
