package Max_Min;

import java.util.*;
import java.util.stream.Collectors;

public class prog_2_�ּڰ������ {

    static public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A); // ���� -> ū ������ ����
        Arrays.sort(B);

        for(int i=0;i<A.length;i++) {
        	answer = answer + (A[i] * B[B.length-i-1]);
        }
                
        return answer;
    }
    
    public static void main(String[] args) {
		int a[] = {1,4,2};
		int b[] = {5,2,8,0};
		solution(a,b);
    	
	}
	
}
