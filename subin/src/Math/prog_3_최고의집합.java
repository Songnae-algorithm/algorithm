package Math;

import java.util.Arrays;

public class prog_3_최고의집합 {

	  public int[] solution(int n, int s) {
	      int[] answer = new int[n];
	      
	      if(n>s)
	    	  return new int[] {-1}; //바로 새로 생성해서 return 해주기
	      
	      for(int i=0; i<n; i++)
	    	  answer[i] = s/n; //집함 크기만큼에, s/n을 넣어준다. 여기서 -1 +1 해주는게 가장 큰수가 나올 가능성 높음
	      
	      int g = s- (s/n)*n; //나머지만큼 +1씩 해준다
	      
	      if(g == 0) //딱 떨어지면 중복도 가능한거고 합이 딱떨어진다는거니까
	    	  return answer;
	      
	      for(int i=0; i<g; i++)
	    	  answer[i] = answer[i] +1;
	      
	      Arrays.sort(answer);
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		
	}
}
