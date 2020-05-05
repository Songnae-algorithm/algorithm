package Math;

import java.util.*;
public class prog_1_다트게임 {
	  public int solution(String dartResult) {
	      int answer = 0;
	      LinkedList<Integer> list = new LinkedList<>();
	      
	      //무조건 숫자 + STD + * 
	      for(int i=0; i<dartResult.length(); i++){
	          char c = dartResult.charAt(i);
	          
	          if(c =='0' || c =='1' ||c =='2' ||c =='3' ||c =='4' ||c =='5' ||c =='6' ||c =='7' ||c =='8' ||c =='9'){
	              if(i+1 <dartResult.length() && dartResult.charAt(i+1) =='0'){
	                  list.add(10);               
	                  i++;
	              }
	              else
	                  list.add(Integer.parseInt(String.valueOf(c)));
	          }
	          
	          else if(c == 'T'|| c == 'D' || c=='S'){
	              if(c == 'D'){
	                  int n = list.removeLast();
	                  list.add(n*n);
	              }
	              else if(c == 'T'){
	                  int n = list.removeLast();
	                  list.add(n*n*n);
	              }   
	          }
	          
	          else{
	              if(c == '*'){
	                  if(list.size()==1){
	                      int n = list.removeLast();
	                      list.add(n*2);
	                  }
	                  else if(list.size()>=2){
	                      int n1 = list.removeLast();
	                      int n2 = list.removeLast();
	                      
	                      list.add(n2*2);
	                      list.add(n1*2);
	                  }
	              }
	              
	              if(c == '#'){
	                  int n = list.removeLast();
	                  list.add(n*-1);
	              }
	          }    
	      }
	      
	      for(int i=0; i<list.size(); i++)
	          answer += list.get(i);
	      
	      return answer;
	  }
}
