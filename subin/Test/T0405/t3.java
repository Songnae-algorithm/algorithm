package T0405;

import java.util.*;

public class t3 {
	
    public static int solution(String road, int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(road);
        
        int ck = 0;
        for(int i=0;i<road.length(); i++) {
        	if(road.charAt(i) == '0')
        		ck++;
        }
        
        if(ck <=n)
        	return road.length();
        
        int lock = 0;
        LinkedList<Integer> zero_idx_list = new LinkedList<>();
        
        for(int i=0; i<road.length(); i++) {
        	char zero_chk = road.charAt(i);
        	
        	if(zero_chk == '0') {
//        		System.out.println("전 =" + sb);
        		
	        	if(lock <n) {
	        		sb.replace(i, i+1, "1");
	        		zero_idx_list.add(i);
	        		lock++;//와 씨 락을 걸어줬으면서 어떻게 lock을 ++을 안해줘....
	        	}
	        	
	        	else {//lock을 옮겨준다
	        		int zero_first_idx = zero_idx_list.removeFirst();
	        		sb.replace(zero_first_idx, zero_first_idx+1, "0");
	        		sb.replace(i, i+1, "1");
	        		zero_idx_list.add(i);
	        	}
	        	
//        		System.out.println("후 =" + sb);
//        		System.out.println();
        	}//if
        	
        	//다 옮겨주고 나와서 연속 1의 개수 확인
        	String sr = sb.toString();
        	String res[] = sr.split("0");
        	
        	for(int j=0; j<res.length; j++) {
        		answer = Math.max(answer, res[j].length());
        	}
        	
        }//for
        
        
        return answer;
    }
	
	public static void main(String[] args) {
//		String s = "111011110011111011111100011111";
		String s = "111011110011111011111100011111";
		
		System.out.println(solution(s,3));
	}
}
