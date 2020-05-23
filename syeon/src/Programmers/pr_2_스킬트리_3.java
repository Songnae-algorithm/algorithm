package Programmers;

import java.util.*;

public class pr_2_스킬트리_3 {

	public static int solution(String skill, String[] skill_trees) {

		int answer = 0;

		Character s[] = new Character[skill.length()];

		for (int i = 0; i < skill.length(); i++) {
			s[i] = skill.charAt(i);

		} // skill을 순서대로 넣음

		for (int i = 0; i < skill_trees.length; i++) {
			boolean chk = true;
			int idx = 0;// skill이 순서대로 가고 있는지 체크할 인덱스

			for (int j = 0; j < skill_trees[i].length(); j++) {

				for (int k = 0; k < s.length; k++) {
					if (skill_trees[i].charAt(j) == skill.charAt(k)) {
						// 스킬트리의 j번째가 skill의 k번째랑 똑같은 경우에 !
						// BACDE일 경우에, skill.charAt(1)인 B와 젤 첨에 만나고, 이 때 idx 는 0 이라서 일치하지 않음. 따라서 false
						// CBADF 일 경우,  skill.charAt(0) (k=0) 일 떄 처음 만나고, idx =0이다.
						// CBADF 에서 skill.charAt(1) (k=1) 일 때, B 이고, skill의 1번쨰랑 똑같음. D도 마찬가지로 쭉 내려가고 false에 걸리지 않음 !
						
						//System.out.println(k + " " + idx + " " + skill_trees[i]);
						if (k != idx) {
							chk = false;
						

						} else {
							idx++;
						}

					}
				}

			}

			if (chk == true) {
				answer++;
			}
		}

		//System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		String s[] = { "BACDE", "CBADF", "AECB", "BDA" };

		solution("CBD", s);
	}

}
