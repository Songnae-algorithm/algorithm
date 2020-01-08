package Heap;

import java.util.*;

public class prog_2_������ {

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        //������ ���������� pq�� ������������ �ٲ��ش�.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        int idx = 0; //dates�� ������ŭ�� �۵��ϰ� �Ѵ�. i�� Ȱ���ϸ� k-1���� ���ϱ� �ٸ� ���� ����ؾ���
        
        for(int i=0;i<k;i++) {//i�� �Ϸ��Ϸ� ������ ��¥, k-1��ŭ�� ����.
        	//�� �����ʾƵ� dates[3]�� �˻��ϸ鼭 �̹� error!!!!
        	if(idx < dates.length &&i == dates[idx]){//dates�� ���ĵǾ������Ƿ� dates[0], dates[1], dates[2]..
        		pq.offer(supplies[idx]); // ���� ��ġ�� �ִ� supplies[0], supplies[1],,,�� pq�� �ְ�
        		idx++;//���� data�� ���� idx�� ������Ų��.
        	}
        	
        	if(stock == 0) {//0�� �Ǹ� ���ο� pq�� ���ο� supplies�� �����ؾ��ϰ� �̶� �Ǿտ��ִ� ���� ���� ũ�Ƿ� stock�� ������
        		stock = stock+ pq.poll();
        		answer++; //pq���� ���� ������ �ؿܿ��� �����ؿ��� ���̱⋚���� answer+1
        	}
        	
        	//for�� �ѹ� �������� ������ stock�� -1
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
