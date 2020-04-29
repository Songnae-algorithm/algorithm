package Programmers;

public class pr1_문자열내p와y의개수 {
	
	//4/28 14:55 15:03
	// 대문자 소문자 둘 다 조건에 추가 ~ 

	static boolean solution(String s) {
		boolean answer = true;
		int pcnt=0;
		int ycnt=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='p' ||s.charAt(i)=='P' ) {
				pcnt++;
			}if(s.charAt(i)=='y'||s.charAt(i)=='Y') {
				ycnt++;
			}
			
		}
		
		if(pcnt!=ycnt) {
			answer=false;
		}

		return answer;
	}

	public static void main(String[] args) {
		solution("pPoooyY");
		
	}

}
