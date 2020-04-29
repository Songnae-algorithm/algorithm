package Hash;

import java.util.*;

public class pr1_완주하지못한선수2 {

	// 4/24 23:19 23:43
	// 해시로도 풀어볼 것... 해시 공부하기

	public static String solution(String[] participant, String[] completion) {

	
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		


		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
				break;
			}
		}

		return participant[i];
	}

	public static void main(String[] args) {

//		String a[] = { "leo", "kiki", "eden" };
//		String b[] = { "eden", "kiki" };
//		solution(a, b);
//
		String c[] = { "mislav", "stanko", "mislav", "ana" };
		String d[] = { "stanko", "ana", "mislav" };
		solution(c, d);
//
//		String d[] = { "marina", "josipa", "nikola", "vinko", "filipa" };
//		String e[] = { "josipa", "filipa", "marina", "nikola" };
//		solution(d, e);

	}

}
