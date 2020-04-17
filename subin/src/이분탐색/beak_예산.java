package 이분탐색;

import java.util.Arrays;

public class beak_예산 {

    static public int solution(int[] budgets, int M) {
        int answer = 0;
        Arrays.sort(budgets);
        
        int len = budgets.length;
        int min = 0;
        int max = M; //초기화 max는 예산
        int prem = 0, mid = 0;
        long sum = 0;//전부 다 더하기 budgets
        
        for(int i : budgets)
        	sum = sum+i;
        
        if(sum < M)
        	return budgets[len-1];// 제일 큰 값 return
        
        while(true) {
        	sum = 0; // 다시 초기화
        	mid = (max + min)/2; //이분 탐색이므로 계속 /2해줄 예정
        	
        	if(mid == prem)
        		break;
        	
        	for(int i=0; i<len; i++) {
        		if(mid <= budgets[i]){
        			sum = sum+ mid*(len-i);
        			break;
        		}
        		else
        			sum = sum+ budgets[i];
        	}
        	
        	if(sum <=M)
        		min = mid;
        	else
        		max = mid;
        	
        	prem = mid;
        	
        	System.out.println(sum + " " + mid + " " + prem + " " + min + " " + max);
        }
        
        answer = mid;
        
        return answer;
    }
	
	public static void main(String[] args) {
		int b[] = {120,110,140,150};
		
		System.out.println(solution(b, 485));
	}
}
