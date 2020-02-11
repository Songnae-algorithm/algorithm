package Stack_Queue;

import java.util.*;

public class prog_2_캐시 {

	//은근 잔 조건들이 많네...; 40min
	  static public int solution(int cacheSize, String[] cities) {
	      int answer = 0;
	      LinkedList<String> qu = new LinkedList<String>();
	      
	      String real[] = new String[cities.length];
	      
	      for(int i=0;i<cities.length; i++)
	    	  real[i] = cities[i].toUpperCase();
	      
	      if(cacheSize == 0)
	    	  return cities.length * 5;
	      
	      for(int i=0;i<cities.length; i++) {
	    	  String an = real[i];
	    	  System.out.println(an);
	    	  
	    	  if(qu.size() < cacheSize) {
	    		  if(qu.contains(an)) {
	    			  int idx = qu.indexOf(an);// 위치 찾아서
	    			  qu.remove(idx); // 제거하고
	    			  qu.add(an); //위에 새로 추가
	    			  
	    			  answer = answer+1;
	    		  }
	    		  else {
	    			  qu.add(an); //위에 새로 추가 
	    			  answer = answer +5;
	    		  }
	    	  }
	    	  
	    	  else if( qu.size() >= cacheSize){
	    		  if(qu.contains(an)) {
	    			  int idx = qu.indexOf(an);// 위치 찾아서
	    			  qu.remove(idx); // 제거하고
	    			  qu.add(an); //위에 새로 추가
	    			  
	    			  answer = answer+1;
	    		  }
	    		  else {
	    			  qu.remove(0); //맨 앞이 제일 오래된 데이터
	    			  qu.add(an); //위에 새로 추가 
	    			  answer = answer +5;
	    		  }	    		  
	    	  }
	    	  
	      }//for
	      
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		String s[] = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.println(solution(3, s));
	  }
	  
}
