package Number_Change;

import java.util.*;

public class prog_2_124���� {

	static public String solution(int n) {
	      String answer = "";
	      
	      int rest = 0;
	      while(n>0) {
	    	 //rest�� 0�϶��� �ƴҶ��� �����ؼ� ������ �ذ��Ѵ�.
	    	 rest = n%3;
	    	 n = n/3;
	    	 
	    	 //������ �������� ������ 0,1,2 �� �ϳ���
	    	 if(rest==0) {
	    		 rest = 4; // �ؿ��� �����ٰŴϱ� 4�� �ٲ��ְ�
	    		 n = n-1; // ����  3%3 6%3 9%3 ���� �� ��  �ʿ�
	    	 }
	    	 
	    	 answer = rest + answer;
	    	  
	      }
	      
	      
	      return answer;
	}
	
	  
	public static void main(String[] args) {
	
		System.out.println(solution(11));
	}
}
