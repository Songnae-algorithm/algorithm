package String;

import java.util.*;

public class prog_2_영어끝말잇기 {
	
	static public int[] solution(int n, String[] words) {
		int answer[] = new int[2];
		ArrayList<String> list = new ArrayList<String>();
		boolean chk = false;
		
		int number = 0;
		
		for(int i=0; i<words.length-1; i++) {
			number++;
			if(list.contains(words[i+1])) {
				chk = true;
				break;
			}
			
			list.add(words[i]);
			if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
				chk = true;
				break;
			}	
		}
        
        
		if(chk == false) {
			answer[0] = 0;
			answer[1] = 0;
		}
		else {
			answer[0] = number%n +1;
            answer[1] = number/n +1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String a[]={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		solution(3,a);
	}
}

