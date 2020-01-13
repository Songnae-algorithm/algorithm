package Greedy;

import java.util.*;

public class prog_2_큰수만들기 {

    static public String solution(String number, int k) {
    	String answer = "";
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(number);
    	
    	int idx=1;
    	
    	//시작은 두번째와 첫번째 idx를 비교로 한다.
    	while(k!=0) {
    		if(idx >= 1 &&sb.charAt(idx)>sb.charAt(idx-1)) {
    			//idx-1 < idx
				sb.deleteCharAt(idx-1); // idx-1번째는 작으니까 지워버리기
				idx = idx-1; //하나 사라졌으니까 앞으로 idx 한개 당기기
				k--; //지웠으니까 k도 --
				
    		}
			else {//1)idx==0 OR  2)idx-1 >= idx OR 3)idx==0 && idx-1 >= idx ...많은 case
				// idx가 마지막 원소이면서 + 2)위의 반대 idx가 작고 idx-1이 클 때와 같을 때
				if(idx == sb.length()-1 && sb.charAt(idx) <= sb.charAt(idx-1)) {
					sb.deleteCharAt(idx);
					idx = idx-1; // 맨뒤가 없어졌으니까 idx 한칸 당기기
					k--;
				}
				else {//idx가 마지막이 아니고 idx-1>=idx 일 경우  OR idx가 마지막이고 idx>idx-1
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