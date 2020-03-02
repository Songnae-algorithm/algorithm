package Recursion;

import java.util.*;

//50min
public class beak_0만들기 {

	static int target = 0;
	
	//sum은 이번에 들어온 now에 부호 붙여주고 세번째 재귀때문에 now를 따로 만들어줘야했다
	//dfs(,, now*10 + (next+1)) 새로 들어온 now에 *10해주고 지금 있는 next+1 해줘야 22 이렇게 들어왔을때, 2*10 + (2+1) 가능 
	static void dfs(int sum,int sign, int num, int now, String c) {
		if(now == target) { // 기저조건 now가 target까지 왔을 때
			
			sum = sum + (num * sign); //내가 가진 sum과 이번에 들어온 num*sign이 0인지 확인한다
			if(sum == 0)
				System.out.println(c);
			return ;
		}

		dfs(sum, sign, num*10 + (now+1), now+1, c + " "+String.valueOf(now+1));
		dfs(sum + (sign* num), 1, now+1, now+1, c + "+" + String.valueOf(now+1));
		dfs(sum + (sign*num), -1, now+1, now+1, c + "-" + String.valueOf(now+1));

		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			target = sc.nextInt();
			String c = "1";
			
			dfs(0,1,1,1,c); // sum, sign, num, next, str
			
			System.out.println(" ");
		}
		
	}
}
