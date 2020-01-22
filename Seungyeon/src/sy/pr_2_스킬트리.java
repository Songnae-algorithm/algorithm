package sy;

import java.util.*;

public class pr_2_스킬트리 {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		boolean chk = true;

		
		char arr[]=new char[skill.length()];
		
		for(int i=0;i<skill.length();i++) {
			arr[i]=(skill.charAt(i));//arr에 skill을 한 글자씩 넣음
		}
		
		while(true) {
		
			for (int i = 0; i <arr.length(); i++) {
				char test = skill_trees[i].charAt(0);

				if ((skill.charAt(0) != test) && (skill.contains(Character.toString(test)))) {
					continue;
				} else {
					answer += 1;
				}

	}

	public static void main(String[] args) {

		String skill = "CBD";
		String st[] = { "BACDE", "CBADF", "AECB", "BDA" };
		solution(skill, st);
	}

}
