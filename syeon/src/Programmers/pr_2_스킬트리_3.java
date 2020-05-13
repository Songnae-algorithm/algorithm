package Programmers;

import java.util.*;

public class pr_2_스킬트리_3 {

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		Character s[] = new Character[skill.length()];
		for (int i = 0; i < s.length; i++) {
			s[i] = skill.charAt(i);
		}
		boolean chk[] = new boolean[skill_trees.length];

		for (int i = 0; i < skill_trees.length; i++) {
			for (int j = 0; j < skill_trees[i].length(); j++) {
				
			}
		}
		for (int i = 0; i < skill_trees.length; i++) {
			System.out.println(skill_trees[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		String s[] = { "BACDE", "CBADF", "AECB", "BDA" };

		solution("CBD", s);
	}

}
