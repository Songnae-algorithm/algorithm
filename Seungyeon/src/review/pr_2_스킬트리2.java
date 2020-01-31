package review;

import java.util.*;

public class pr_2_스킬트리2 {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		Character[] sk = new Character[skill.length()];

		for (int i = 0; i < skill_trees.length; i++) {
			boolean chk = true;
			skill_trees[i] = skill_trees[i].replaceAll("[^" + skill + "]", "");

			// 정규표현식 알아두기

			for (int j = 0; j < skill_trees[i].length(); j++) {

				if (skill_trees[i].charAt(j) != skill.charAt(j)) {
					chk = false;
					// 같지 않으면 false

				}
			}
			if (chk == true) {
				answer++;
			}

		}
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		String skill = "CBD";
		String st[] = { "BACDE", "CBADF", "AECB", "BDA" };
		solution(skill, st);
	}

}
