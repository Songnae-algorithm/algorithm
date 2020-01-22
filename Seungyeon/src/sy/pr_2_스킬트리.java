package sy;


public class pr_2_스킬트리 {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (int i = 0; i < skill_trees.length; i++) {
			boolean chk = true;
			skill_trees[i] = skill_trees[i].replaceAll("[^" + skill + "]", "");
			// skill이 들어간 문자열을 모두 공백으로 치환

			for (int j = 0; j < skill_trees[i].length(); j++) {
				if (skill_trees[i].charAt(j) != skill.charAt(j)) {
					// 스킬트리의 값과 skill의 값이 다르면 false
					chk = false;
				}

			}

			if (chk == true) {// true일 때 answer++
				answer++;

			}
		}

		return answer;

	}

	public static void main(String[] args) {

		String skill = "CBD";
		String st[] = { "BACDE", "CBADF", "AECB", "BDA" };
		solution(skill, st);
	}

}
