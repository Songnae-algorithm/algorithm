package 이분탐색;

public class beak_예산 {

    static public int solution(int[] budgets, int M) {
    	int answer=0;
    	int max = Integer.MIN_VALUE;
    	
    	for(int i=0; i<budgets.length; i++)
    		max = Math.max(max, budgets[i]);
    	
    	int min = 0; //가장 작은 값과
    	
    	while(true) {
    		//min이 max넘어가면 끝
    		System.out.println(min + " " + max);
    		if(min > max)
    			break;
    		
    		int mid = (min+max)/2;
    		
    		long tempSum = 0;//mid를 저대로 뒀을때 조건에 만족하는지?
    		for(int i=0; i<budgets.length; i++) {
    			if(budgets[i] >mid)//budget이 더 크면
    				tempSum = tempSum+mid;//mid로 더함
    			else
    				tempSum = tempSum+budgets[i];
    		}
    		
    		if(tempSum>M)//max를 더 작게 예산 배정하기
    			max = mid-1;
    		else{//tempSum이 M보다 작으면 더 많은 예산 배정
    			min = mid+1;
    			answer = Math.max(answer, mid);
    		}
    	}
    	
    	//최종답은 (min+max)/2의 중간값인 mid
    	return answer;
    }
	
	public static void main(String[] args) {
		int b[] = {120,110,140,150};
		
		System.out.println(solution(b, 485));
	}
}
