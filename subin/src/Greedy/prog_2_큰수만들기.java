package Greedy;

import java.util.*;

public class prog_2_ū������� {

    static public String solution(String number, int k) {
    	String answer = "";
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(number);
    	
    	int idx=1;
    	
    	//������ �ι�°�� ù��° idx�� �񱳷� �Ѵ�.
    	while(k!=0) {
    		if(idx >= 1 &&sb.charAt(idx)>sb.charAt(idx-1)) {
    			//idx-1 < idx
				sb.deleteCharAt(idx-1); // idx-1��°�� �����ϱ� ����������
				idx = idx-1; //�ϳ� ��������ϱ� ������ idx �Ѱ� ����
				k--; //�������ϱ� k�� --
				
    		}
			else {//1)idx==0 OR  2)idx-1 >= idx OR 3)idx==0 && idx-1 >= idx ...���� case
				// idx�� ������ �����̸鼭 + 2)���� �ݴ� idx�� �۰� idx-1�� Ŭ ���� ���� ��
				if(idx == sb.length()-1 && sb.charAt(idx) <= sb.charAt(idx-1)) {
					sb.deleteCharAt(idx);
					idx = idx-1; // �ǵڰ� ���������ϱ� idx ��ĭ ����
					k--;
				}
				else {//idx�� �������� �ƴϰ� idx-1>=idx �� ���  OR idx�� �������̰� idx>idx-1
					idx = idx+1;
				}
			}
    		
    	}//while
    	
    	answer = String.valueOf(sb);
    	
    	return answer;
    }
    
    public static void main(String[] args) {
    	String a = "1231234";
    	System.out.println(solution(a,3));
	}
}