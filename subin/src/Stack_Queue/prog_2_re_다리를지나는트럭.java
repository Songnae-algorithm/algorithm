package Stack_Queue;

import java.util.*;

public class prog_2_re_다리를지나는트럭 {
	static class Pos{
		int size;
		int on_bri;
		
		Pos(int size, int on_bri){
			this.size = size;
			this.on_bri = on_bri;
		}
	}
	
    static public int solution(int bridge_length, int weight, int[] truck_weights) {
    	
    	LinkedList<Pos> trk = new LinkedList<>();
    	int size = truck_weights.length;
    	
    	//일단 넣고 시작
    	trk.add(new Pos(truck_weights[0],1)); //0들어가고 1번째르 건너고있다
    	int idx = 1; //다음 트럭의 위치
    	int second = 1; // 하나 쌓았으니까 1초 지나감
    	size = size-1;
    	
    	while(size!=-1) {
    		//trk가 안비어있으면 
    		if(!trk.isEmpty()) {
    			//한칸씩 다 움직여주기
    			for(int i=0; i<trk.size(); i++)
    				trk.set(i, new Pos(trk.get(i).size,trk.get(i).on_bri+1));
    			
    			//그리고 다음거 들어올 수 있나 보기
    			if(idx<truck_weights.length) {
    				int wei = 0;
    				for(int i=0; i<trk.size(); i++)
    					wei += trk.get(i).size;
    				
    				//지금 있는거 wei에 다음 weight 추가한게 적재 가능하면
    				if(wei+truck_weights[idx] <= weight) {
    					trk.add(new Pos(truck_weights[idx],1));
    					idx++;
    				}
    			}
    			
    			//맨 처음게 나갈 시간이면 빼주기
    			if(trk.get(0).on_bri == bridge_length) {
    				trk.remove();
    				size = size-1;
    			}
    			
    		}
    		//트럭이 비었으면 무조건 한개 적재!
    		else {
    			trk.add(new Pos(truck_weights[idx],1));
    			idx++;
    		}

    		//시간 증가시키기
    		second++;
    	}//while

    	return second+1;
    }
    
    public static void main(String[] args) {
		int s[] = {10};
    	System.out.println(solution(100,100,s));
	}
}
