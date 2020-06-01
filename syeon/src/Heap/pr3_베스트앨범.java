package Heap;

import java.util.*;

public class pr3_베스트앨범 {

	public static int[] solution(String[] genres, int[] plays) {
		// 0601 20:34 - 22:10

		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		TreeMap<Integer, String> cnt = new TreeMap<>(Collections.reverseOrder());// 트리맵은 키값으루 자동정렬. 근데 큰값부터 정렬해야하니까
																					// reverseOrder 추가
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < genres.length; i++) {
			String key = genres[i];//

			ArrayList<Integer> value = new ArrayList<>();

			if (map.containsKey(key)) { // key값(genres[i])이 이미 있으면 원래의 list에 추가
				value = map.get(key);// 원래의 value 를 가져옴
			}
			value.add(plays[i]); // plays[i]를 넣음

			map.put(key, value);
			value.sort(null);
			Collections.reverse(value);// 처음에 그냥 reverse로 써서 틀렸다....이건 걍 입력하고 거꾸로출력만 하는거.그래서 위에서 정렬을 한번 하고 역순으로

		}
		// 맵에 pop =[600,2500] 이런식으로 입력
		System.out.println(map);

		for (String key : map.keySet()) {// key 만큼 돌음
			ArrayList<Integer> sum = new ArrayList<>();

			sum = map.get(key);// value 값
			int a = 0; // 각 리스트(key)값 별로 합을 더해줄 것

			for (int i = 0; i < sum.size(); i++) {
				a += sum.get(i);
			}
			cnt.put(a, key);// <K,V>에서 key 자리에 각각의 합을 넣고, value에는 위에서 얻은 키(장르) 입력 --> treemap이용해서 정렬 쉽게하기 위함

		}
		// list 돌면서 더한 횟수를 cnt에 넣기

		for (int key : cnt.keySet()) {
			String a = cnt.get(key);// pop,classic ....

			for (String mapkey : map.keySet()) {
				if (mapkey.equals(a)) { // map의 key값이 a랑 같을 때
					if (map.get(mapkey).size() == 1) {// size가 1이면 1개만 넣음
						ans.add(map.get(mapkey).get(0));
					} else {
						ans.add(map.get(mapkey).get(0));
						ans.add(map.get(mapkey).get(1));
						// 가장 큰 2개만 넣어야 하니까 0,1번째 값을 넣어준다.
					}
				}
			}
		}
		System.out.println(ans);
		int[] answer = new int[ans.size()];

		boolean chk[]=new boolean[plays.length];
		
		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < plays.length; j++) {
				if (!chk[j]&&ans.get(i).equals(plays[j])) {
					answer[i] = j;
					chk[j]=true;
					
					break;
				}
			}
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		String a[] = { "classic", "pop", "classic", "classic", "pop" };
	int b[] = { 500, 600, 150, 800, 2500 };//4130
		// int b[] = { 500, 600, 502, 800, 900 }; // 3241

//		String aa[] = { "classic", "pop", "classic", "pop", "classic", "classic" };
//		int bb[] = { 400, 600, 150, 2500, 500, 500 };// 3145
		solution(a, b);
	}

}
