import java.util.*;
import java.util.stream.Collectors;

public class Review {

		static public String solution(String s) {
		String a = "";  
		s = s.toLowerCase();
		
		boolean check = false; // i+1이 문자가 아니라는 뜻
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == ' ') {
				if(i==0)
					a = a + " ";
				//i+1 추가
				if(s.charAt(i+1) != ' ' && check==false) {
					a = a + String.valueOf(s.charAt(i+1)).toUpperCase();
					check=true; //문자가 시작되었다는 뜻
				}
				else if(s.charAt(i+1) == ' ')
					a = a + " ";
			}
			
			else{ // 문자인 경우
				if(i==0)
					a = a + String.valueOf(s.charAt(i)).toUpperCase();
				
				if(s.charAt(i+1) == ' ') {
					a = a + " ";
					check=false; //다시 첫 문자가 시작될때까지 
				}
				else //다음 글자도 문자인 경우
					a = a + String.valueOf(s.charAt(i+1));
				
				
			}
		}//for
		
	    return a;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		
	}
}
