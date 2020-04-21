package Stack_Queue;

import java.util.*;
public class prog_다리를지나는트럭 {
	static class Truck{
		int wei;
		int step;
		
		Truck(int wei, int step){
			this.wei = wei;
			this.step = step;
		}
	}
	
	 static public int solution(int bridge_length, int weight, int[] truck_weights) {
		 int sec = 0;
		 
		 LinkedList<Truck> trk = new LinkedList<>();
		 
		 //일단 첫번째거 적재
		 trk.add(new Truck(truck_weights[0], 1));
		 sec = 1;
		 int idx = 1;
		 int size = truck_weights.length-1;
		 while(size != -1) {
			 if(!trk.isEmpty()) {
				 //무조건 있는애들 다 옮겨주기
				 for(int i=0; i<trk.size(); i++) {
					 trk.set(i, new Truck(trk.get(i).wei, trk.get(i).step+1));
				 }
				 //****이부분 자꾸 빼먹지 말기!!
				 if(idx<truck_weights.length) {
					 //들어올 수 있는지 확인
					 int we = 0;
					 for(int i=0; i<trk.size(); i++) {
						 we += trk.get(i).wei;					 
					 }
					 
					 if(we + truck_weights[idx] <=weight) {
						 trk.add(new Truck(truck_weights[idx], 1));
						 idx++;
					 }
				 }
				 //***
				 
				 //나갈 수 있는지 확인
				 if(trk.get(0).step == bridge_length) {
					 trk.remove();
					 size--;
				 }
			 }
			 else {//적재 고고링
				 trk.add(new Truck(truck_weights[idx], 1));
				 idx++;
			 }
			 
			 sec++;//초 증가
		 }
		 
		 return sec+1;
	 }  
}
