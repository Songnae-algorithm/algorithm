package BFS_DFS;

import java.util.*;

public class pr3_단어변환 {

	static int ans = Integer.MIN_VALUE;

	private static void dfs(String[] words, boolean[] visit, String start, String target, int cnt) {

		for (int i = 0; i < words.length; i++) {
			if (start.equals(target)) {
				ans = Math.max(ans, cnt);

				return;
			}
			//target이랑 같아지면 값 리턴

			if (visit[i] == true) {
				continue;
			}
			
			int chk = 0;
			for (int j = 0; j < target.length(); j++) {

				if (words[i].charAt(j) != start.charAt(j)) {
					chk++;
				}//start랑 다른값들이랑 다른 문자의 갯수를 세줌
			}

			if (chk == 1 && visit[i] == false) {// 한개만 다르고 방문 안했을때 
				start = words[i]; // 시작을 한개만 다른값으로 바꿔줌

				visit[i] = true;// 방문했음

				dfs(words, visit, start, target, cnt + 1);

			}
		}
	}

	public static int solution(String begin, String target, String[] words) {
		int answer = 0;

		int min = Integer.MAX_VALUE;
		boolean visit[] = new boolean[words.length];

		for (int i = 0; i < words.length; i++) {

			if (words[i].equals(target)) {// target 이랑 같은게 있는 경우에
				dfs(words, visit, begin, target, 0);

			}
		}
		answer = ans;

		return answer;

	}

	public static void main(String[] args) {

		String str[] = { "hot", "dot", "dog", "lot", "log", "cog" };

		solution("hit", "cog", str);
	}

}
