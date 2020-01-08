package Stack_Queue;

import java.util.*;

public class prog_2_프린터 {

//    static public int solution(int[] priorities, int location) {
//        int answer = 0;
//        
//        //Queue는 내부를 다 훑어보지 못하므로 LinkedList 사용
//        LinkedList<Integer> index = new LinkedList<Integer>(); //index
//        LinkedList<Integer> prio = new LinkedList<Integer>(); // 중요도
//        boolean check = false;
//        
//        for(int i=0;i<priorities.length;i++) {
//        	index.add(i);
//        	prio.add(priorities[i]);
//        }
//        
//        while(true) {
//        	for(int i=1;i<prio.size();i++) {//맨앞과, 나머지 비교
//        		if(prio.get(0)<prio.get(i)) {
//        			//맨앞보다 중요도 높은 것들이 있다면 제거해서 뒤로 보내준다
//        			int rem_idx = index.remove(0);
//        			index.add(rem_idx);
//        			
//        			int rem_prio = prio.remove(0);
//        			prio.add(rem_prio);
//        			
//        			check= true;
//        		}
//        	}
//        	
//        	if(check == false) { //나보다 큰애가 없다는거
//        		if(index.get(0) == location) {
//        			answer++;
//        			break;
//        		}
//        		
//        		else {
//        			index.remove(0);
//        			prio.remove(0);
//        			answer++;
//        		}
//        	}
//        	
//        	check=false; // 빼먹지 않도록 주의한다! 자칫하면 무한루프 돌 수 있음
//        }
//        
//        
//        return answer;
//    }
	
    static class Attribute{
    	int index;
    	int prio;
    	
    	Attribute(int index, int prio){
    		this.index = index;
    		this.prio = prio;
    	}

    }
    
    static public int sol(int[] priorities, int location) {
    	int answer = 0;
    	
    	LinkedList<Attribute> att = new LinkedList<Attribute>();
    	boolean check = false;
    	
    	for(int i=0;i<priorities.length;i++)
    		att.add(new Attribute(i, priorities[i]));
 
    	while(true) {
    		for(int i=1;i<att.size();i++) {
    			if(att.get(0).prio < att.get(i).prio) {
    				check = true;
    				Attribute back = att.remove();
    				att.add(back);
    				break;
    			}
    		}//for
    		
    		if(check == false) {
    			answer++;
    			
    			if(att.get(0).index == location)
    				break;
    			
    			att.remove();
    		}
    		else
    			check = false;
    	}
    	
    	return answer;
    }
    
	public static void main(String[] args) {
		int arr[] = {1,1,9,1,1,1};
		System.out.println(sol(arr,0));
	}
}
