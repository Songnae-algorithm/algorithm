package Dynamic_programming;

import java.util.*;

//35 min
public class prog_2_땅따먹기 {

	static int solution(int[][] land) {
		int answer = 0;
		
		for(int i=1;i<land.length; i++) {
			for(int j=0; j<=3; j++) {
				
				int a = land[i][j]; // 따로 ij를 뽑아두고 걔와 나머지 애들을 비교해야한다!!!!
				
				for(int k=0; k<=3; k++) {
					if(j==k)
						continue;		
					else
						land[i][j] = Math.max(land[i][j], a + land[i-1][k]);
				}//for - k
			}//for - j - 4개의 숫자들이 자기자신의 위를 뺀 3번씩 더해서 max 찾기
		}//for -i
		
		for(int i=0; i<4; i++)
			answer = Math.max(answer, land[land.length-1][i]);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a[][] = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		System.out.println(solution(a));
	}
}
