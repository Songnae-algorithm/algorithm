package Heap;

import java.util.*;

public class prog_2_라면공장 {

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        //원래는 오름차순인 pq를 내림차순으로 바꿔준다.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        int idx = 0; //dates의 개수만큼만 작동하게 한다. i를 활용하면 k-1까지 가니까 다른 변수 사용해야함
        
        for(int i=0;i<k;i++) {//i는 하루하루 지나는 날짜, k-1만큼만 돈다.
        	//아 들어가지않아도 dates[3]을 검사하면서 이미 error!!!!
        	if(idx < dates.length &&i == dates[idx]){//dates는 정렬되어있으므로 dates[0], dates[1], dates[2]..
        		pq.offer(supplies[idx]); // 같은 위치에 있는 supplies[0], supplies[1],,,을 pq에 넣고
        		idx++;//다음 data를 위해 idx는 증가시킨다.
        	}
        	
        	if(stock == 0) {//0이 되면 새로운 pq의 새로운 supplies를 충전해야하고 이때 맨앞에있는 값이 제일 크므로 stock에 더해줌
        		stock = stock+ pq.poll();
        		answer++; //pq에서 빠질 때마다 해외에서 공급해오는 것이기떄문에 answer+1
        	}
        	
        	//for문 한번 돌때마다 무조건 stock은 -1
        	stock = stock-1;
        }
        
        
        return answer;
    }
    
	public static void main(String[] args) {
		int dates[] = {4,10,15};
		int supplies[] = {20,5,10};
		
		System.out.println(solution(4,dates,supplies,30));
	}
}
