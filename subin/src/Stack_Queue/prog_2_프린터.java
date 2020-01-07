package Stack_Queue;

import java.util.*;

public class prog_2_������ {

    static public int solution(int[] priorities, int location) {
        int answer = 0;
        
        //Queue�� ���θ� �� �Ⱦ�� ���ϹǷ� LinkedList ���
        LinkedList<Integer> index = new LinkedList<Integer>(); //index
        LinkedList<Integer> prio = new LinkedList<Integer>(); // �߿䵵
        boolean check = false;
        
        for(int i=0;i<priorities.length;i++) {
        	index.add(i);
        	prio.add(priorities[i]);
        }
        
        while(true) {
        	for(int i=1;i<prio.size();i++) {//�Ǿհ�, ������ ��
        		if(prio.get(0)<prio.get(i)) {
        			//�Ǿպ��� �߿䵵 ���� �͵��� �ִٸ� �����ؼ� �ڷ� �����ش�
        			int rem_idx = index.remove(0);
        			index.add(rem_idx);
        			
        			int rem_prio = prio.remove(0);
        			prio.add(rem_prio);
        			
        			check= true;
        		}
        	}
        	
        	if(check == false) { //������ ū�ְ� ���ٴ°�
        		if(index.get(0) == location) {
        			answer++;
        			break;
        		}
        		
        		else {
        			index.remove(0);
        			prio.remove(0);
        			answer++;
        		}
        	}
        	
        	check=false; // ������ �ʵ��� �����Ѵ�! ��ĩ�ϸ� ���ѷ��� �� �� ����
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int arr[] = {2,1,3,2};
		System.out.println(solution(arr,2));
	}
}
